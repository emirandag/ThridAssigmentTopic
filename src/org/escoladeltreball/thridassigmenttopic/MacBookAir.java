/**
 * 
 */
package org.escoladeltreball.thridassigmenttopic;

/**
 * @author iaw26540084
 *
 */
public final class MacBookAir extends Labtop {

	/**
	 * @param marca
	 * @param model
	 * @param speed
	 */
	public MacBookAir(String marca, String model, int speed) {
		super(marca, model, speed, LabtopType.LIGHT);
	}
	
	
	/**
	 * @param marca
	 * @param model
	 */
	public MacBookAir(String marca, String model) {
		this(marca, model, 367);
		
	}


	/* (non-Javadoc)
	 * @see org.escoladeltreball.thridassigmenttopic.Device#turnOff()
	 */
	@Override
	public void turnOff() {
		System.out.println("Clossing mac smoothly");

	}

}
