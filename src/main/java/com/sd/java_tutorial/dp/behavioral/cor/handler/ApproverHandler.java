/**
 * 
 */
package com.sd.java_tutorial.dp.behavioral.cor.handler;

import com.sd.java_tutorial.dp.behavioral.cor.OfferLetter;

/** This abstract class serves as common interface handler in Chain Of Responsibility design pattern.
 * It has successor and an abstract hadnleRequest method.
 * Concrete handler will have to provide it's mplementation of request handling.
 * Client has to provide successor of the 
 * 
 * @author Sapan.Desai
 *
 */
public abstract class ApproverHandler {
	protected ApproverHandler successor;
	
	/**
	 * @param successor the successor to set
	 */
	public void setSuccessor(ApproverHandler successor) {
		this.successor = successor;
	}

	public abstract void handleRequest(OfferLetter offer);
}
