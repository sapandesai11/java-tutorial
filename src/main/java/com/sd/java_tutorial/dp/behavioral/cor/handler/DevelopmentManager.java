/**
 * 
 */
package com.sd.java_tutorial.dp.behavioral.cor.handler;

import com.sd.java_tutorial.dp.behavioral.cor.Designations;
import com.sd.java_tutorial.dp.behavioral.cor.OfferLetter;

/**
 * @author Sapan.Desai
 *
 */
public class DevelopmentManager extends ApproverHandler {
	private static final double SALARY_LIMIT = 900000; 

	/* (non-Javadoc)
	 * @see com.sd.java_tutorial.dp.behavioral.cor.handler.ApproverHandler#handleRequest(com.sd.java_tutorial.dp.behavioral.cor.OfferLetter)
	 */
	@Override
	public void handleRequest(OfferLetter offer) {
		if(offer.getDesignation().getAnnualPackage() <= SALARY_LIMIT 
				|| (!offer.getDesignation().equals(Designations.TEAM_LEAD)))
			System.out.println("Offer has been approved by Developement Manager.");
		else
			successor.handleRequest(offer);
	}

}
