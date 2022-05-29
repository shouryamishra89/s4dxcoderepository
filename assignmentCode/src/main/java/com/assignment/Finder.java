package com.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
* <h1>Find all the Strings of an array related to given string as input!</h1>

* @author  Shourya Mishra
* @version 1.0
* @since   2022-05-29
*/
public class Finder {

	private String[] thisIsAStringArray;

	public Finder(String[] thisIsAStringArray) {
		
		this.thisIsAStringArray = thisIsAStringArray;
	}
    /**
    * This method is used to return all strings from the array that contains 
      the exact same characters as the string passed as input.
    * @param input This is the first parameter to find method.
   
    * @return List<String> of all Strings which are matching to input parameter.
    */
	public List<String> find(String input) {
		List<String> result = new ArrayList<>();

		for (int i = 0; i <= thisIsAStringArray.length - 1; i++) {
			char[] ch1 = input.toCharArray();
			char[] ch2 = thisIsAStringArray[i].toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);

			if (Arrays.equals(ch1, ch2)) {
				result.add(thisIsAStringArray[i]);
			}

		}
		return result;

	}

}
