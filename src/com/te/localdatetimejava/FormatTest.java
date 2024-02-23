package com.te.localdatetimejava;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatTest {
	
	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		System.out.println("Today .." +now);
		
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		//This class provides the main application entry point for printing and parsingand provides common implementations of DateTimeFormatter: 
		
		String format = now.format(ofPattern);
		//format Formats this date using the specified formatter. This date will be passed to the formatter to produce a string.

		System.out.println(format);
	}

}
