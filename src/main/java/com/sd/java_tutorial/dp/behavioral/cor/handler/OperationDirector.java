/**
 * 
 */
package com.sd.java_tutorial.dp.behavioral.cor.handler;

import java.util.logging.Logger;

import com.sd.java_tutorial.dp.behavioral.cor.OfferLetter;

/**
 * @author Sapan.Desai
 *
 */
public class OperationDirector extends ApproverHandler {
	
	static Logger logger = Logger.getLogger(OperationDirector.class.getName());
	
	public OperationDirector(ApproverHandler successor) {
		this.successor = successor;
	}
	/* (non-Javadoc)
	 * @see com.sd.java_tutorial.dp.behavioral.cor.handler.ApproverHandler#handleRequest(com.sd.java_tutorial.dp.behavioral.cor.OfferLetter)
	 */
	@Override
	public void handleRequest(OfferLetter offer) {
		//System.out.println("Operation Director can approve offer for any designated candidate.");
		logger.info("Approved");
	}

}
