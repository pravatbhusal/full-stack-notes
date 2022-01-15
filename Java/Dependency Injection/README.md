# Dependency Injection
This project uses Maven, to install the Guice dependencies for this Java project execute ```mvn install```.

---

Dependency Injection (DI) is a technique where an Object will receive other Objects that it depends on. This can be done through injecting that
dependent Object using a library such as Google Guice or Spring.

Read here for the difference between the two libraries: https://www.baeldung.com/guice-spring-dependency-injection. They are essentially the same thing, but it's recommended to use Spring's tools if you're making a Spring application

This repository will use Google Guice because it's simpler to show-case the concept of DI. Google Guice accomplishes DI by binding classes using a Guice Module, creating an Injector using the module, and receiving instances of an Object through the Injector.


### 1. Binding using Guice Module
We can specify the bindings of a class in a Guice Module.

For instance, let's say we have an Engine interface that is implemented by a V8 Engine and a V6 Engine. We can create a binding that will always
bind all classes that use the Engine interface to be a V8Engine.

```java
bind(Engine.class).to(V8Engine.class);
```

The code above will ensure that all classes that use the Engine interface will use the V8 Engine.

Now there's another way we can implement binding by using a binding technique called @ImplementedBy.

```java
@ImplementedBy(V8Engine.class)
public interface Engine {

}
```

This forces all classes that inject an Engine implementation to always use the V8Engine. This is a quick and easy implementation, but it won't be
scalable because it'll be difficult to track which implementation is being used for multiple classes.

Now the question is of precedence, so if we have a bind() and an @ImplementedBy for the Engine interface, which will be used? The binding is actually
of higher precedence, so the bind() will be used instead of the ImplementedBy. However, this means ImplementedBy can be useful for creating default
bindings.

Here's what I mean:

```java
@ImplementedBy(V6Engine.class)
public interface Engine {

}

// GuiceModule.java
bind(Engine.class).to(V8Engine.class);
```

Guice will always bind the Engine to a V8Engine class because the bind() method takes precedence.

### 2. Injecting using Injector
We can inject dependencies using the @Inject annotation in Guice, and then creating an Injector using a Guice Module.

For instance, let's say we have a Toyota Camry class, and we know all Toyota Camry objects are dependent on having a V8 Engine. Therefore, we can
inject a V8 Engine object into the Toyota Camry object without having to ever instantiate the V8 Engine object and passing it into the Toyota Camry.

This is without dependency injection:

```java
class ToyotaCamry {
	V8Engine engine;
	public ToyotaCamry(V8Engine engine) {
		this.engine = engine;
	}
}

// Main.java
V8Engine engine = new V8Engine();
ToyotaCamry camry = new ToyotaCamry(engine);
```

This is with dependency injection:

```java
class ToyotaCamry {
	V8Engine engine;
	
	@Inject
	public ToyotaCamry(V8Engine engine) {
		this.engine = engine;
	}
}

// Main.java
Injector guice = Guice.createInjector(new EngineGuiceModule());
ToyotaCamry camry = guice.getInstance(ToyotaCamry.class);
```

### 3. Conditionally binding using Provider
We can create our own [Provider class](https://www.tutorialspoint.com/guice/guice_provider_class.htm), but this tutorial will only go through the Guice's own @Provides annotation to make simple Providers.

Using @Provides annotation, we don't need to program bindings because we can create a method to provide the Object into any class that injects the Object. For example, let us say a car has different colors of black or white based on the season's weather, and the Toyota Camry injects a Color then the Provider can provide the color for the Toyota Camry.

```java
@Provides
public Color color() {
	final String SEASON = value received from somewhere;
	if (SEASON == "Winter") {
		return new White();
	}
	return new Black();
}

class ToyotaCamry {
	V8Engine engine;
	Color color;
	
	@Inject
	public ToyotaCamry(V8Engine engine, Color color) {
		this.engine = engine;
		this.color = color;
	}
}
```

Note that there can only be a single instance of Color, or else Guice will throw a "Guice/BindingAlreadySet colors.Color was bound multiple times" exception. Therefore, we we cannot have 2 or more providers for the same type. However, there is an exception to this rule using the @Named annotation, which is explained later in this guide.

Note that we also cannot provide parameters into the Provider method except for injected parameters.

### 4. Singleton
Guice returns a new instance every time when it supplies a dependency as its default behavior. A singleton can be used to ensure that a class has only
one instance and provides a global point of access to it. This saves memory and creates a single global instance that can be accessed by the application.

Let's say that all cars must be registered by the US Department of Motor Vehicles (DMV), so the DMV is a single instance (singleton) that does that registers cars.

```java
@Singleton
class DMV {
	List<Car> registeredCars;
	
	public void register(Car car) {
		registeredCars.add(car):
	}
}

class ToyotaCamry implements Car {
	V8Engine engine;
	Color color;
	DMV dmv;
	
	@Inject
	public ToyotaCamry(V8Engine engine, Color color, DMV dmv) {
		this.engine = engine;
		this.color = color;
		this.dmv = dmv;
	}
}

// GuiceModule.java
bind(Engine.class).to(V8Engine.class);
```

We do not have to bind the DMV class in the Guice Module since it's a singleton, so there's only one single instance of it that can be injected into the ToyotaCamry.

### 5. Named bindings
We can have multiple @Provides using the @Named annotation. The @Named annotation allows us to map bindings without creating a custom annotation.

Let's use the @Named annotation to create named Providers and then utilize it in a Provider itself.

```java
@Provides
@Named("winterSeason")
public String winterSeason() {
	return "Winter"
}

@Provides
@Named("summerSeason")
public String summerSeason() {
	return "Summer";
}

@Provides
public Color color(@Named("winterSeason") String season) {
	if (season == "Winter") {
		return new White();
	}
	return new Black();
}
```

The above example will use the winterSeason in the color Provider.

### 6. Assisted Inject
Sometimes a class gets some of its constructor parameters from the Guice injector and others from the caller of the class. The standard solution to
this problem is to write a factory that helps Guice build the objects, but it's annoying to write the factory class each time this situation arises. Assisted injection generates the implementation of the factory class automatically.

Now let's use an example of a HondaCivic instead of a ToyotaCamry. Let's say a HondaCivic needs to get a specified price from the caller while the rest of the parameters can be injected by Guice. We can use the @Assisted annotation on the price because we're expecting to receive it from the caller.

```java
class HondaCivic implements Car {
	V8Engine engine;
	Color color;
	DMV dmv;
	int price;
	
	@Inject
	public HondaCivic(V8Engine engine, Color color, DMV dmv, @Assisted int price) {
		this.engine = engine;
		this.color = color;
		this.dmv = dmv;
		this.price = price;
	}
}

public interface CarPriceFactory {
	public HondaCivic create(int price);
}

// GuiceModule.java
install(new FactoryModuleBuilder()
		.implement(Car.class, HondaCivic.class)
		.build(HondaCivic.HondaCivicFactory.class));

// Main.java
HondaCivicFactory civicFactory = guice.getInstance(HondaCivicFactory.class);
HondaCivic civic = civicFactory.create(25000);
```

Now this specific instance of the Honda civic has the price of 25000.

### Guice vs Spring
1. Guice uses a Guice Module to specify the bindings, a similar concept exists in Spring using the @Configuration annotation.

2. Guice uses binding to instantiate dependencies, a similar concept exists in Spring using the @Component annotation.

3. Guice uses @Inject to specify which dependencies to inject, a similar concept exists in Spring using the @Autowire annotation. Spring can also use @Inject since it's a Java standard, and they work the exact same.

4. Guice uses @Provides to conditionally decide on an instance of an interface or class using a method, a similar concept exists in Spring using the @Bean annotation.

5. Guice uses @Named to name a binding or Provider, a similar concept exists in Spring using the @Qualifier annotation.