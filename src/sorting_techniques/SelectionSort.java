package sorting_techniques;

import static sorting_techniques.SortingMain.display;

/*
Selection sort is a simple sorting algorithm. This sorting algorithm is an in-place comparison-based algorithm in which
the list is divided into two parts, the sorted part at the left end and the unsorted part at the right end. Initially,
the sorted part is empty and the unsorted part is the entire list.

The smallest element is selected from the unsorted array and swapped with the leftmost element, and that element becomes
a part of the sorted array. This process continues moving unsorted array boundary by one element to the right.

This algorithm is not suitable for large data sets as its average and worst case complexities are of Ο(n2), where n is
the number of items.
 */
public class SelectionSort {

    public static void selectionSort(int[] intArray) {

        int indexMin;

        // loop through all numbers
        for (int i = 0; i < intArray.length - 1; i++) {

            // set current element as minimum
            indexMin = i;

            // check the element to be minimum
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[j] < intArray[indexMin]) {
                    indexMin = j;
                }
            }

            if (indexMin != i) {
                System.out.printf("Items swapped: [ %d, %d ]\n", intArray[i], intArray[indexMin]);

                // swap the numbers
                int temp = intArray[indexMin];
                intArray[indexMin] = intArray[i];
                intArray[i] = temp;
            }

            System.out.printf("Iteration %d#:", (i + 1));
            display();
        }

    }
}
