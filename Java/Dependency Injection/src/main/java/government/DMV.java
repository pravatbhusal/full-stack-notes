package government;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.Singleton;

import cars.Car;

/**
 * This is an example of a Singleton class, which Guice will use the same single instance when injecting it.
 * 
 * @author pravatbhusal
 */
@Singleton
public class DMV {
	private final List<Car> registeredCars;
	
	public DMV() {
		this.registeredCars = new ArrayList<>();
	}
	
	public void register(Car car) {
		registeredCars.add(car);
	}
	
	public boolean isRegistered(Car car) {
		return registeredCars.contains(car);
	}
}
