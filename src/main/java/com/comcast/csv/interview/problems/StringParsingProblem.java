package com.comcast.csv.interview.problems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The following methods operate on street addresses in a particular format. The
 * format contains the following components:
 * 
 * 1. Number of miles from the center of the city 2. Primary direction from the
 * city as a single lower-case letter 3. Street number 4. Street name (always a
 * single word) 5. An abbreviation for either a Street or Avenue with a period
 * 
 * </h2>Example Valid Addresses</h2> 25w873 Apple St. 3n17 Special Ave. 0e34800
 * Main St.
 */
public class StringParsingProblem {
	public static final Logger log = LoggerFactory.getLogger(StringParsingProblem.class);

	/**
	 * Returns true if the address is valid, otherwise false.
	 * 
	 * @param address
	 *            the address to validate
	 * @return true if the address is valid
	 */
	public boolean isAddressValid(String address) {
		Pattern pattern = Pattern.compile("(\\d{1,2})[ewns](\\d{1,5})\\s(.*)");
		Matcher matcher = pattern.matcher(address);
		while (matcher.find()) {
			String[] lastPart = matcher.group(3).split(" ");
			if (lastPart.length == 2 && (lastPart[1].equals("St.") | lastPart[1].equals("Ave."))) {
				log.info("valid");
				return true;
			}
		}
		log.info("invalid");
		return false;
	}

	/**
	 * Get the distance in miles from the center of the city from the given
	 * address.
	 * 
	 * @param address
	 *            the address
	 * @return the distance
	 */
	public int getDistanceFromCityCenter(String address) {
		Pattern pattern = Pattern.compile("(\\d{1,2})[ewns]");
		Matcher matcher = pattern.matcher(address);
		while (matcher.find())
			return Integer.parseInt(matcher.group(1));
		return 0;
	}

}
