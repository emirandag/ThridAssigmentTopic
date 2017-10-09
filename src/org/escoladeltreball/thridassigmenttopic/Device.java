/**
 * 
 */
package org.escoladeltreball.thridassigmenttopic;

import java.io.Serializable;

/**
 * @author iaw26540084
 *
 */
public interface Device extends Cloneable {
	
	/**
	 * Turns device on
	 * 
	 */
	public abstract void turnOn();
	
	/**
	 * Turns device off
	 */
	public abstract void turnOff();
	
	/**
	 * Cuases device to over clock
	 * @return 
	 * @throws Exception
	 */
	
	public abstract int overclock() throws Exception;
}
