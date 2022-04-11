package com.greatlearning.lab2solutionpaymoney.service;

import java.util.Scanner;

public class PayMoney {
	public void transactionTargetCheck(int[] transactions, int arrSize, int NoofTransactions) {
		Scanner sc = new Scanner(System.in);

		while (NoofTransactions-- > 0) {
			int flag = 0;
			long target, sum = 0;
			System.out.println("Enter the value of target");
			target = sc.nextLong();
			for (int i = 0; i < arrSize; i++) {
				sum = sum + transactions[i];
				if (sum >= target) {
					System.out.println("Target achieved after " + (i + 1) + " transactions ");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(" Given target is not achieved");
			}

		}
		sc.close();

	}

}

