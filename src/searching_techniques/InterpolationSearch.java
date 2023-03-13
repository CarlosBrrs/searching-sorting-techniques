package searching_techniques;

import static searching_techniques.SearchingMain.displayResults;

/*
Interpolation search is an improved variant of binary search. This search algorithm works on the probing position of the
required value. For this algorithm to work properly, the data collection should be in a sorted form and EQUALLY
DISTRIBUTED.

Binary search has a huge advantage of time complexity over linear search. Linear search has worst-case complexity of
Ο(n) whereas binary search has Ο(log n).

There are cases where the location of target data may be known in advance. For example, in case of a telephone
directory, if we want to search the telephone number of Morphius. Here, linear search and even binary search will seem
slow as we can directly jump to memory space where the names start from 'M' are stored.
 */
public class InterpolationSearch {

    // this method makes a linear search.
    public static int findPositionInterpolationSearch(int[] array, int desiredNumber) {

        int lo = 0;
        int hi = array.length - 1;
        double mid = -1;
        int comparisons = 1;
        int index = -1;

        while (lo <= hi) {
            System.out.printf("Comparison %d\n" , (comparisons));
            System.out.printf("lo : %d, list[%d] = %d\n", lo, lo, array[lo]);
            System.out.printf("hi : %d, list[%d] = %d\n", hi, hi, array[hi]);
            comparisons++;

            // probe the mid point
            // mid = Lo + ((Hi - Lo) / (A[Hi] - A[Lo])) * (X - A[Lo])
            mid = lo + (((double)(hi - lo) / (array[hi] - array[lo])) * (desiredNumber - array[lo]));
            System.out.printf("mid = %.4f\n", mid);

            // data found
            if(array[(int)mid] == desiredNumber) {
                index = (int)mid;
                break;
            } else {
                if(array[(int)mid] < desiredNumber) {
                    // if data is larger, data is in upper half
                    lo = (int)mid + 1;
                } else {
                    // if data is smaller, data is in lower half
                    hi = (int)mid - 1;
                }
                if (lo == hi) {
                    System.out.println("Not found");
                    break;
                }
            }
        }
        displayResults(index, comparisons);
        return index;
    }
}
