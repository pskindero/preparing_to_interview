package com.pskindero.javainterview.javase.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[Ee]xample");
		Matcher m = p.matcher("Example");
		System.out.println(m.find());

	}

}
