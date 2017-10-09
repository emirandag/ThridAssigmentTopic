/**
 * 
 */
package org.escoladeltreball.thridassigmenttopic;

/**
 * @author iaw26540084
 *
 */
public abstract class Labtop extends DeviceImpl {

	private LabtopType type;
	
	/*public Labtop(String marca, String model, int speed, LabtopType type) {
		super(marca, model, speed);
		this.type = type;
	}*/
	

	public Labtop(String marca, String model, int speed, LabtopType type) {
		super(marca, model, speed);
		this.type = type;
	}


	/* (non-Javadoc)
	 * @see org.escoladeltreball.thridassigmenttopic.Device#turnOn()
	 */
	@Override
	public void turnOn() {
		System.out.println("Turning on device");

	}


}
