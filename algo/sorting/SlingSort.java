package algo.sorting;

import java.util.Arrays;

/**
 * Sort an array containing integers in ascending order
 * (arranged from smallest to largest) using the Sling sort algorithm.
 */
public class SlingSort implements Sort {

	@Override
	public int[] sort(int[] unsorted) {
		int min = Arrays.stream(unsorted).min().getAsInt();
		int max = Arrays.stream(unsorted).max().getAsInt();

		// Create a frequency array to count occurrences of each value
		int[] frequency = new int[max - min + 1];
		for (int num : unsorted) {
			frequency[num - min]++;
		}

		// Create a new array to store the sorted values
		int[] sorted = new int[unsorted.length];
		int index = 0;
		for (int i = 0; i < frequency.length; i++) {
			while (frequency[i] > 0) {
				sorted[index++] = i + min;
				frequency[i]--;
			}
		}

		return sorted;
	}
}
