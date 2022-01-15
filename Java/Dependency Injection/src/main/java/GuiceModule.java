

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.assistedinject.FactoryModuleBuilder;
import com.google.inject.name.Named;

import cars.Car;
import cars.HondaCivic;
import engines.Engine;
import engines.V8Engine;
import colors.Black;
import colors.Color;
import colors.White;

/**
 * The GuiceModule is where the bindings occur without having to create boilerplate factory code to instantiate classes.
 * This module below is specifically for the Engine, so in this case it always inject the V8Engine to any class that uses this module.
 * 
 * @author pravatbhusal
 * 
 */
public class GuiceModule extends AbstractModule {

	@Override
	protected void configure() {
		// Bind the Engine interface to the V8Engine, so this means any class that is instantiated with this GuiceModule will use the V8Engine
		bind(Engine.class).to(V8Engine.class);
		
		// Create a factory from the HondaCivicFactory interface, which can be used to instantiate a HondaCivic with assisted parameters
		install(new FactoryModuleBuilder()
				.implement(Car.class, HondaCivic.class)
				.build(HondaCivic.HondaCivicFactory.class));
	}
	
	/**
	 * An example of conditionally binding a class to the Color interface based on the season.
	 * 
	 * @season a named season that will be injected into this Provider, in this case it's the winterSeason
	 * @return a color based on the season
	 */
	@Provides
	public Color color(@Named("winterSeason") String season) {
		if (season == "Winter") {
			return new White();
		}
		return new Black();
	}
	
	/**
	 * An example of a Provider that is named for the Winter season.
	 * 
	 * @return the winter season string
	 */
	@Provides
	@Named("winterSeason")
	public String winterSeason() {
		return "Winter";
	}
	
	/**
	 * An example of a Provider that is named for the Summer season.
	 * 
	 * @return the summer season string
	 */
	@Provides
	@Named("summerSeason")
	public String summerSeason() {
		return "Summer";
	}
}
