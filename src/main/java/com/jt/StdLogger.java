package com.jt;

import org.apache.log4j.Logger;

import java.util.Date;

public class StdLogger {

	final static Logger logger = Logger.getLogger(StdLogger.class);
	
	public static void main (String args[]) {
		logger.info ("test");
		logger.debug("debug test");
		logger.error("error test");
		// call the calculateDaysBetweenDates method
		// create a variable to hold a date value and set the date to yesterday's date
		Date yesterday = new Date(System.currentTimeMillis() - 24 * 60 * 60 * 1000);
		// create a variable to hold a date value and set the date to today's date
		Date today = new Date();
		Test test = new Test();
		//create a variable to hold the number of days between yesterday and today
		int daysBetween = test.calculateDaysBetweenDates(today, yesterday);
		// output the result of the test.calculateDaysBetweenDates method
		System.out.println("The number of days between " + yesterday + " and " + today + " is " + daysBetween);
		// call the nearestLeapYear method
		// create a variable to hold a date value and set the date to today's date
		Date date = new Date();
		// create a variable to hold the nearest leap year
		int nearestLeapYear = test.nearestLeapYear(today);
		// output the result of the test.nearestLeapYear method
		System.out.println("The nearest leap year to " + date + " is " + nearestLeapYear);

	}
	
	
}
