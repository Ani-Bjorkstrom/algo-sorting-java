package algo.sorting;

import java.util.*;

/**
 * Sort a List of SpeciesId. The list will be sorted according to oId descending. If species have the
 * same oId they will be sorted according to vId ascending.
 */
public class JavaAPISort {

	/**
	 * Sort a List of SpeciesId. The list will be sorted according to oId descending. If species have the
	 * same oId they will be sorted according to vId ascending.
	 * @param s the original list
	 * @return sorted list
	 */
	public List<SpeciesId> sort(List<SpeciesId> s) {
		// Define a custom comparator for SpeciesId objects
		Comparator<SpeciesId> comparator = new Comparator<SpeciesId>() {
			@Override
			public int compare(SpeciesId speciesId1, SpeciesId speciesId2) {
				// Compare based on oId in descending order
				int result = Integer.compare(speciesId2.getOId(), speciesId2.getOId());
				// If oId values are the same, compare based on vId in ascending order
				if (result == 0) {
					result = speciesId2.getVId().compareTo(speciesId2.getVId());
				}
				return result;
			}
		};

		// Sort the list using the custom comparator
		Collections.sort(s, comparator);
		return s;
	}


}