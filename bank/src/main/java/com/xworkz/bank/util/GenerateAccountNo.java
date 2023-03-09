package com.xworkz.bank.util;

import java.util.Random;

public class GenerateAccountNo {
	public static int generateAccNo() {
		Random random = new Random();
		int nextInt = random.nextInt(10000000);
		return nextInt;
	}
}
