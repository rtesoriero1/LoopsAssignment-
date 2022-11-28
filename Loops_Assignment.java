package com.lemon.loops_assignment;
import java.util.Scanner;

public class Loops_Assignment {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiplicationTable();
		greatestCommonDivisor();
		tutionPrediction();
	}
	
	public static void multiplicationTable() {
		// TODO Auto-generated method stub
		for (int x = 1; x < 13; x++) {
		int firstNumber = x; 
		
			for (int y = 1; y < 13; y++) {
				int result = firstNumber * y; 
				System.out.println(firstNumber + "*" + y + "=" + result);
			}
		}
	
	}
	
	public static void greatestCommonDivisor() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first positive interger:");
		String firstNumber = input.nextLine(); 
		int numberOne = Integer.parseInt(firstNumber);
		
		System.out.println("Please enter the second positive interger:");
		String secondNumber = input.nextLine(); 
		int numberTwo = Integer.parseInt(secondNumber);
		
		int biggestCommonDivisor = 1;
		for (int x=1; x <= numberOne && x<= numberTwo; x++ ) {
			
			if (numberOne % x ==0 && numberTwo % x == 0) {
				biggestCommonDivisor = x; 
			}
		}
		System.out.println("The greatest common divisor is:" + biggestCommonDivisor);
	}
	
	
public static void tutionPrediction() {
		double startingTution = 100000;
		double currentTution = 100000;
		int currentYear = 2022; 
		int yearCounter = 1; 
		while(currentTution <= (startingTution *2)-1) {
			yearCounter++; 
			currentTution = currentTution * 1.07; 
		}
		System.out.println("The year where the tution doubles is:" + (currentYear + yearCounter));
	}


}
