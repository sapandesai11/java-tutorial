/**
 * 
 */
package com.sd.java_tutorial.dp.behavioral.cor.handler;

import com.sd.java_tutorial.dp.behavioral.cor.Designations;
import com.sd.java_tutorial.dp.behavioral.cor.OfferLetter;

/** This is concrete implementation of Handler Chain Chain Of Responsibility design pattern.
 * @author Sapan.Desai
 *
 */
public class DeliveryManager extends ApproverHandler {
	
	private static final double SALARY_LIMIT = 800000; 
	
	public DeliveryManager(ApproverHandler successor) {
		this.successor = successor;
	}

	/* (non-Javadoc)
	 * @see com.sd.java_tutorial.dp.behavioral.cor.handler.ApproverHandler#handleRequest(com.sd.java_tutorial.dp.behavioral.cor.OfferLetter)
	 */
	@Override
	public void handleRequest(OfferLetter offer) {
		if(offer.getDesignation().getAnnualPackage() <= SALARY_LIMIT 
				|| (offer.getDesignation().equals(Designations.HPEL) 
				|| offer.getDesignation().equals(Designations.SOFTWARE_ENGINEER)))
			System.out.println("Offer has been approved by Delivery Manager.");
		else
			this.successor.handleRequest(offer);
	}

}
