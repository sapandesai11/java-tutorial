/**
 * 
 */
package com.sd.java_tutorial.dp.behavioral.cor.handler;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.sd.java_tutorial.dp.behavioral.cor.Designations;
import com.sd.java_tutorial.dp.behavioral.cor.OfferLetter;

/**
 * @author Sapan.Desai
 *
 */
public class DevelopmentManager extends ApproverHandler {
	
	static Logger logger = Logger.getLogger(DevelopmentManager.class.getName());
	
	private static final double SALARY_LIMIT = 900000; 

	public DevelopmentManager(ApproverHandler successor) {
		logger.setLevel(Level.INFO);
		this.successor = successor;
	}
	
	/* (non-Javadoc)
	 * @see com.sd.java_tutorial.dp.behavioral.cor.handler.ApproverHandler#handleRequest(com.sd.java_tutorial.dp.behavioral.cor.OfferLetter)
	 */
	@Override
	public void handleRequest(OfferLetter offer) {
		if(offer.getDesignation().getAnnualPackage() <= SALARY_LIMIT 
				|| (!offer.getDesignation().equals(Designations.TEAM_LEAD)))
			//System.out.println("Offer has been approved by Developement Manager.");
			logger.info("Approved");
		else {
			logger.info("Forwarding to my successor");
			this.successor.handleRequest(offer);
		}
	}

}
