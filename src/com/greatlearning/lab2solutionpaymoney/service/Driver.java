package com.greatlearning.lab2solutionpaymoney.service;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int arrSize = sc.nextInt();
		int transactions[] = new int[arrSize];
		System.out.println("Enter the values of array");
		for (int i = 0; i < arrSize; i++) {
			transactions[i] = sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		int NoofTransactions = sc.nextInt();
		PayMoney result = new PayMoney();
		result.transactionTargetCheck(transactions, arrSize, NoofTransactions);
		sc.close();
	}

}

