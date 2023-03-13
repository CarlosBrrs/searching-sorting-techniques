package sorting_techniques;

import static sorting_techniques.SortingMain.display;

/*
This is an in-place comparison-based sorting algorithm. Here, a sub-list is maintained which is always sorted. For
example, the lower part of an array is maintained to be sorted. An element which is to be 'insert'ed in this sorted
sub-list, has to find its appropriate place and then it has to be inserted there. Hence the name, insertion sort.

The array is searched sequentially and unsorted items are moved and inserted into the sorted sub-list (in the same
array). This algorithm is not suitable for large data sets as its average and worst case complexity are of Ο(n2), where
n is the number of items.
 */
public class InsertionSort {

    public static void insertionSort(int[] intArray) {

        int valueToInsert;
        int holePosition;

        // loop through all numbers
        for(int i = 1; i < intArray.length; i++) {

            // select a value to be inserted.
            valueToInsert = intArray[i];

            // select the hole position where number is to be inserted
            holePosition = i;

            // check if previous no. is larger than value to be inserted
            while (holePosition > 0 && intArray[holePosition-1] > valueToInsert) {
                intArray[holePosition] = intArray[holePosition-1];
                holePosition--;
                System.out.printf(" item moved : %d\n" , intArray[holePosition]);
            }

            if(holePosition != i) {
                System.out.printf(" item inserted : %d, at position : %d\n\n" , valueToInsert,holePosition);
                // insert the number at hole position
                intArray[holePosition] = valueToInsert;
            }

            System.out.printf("Iteration %d#:",i);
            display();

        }
    }
}
