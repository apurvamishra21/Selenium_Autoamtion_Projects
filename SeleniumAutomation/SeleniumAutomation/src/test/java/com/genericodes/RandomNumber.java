package com.genericodes;

import java.util.Random;

public class RandomNumber {
	
	public static void main(String[] args) {
		
		
		double num = Math.random();
		System.out.println(num);//0.831824561557622
		
		
		
		int uniqueNum = (int)(Math.random() * 100000);
		String name = "veer" + uniqueNum;
		
		double otp = num * 1000000;
		System.out.println((int)otp);//831824
		
		double num1 = Math.random();
		int otp1 = (int)(num * 1000000);
		System.out.println(otp1);
		
		Random r = new Random();
		int num2 = r.nextInt();
		System.out.println(num2);
		
	
		
		
		
		
		
	}
	
	

}
