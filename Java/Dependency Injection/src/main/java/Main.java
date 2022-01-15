import com.google.inject.Guice;
import com.google.inject.Injector;

import cars.HondaCivic;
import cars.ToyotaCamry;

public class Main {

	public static void main(String[] args) {
		Injector guice = Guice.createInjector(new GuiceModule());
		toyotaCamry(guice);
		hondaCivic(guice);
	}
	
	private static void toyotaCamry(Injector guice) {
		ToyotaCamry camry = guice.getInstance(ToyotaCamry.class);
		
		// This will return "The engine model for this ToyotaCamry is: V8 Engine"
		System.out.println("The engine model for this ToyotaCamry is: " + camry.getEngine().getModel());
		
		// This will return "The color for this ToyotaCamry is: #FFFFFF"
		System.out.println("The engine model for this ToyotaCamry is: " + camry.getColor().getHex());
		
		// This will return "Is this ToyotaCamry registered: false"
		System.out.println("Is this ToyotaCamry registered: " + camry.isRegistered());
		
		// This will return "Is this ToyotaCamry registered: true"
		camry.register();
		System.out.println("Is this ToyotaCamry registered: " + camry.isRegistered());
	}
	
	private static void hondaCivic(Injector guice) {
		HondaCivic.HondaCivicFactory civicFactory = guice.getInstance(HondaCivic.HondaCivicFactory.class);
		HondaCivic civic = civicFactory.create(25000);
		
		// This will return "The price for this HondaCivic is: 25000"
		System.out.println("The price for this HondaCivic is: " + civic.getPrice());
	}
	
}
