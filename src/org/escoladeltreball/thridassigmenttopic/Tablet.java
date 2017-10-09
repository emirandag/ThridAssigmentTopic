/**
 * 
 */
package org.escoladeltreball.thridassigmenttopic;

/**
 * @author iaw26540084
 *
 */
public abstract class Tablet extends DeviceImpl {

	/**
	 * @param marca
	 * @param model
	 * @param speed
	 */
	public Tablet(String marca, String model, int speed) {
		super(marca, model, speed);
		// TODO Auto-generated constructor stub
	}
	
	/* (non-Javadoc)
	 * @see org.escoladeltreball.thridassigmenttopic.Device#turnOn()
	 */
	@Override
	public void turnOn() {
		System.out.println("Turn on device");
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.thridassigmenttopic.Device#turnOff()
	 */
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub

	}

}
