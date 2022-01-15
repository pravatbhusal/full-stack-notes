package cars;

import com.google.inject.Inject;

import colors.Color;
import engines.Engine;
import government.DMV;

public class ToyotaCamry implements Car {

	private final Engine engine;
	private final Color color;
	private final DMV dmv;
	
	/**
	 * This is the constructor for the ToyotaCamry, which injects objects into the class.
	 * 
	 * @param engine an engine that is injected into the class
	 * @param color a color that is injected into the class
	 * @param dmv the DMV singleton that is injected into the class
	 */
	@Inject
	public ToyotaCamry(Engine engine, Color color, DMV dmv) {
		this.engine = engine;
		this.color = color;
		this.dmv = dmv;
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void register() {
		dmv.register(this);
	}
	
	public boolean isRegistered() {
		return dmv.isRegistered(this);
	}
}
