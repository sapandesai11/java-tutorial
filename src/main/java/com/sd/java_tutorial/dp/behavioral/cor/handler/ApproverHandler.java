/**
 * 
 */
package com.sd.java_tutorial.dp.behavioral.cor.handler;

import com.sd.java_tutorial.dp.behavioral.cor.OfferLetter;

/** This abstract class serves as common interface handler in Chain Of Responsibility design pattern.
 * It has successor and an abstract hadnleRequest method.
 * Concrete handler will have declare its' successor and provide it's implementation of request handling.
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
