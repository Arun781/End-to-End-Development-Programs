package com.xworkz.valatine.dto;

public class ReverseString {

	public static void main(String[] args) {
		String killer = "Rajajinagar", arun = "";
		char AA;
		
		System.out.println("Rajajinagar");

		for (int i = 0; i < killer.length(); i++) {
			AA = killer.charAt(i);
			arun = AA + arun;
			System.out.println(arun);
		}
		System.out.println("____________________________");
		System.out.println(arun);	
		
	}

}
