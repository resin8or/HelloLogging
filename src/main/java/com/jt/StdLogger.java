package com.jt;

import org.apache.log4j.Logger;

public class StdLogger {

	final static Logger logger = Logger.getLogger(StdLogger.class);
	
	public static void main (String args[]) {
		logger.info ("test");
		logger.debug("debug test");
		logger.error("error test");
		
	}
	
}
