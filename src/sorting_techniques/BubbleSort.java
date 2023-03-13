package sorting_techniques;

import static sorting_techniques.SortingMain.display;

/*
Bubble sort is a simple sorting algorithm. This sorting algorithm is comparison-based algorithm in which each pair of
adjacent elements is compared and the elements are swapped if they are not in order. This algorithm is not suitable for
large data sets as its average and worst case complexity are of Ο(n2) where n is the number of items.
 */
public class BubbleSort {

    public static void bubbleSort(int[] list) {
        int temp;
        boolean swapped;

        // loop through all numbers
        for (int i = 0; i < list.length - 1; i++) {
            swapped = false;

            // loop through numbers falling ahead
            for (int j = 0; j < list.length - 1 - i; j++) {
                System.out.printf("     Items compared: [ %d, %d ] ", list[j], list[j + 1]);

                // check if next number is lesser than current no
                //   swap the numbers.
                //  (Bubble up the highest number)

                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;

                    swapped = true;
                    System.out.printf(" => swapped [%d, %d]\n", list[j], list[j + 1]);
                } else {
                    System.out.print(" => not swapped\n");
                }
            }

            // if no number was swapped that means
            //   array is sorted now, break the loop.
            if (!swapped) {
                break;
            }
            System.out.printf("Iteration %d#: ", (i + 1));
            display();
        }
    }
}
