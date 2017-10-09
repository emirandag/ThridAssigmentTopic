/**
 * 
 */
package org.escoladeltreball.thridassigmenttopic;

/**
 * @author iaw26540084
 *
 */
public final class Samsung extends Tablet {

	/**
	 * @param marca
	 * @param model
	 * @param speed
	 */
	public Samsung(String marca, String model, int speed) {
		super(marca, model, speed);		
	}
	
	public Samsung(String marca, String model) {
		super(marca, model, 180);
	}
	
	public void turnOff() {
		System.out.println("clickint inicio to turn off");
	}

}
