package algo.sorting;

/**
 * Sort an array containing integers in ascending order
 * (arranged from smallest to largest) using the insertion sort algorithm.
 */
public class InsertionSort implements Sort {

	@Override
	public int[] sort(int[] unsorted) {
		//TODO: Add implementation
		for (int i = 1; i < unsorted.length; i++) {
			int key = unsorted[i];
			int j;
			for (j = i - 1; j >= 0 && unsorted[j] > key; j--) {
				unsorted[j + 1] = unsorted[j];

			}
			unsorted[j + 1] = key;
		}
		return unsorted;
	}
}