/* Display utilities */

package com.haleyhuxley.artgallery.util;

public class DisplayUtil {

	/* Print '=' argNum number of times */
	public static void printBars(int argNum) {
		
		if(argNum < 0) {
			System.err.println("argNum must be greater than 0.");
		}
		
		for(int i = 0; i < argNum; ++i) {
			System.out.print("=");
		}
		System.out.println();
	}
	
}
