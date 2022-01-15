package cars;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;

import colors.Color;
import engines.Engine;
import government.DMV;

public class HondaCivic implements Car {

	private final Engine engine;
	private final Color color;
	private final DMV dmv;
	private final int price;
	
	/**
	 * This is the constructor for the HondaCivic, which injects objects into the class.
	 * 
	 * @param engine an engine that is injected into the class
	 * @param color a color that is injected into the class
	 * @param dmv the DMV singleton that is injected into the class
	 * @param price a price that is received by the caller
	 */
	@Inject
	public HondaCivic(Engine engine, Color color, DMV dmv, @Assisted int price) {
		this.engine = engine;
		this.color = color;
		this.dmv = dmv;
		this.price = price;
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public Color getColor() {
		return color;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void register() {
		dmv.register(this);
	}
	
	public boolean isRegistered() {
		return dmv.isRegistered(this);
	}
	
	/**
	 * A factory interface for the HondaCivic to use with Assisted Inject.
	 * 
	 * @author pravatbhusal
	 * 
	 */
	public interface HondaCivicFactory {
		HondaCivic create(int price);
	}
}
