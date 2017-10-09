/**
 * 
 */
package org.escoladeltreball.thridassigmenttopic;

/**
 * @author iaw26540084
 *
 */
public class IpadTablet extends Tablet {

	/**
	 * @param marca
	 * @param model
	 * @param speed
	 */
	public IpadTablet(String marca, String model, int speed) {
		super(marca, model, speed);
	}

	public IpadTablet(String marca, String model) {
		super(marca, model, 120);
	}
	
	public void turnOff() {
		System.out.println("clickint inicio to turn off");
	}
}
