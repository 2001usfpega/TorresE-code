package com.revature.strangs;

public class FunWithStrings {
	/*Strings!!
	 * not char or Character
	 * NOT A PRIMITIVE DATA-TYPE
	 * Fully Qualified class name: java.lang.String;
	 * String literal is 0 to many characters - ex. "" or String a="Go Tigers!!";
	 * concatenate strings w/ + or .concat()
	 * Strings are immutable
	 * String pool - collection of unique String literals in heap memory;
	 * String s = "dog"' Compiler searches string pool for "dog"
	 * if it exits, it will create a reference to it,
	 * if it does not exist, it will create a new String literal in the string pool
	 * String a = "dog; same reference as s variable
	 * a = a+"house";
	 * String API has utility methods!
	 * String - String Pool, Immutable, thread safe, fast
	 * StringBuilder - No String pool, Mutable, not thread safe, fast
	 * StringBuffer - No String pool, Mutable, thread safe, sloooooowwwww
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lsu = "Go Tigers!!";
		System.out.println(lsu.hashCode());
		System.out.println(lsu);
		lsu = "woo-hoo!";
		System.out.println(lsu);
		System.out.println(lsu.hashCode());
		String t = "Go Tigers!!";
		t.
		System.out.println(t.hashCode());
		System.out.println(t.charAt(5));
		
	}
}
