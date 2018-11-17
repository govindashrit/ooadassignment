package com.ooad.assign.work;
/**
 * 
 * @author Gov
 *
 */
public interface MessageListener {
	/**
	 * Notifies to different observers
	 * @param coordinate location details 
	 * @param message details e.g vehicle info
	 * @return
	 */
	public boolean notifiyMessage(Coordinate coordinate , String message);

}
