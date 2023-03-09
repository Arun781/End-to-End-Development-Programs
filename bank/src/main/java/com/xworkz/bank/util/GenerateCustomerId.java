package com.xworkz.bank.util;

import java.util.Random;

public class GenerateCustomerId {
	public static int generateCustomerId() {
		Random random = new Random();
		int nextInt = random.nextInt();
		return nextInt;
	}
}
