package searching_techniques;

import static searching_techniques.SearchingMain.displayResults;

/*
Binary search is a fast search algorithm with run-time complexity of Ο(log n). This search algorithm works on the
principle of divide and conquer. For this algorithm to work properly, the data collection should be in the sorted form.

Binary search looks for a particular item by comparing the middle most item of the collection. If a match occurs, then
the index of item is returned. If the middle item is greater than the item, then the item is searched in the sub-array
to the left of the middle item. Otherwise, the item is searched for in the sub-array to the right of the middle item.
This process continues on the sub-array as well until the size of the subarray reduces to zero.
 */
public class BinarySearch {

    // this method makes a linear search.
    public static int findPositionBinarySearch(int[] array, int desiredNumber) {

        int lowerBound = 0;
        int upperBound = array.length -1;
        int midPoint;
        int comparisons = 0;
        int index = -1;

        while (lowerBound <= upperBound) {
            System.out.printf("Comparison %d\n" , (comparisons +1));
            System.out.printf("lowerBound : %d, intArray[%d] = %d\n",lowerBound, lowerBound, array[lowerBound]);
            System.out.printf("upperBound : %d, intArray[%d] = %d\n", upperBound, upperBound, array[upperBound]);
            comparisons++;

            // compute the middle point
            // midPoint = (lowerBound + upperBound) / 2;
            midPoint = lowerBound + (upperBound - lowerBound) / 2;
            System.out.printf("The middle point in this comparison is index %d, intArray[%d] is %d\n", midPoint, midPoint, array[midPoint]);

            // data found
            if(array[midPoint] == desiredNumber) {
                index = midPoint;
                break;
            } else {
                // if data is larger
                if(array[midPoint] < desiredNumber) {
                    // data is in upper half
                    lowerBound = midPoint + 1;
                    System.out.println("Your desired number is at upper half, recalculating...");
                }
                // data is smaller
                else {
                    // data is in lower half
                    upperBound = midPoint -1;
                    System.out.println("Your desired number is at lower half, recalculating...");
                }
            }
        }
        displayResults(index, comparisons);
        return index;
    }
}
