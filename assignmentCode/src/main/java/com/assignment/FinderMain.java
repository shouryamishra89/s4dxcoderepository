package com.assignment;

import java.util.List;
import java.util.Scanner;

public class FinderMain {
	/**
	 * This is the main method which makes use of find method.
	 * 
	 * @param args Unused.
	 * @return Nothing.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] thisIsAStringArray = { "asd", "asdd", "fre", "ccs", "lkm", "gdo", "ads", "sadd", "mlk", "erf", "kml" };

		System.out.println("Please Enter InputValue::");
		Scanner sc = new Scanner(System.in);
		String inputValue = sc.nextLine();

		Finder finder = new Finder(thisIsAStringArray);

		List<String> res = finder.find(inputValue);
		System.out.println("Final Output::" + res);

	}

}
