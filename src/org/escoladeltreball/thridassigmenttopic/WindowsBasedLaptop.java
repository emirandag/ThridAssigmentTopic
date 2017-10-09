/**
 * 
 */
package org.escoladeltreball.thridassigmenttopic;

/**
 * @author iaw26540084
 *
 */
public final class WindowsBasedLaptop extends Labtop {

	/**
	 * @param marca
	 * @param model
	 * @param speed
	 */
	public WindowsBasedLaptop(String marca, String model, int speed) {
		super(marca, model, speed, LabtopType.HEAVY);
	}

	/**
	 * @param marca
	 * @param model
	 */
	public WindowsBasedLaptop(String marca, String model) {
		this(marca, model, 258);
	}
	
	/* (non-Javadoc)
	 * @see org.escoladeltreball.thridassigmenttopic.Device#turnOff()
	 */
	@Override
	public void turnOff() {
		System.out.println("clickint inicio to turn off");
	}

}
