package com.greatlearning.lab2solutioncurrencydenomination.service;

public class CalculateMinimumNotes {

	public void minimumNotes(int[] notes, int amount) {

		SortCurrencyNotes sortArray = new SortCurrencyNotes();
		sortArray.sort(notes, 0, notes.length - 1);
		int[] noteCounter = new int[notes.length];
		try {
			// used to calculate the notes required for given amount
			for (int i = 0; i < notes.length; i++) {
				if (amount >= notes[i]) {
					noteCounter[i] = amount / notes[i];
					amount = amount - noteCounter[i] * notes[i];
				}
			}
			if (amount > 0) {
				System.out.println("invalid amount");
			} else {
				// Printing minimum notes required for denomination
				System.out.println("Your payment approach in order to give min no of notes will be");
				for (int i = 0; i < notes.length; i++) {
					if (noteCounter[i] != 0) {
						System.out.println(notes[i] + " : " + noteCounter[i]);
					}
				}

			}

		} catch (ArithmeticException e) {
			System.out.println(e + " notes of 0 is invalida for denomination");
		}

	}

}

