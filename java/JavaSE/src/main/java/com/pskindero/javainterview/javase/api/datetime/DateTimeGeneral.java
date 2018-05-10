package com.pskindero.javainterview.javase.api.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Duration;

/**
 * Need to be remembered:
 * - most of the classes are immutable
 * 
 */
public class DateTimeGeneral {

	public static void main(String[] args) {
		LocalDate dateOfBirth = LocalDate.of(2012, Month.MAY, 14);	//Date withou timezone
		
		Duration.ofDays(2);
	}
}
