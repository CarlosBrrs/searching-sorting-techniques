package searching_techniques;

import static searching_techniques.SearchingMain.displayResults;

/*
Linear search is a very simple search algorithm. In this type of search, a sequential search is made over all items one
by one. Every item is checked and if a match is found then that particular item is returned, otherwise the search
continues till the end of the data collection.

Algorithm

- Step 1: Set i to 1
- Step 2: if i > n then go to step 7
- Step 3: if A[i] = x then go to step 6
- Step 4: Set i to i + 1
- Step 5: Go to Step 2
- Step 6: Print Element x Found at index i and go to step 8
- Step 7: Print element not found
- Step 8: Exit
 */
public class LinearSearch {

    // this method makes a linear search.
    public static int findPositionLinearSearch(int[] array, int desiredNumber) {

        int comparisons = 0;
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            comparisons++;

            if (desiredNumber == array[i]) {
                index = i;
                break;
            }
        }
        displayResults(index, comparisons);
        return index;
    }
}
