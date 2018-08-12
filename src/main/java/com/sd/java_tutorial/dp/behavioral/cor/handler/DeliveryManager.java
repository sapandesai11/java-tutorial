/**
 * 
 */
package com.sd.java_tutorial.dp.behavioral.cor.handler;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.sd.java_tutorial.dp.behavioral.cor.Designations;
import com.sd.java_tutorial.dp.behavioral.cor.OfferLetter;

/** This is concrete implementation of Handler Chain Chain Of Responsibility design pattern.
 * @author Sapan.Desai
 *
 */
public class DeliveryManager extends ApproverHandler {
	
	static Logger logger = Logger.getLogger(DeliveryManager.class.getName());
	
	private static final double SALARY_LIMIT = 800000; 
	
	public DeliveryManager(ApproverHandler successor) {
		logger.setLevel(Level.INFO);
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
		//{
			logger.info("Approved");
			//System.out.println("Offer has been approved by Delivery Manager.");
		//}
		else {
			logger.info("Forwarding to my successor.");
			this.successor.handleRequest(offer);
		}
	}

}
