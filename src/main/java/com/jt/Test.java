package com.jt;

import java.util.Date;
import java.util.logging.Logger;

/**
 * This class is used to calculate the number of days between two dates.
 *
 * @version 1.0
 * @since 1.0
 */

public class Test {
    Logger logger = Logger.getLogger(Test.class.getName());

    public int calculateDaysBetweenDates(Date date1, Date date2) {
        return (int) ((date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24));

    }

    /// create a new method that returns the nearest leap year for a date
    // create a new method that returns the nearest leap year for a date
	public int nearestLeapYear(Date date) {
		// create a variable to hold the year value of the date
		// The method getYear() from the type Date is deprecated
		// find the year from a date value
		@SuppressWarnings("deprecation")
		int year = date.getYear();
        
        // the year value is not correct, so add 1900 to it
        year = year + 1900;
        logger.info(year + " is the year");

		// create a variable to hold the nearest leap year
		int nearestLeapYear = 0;
		// if the year is divisible by 4, then it is a leap year
		if (year % 4 == 0) {
			nearestLeapYear = year;
		} else {
			// otherwise, find the nearest leap year
			nearestLeapYear = year + (4 - (year % 4));
		}
		// return the nearest leap year
		return nearestLeapYear;
	}   


}
