package com.te.localdatetimejava;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {

	public static void main(String[] args) {
		
		LocalDate dob = LocalDate.of(2000, 05, 20);
		LocalDate today = LocalDate.now();
		
		Period age = Period.between(dob, today);
		System.out.println("The Calculated age is :--" +age); 
		System.err.println("Age " +"Days " + age.getDays() +  "Months" + age.getMonths() +  "Year" + age.getYears());
		
		
	}
}
