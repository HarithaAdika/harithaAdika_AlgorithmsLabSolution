package com.greatlearning.lab2solutioncurrencydenomination.service;

public class SortCurrencyNotes {

	void merge(int currencyNotes[], int low, int mid, int high) {
		int leftcurrencyNotesaySize = mid - low + 1;
		int rightcurrencyNotesaySize = high - mid;

		int LeftcurrencyNotesay[] = new int[leftcurrencyNotesaySize];
		int RightcurrencyNotesay[] = new int[rightcurrencyNotesaySize];

		for (int i = 0; i < leftcurrencyNotesaySize; ++i)
			LeftcurrencyNotesay[i] = currencyNotes[low + i];
		for (int j = 0; j < rightcurrencyNotesaySize; ++j)
			RightcurrencyNotesay[j] = currencyNotes[mid + 1 + j];

		int i = 0, j = 0;

		int k = low;
		// sorting the values in descending order
		while (i < leftcurrencyNotesaySize && j < rightcurrencyNotesaySize) {
			if (LeftcurrencyNotesay[i] >= RightcurrencyNotesay[j]) {
				currencyNotes[k] = LeftcurrencyNotesay[i];
				i++;
			} else {
				currencyNotes[k] = RightcurrencyNotesay[j];
				j++;
			}
			k++;
		}
		// sorting left array
		while (i < leftcurrencyNotesaySize) {
			currencyNotes[k] = LeftcurrencyNotesay[i];
			i++;
			k++;
		}
		// sorting right array
		while (j < rightcurrencyNotesaySize) {
			currencyNotes[k] = RightcurrencyNotesay[j];
			j++;
			k++;
		}
	}

	void sort(int currencyNotes[], int low, int high) {
		if (low < high) {
			int mid = low + (high - low) / 2;

			sort(currencyNotes, low, mid);
			sort(currencyNotes, mid + 1, high);

			merge(currencyNotes, low, mid, high);
		}
	}

}

