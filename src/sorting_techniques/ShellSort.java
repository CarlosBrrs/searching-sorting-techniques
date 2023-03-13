package sorting_techniques;

import static sorting_techniques.SortingMain.display;

/*
Bubble sort is a simple sorting algorithm. This sorting algorithm is comparison-based algorithm in which each pair of
adjacent elements is compared and the elements are swapped if they are not in order. This algorithm is not suitable for
large data sets as its average and worst case complexity are of Ο(n2) where n is the number of items.
 */
public class ShellSort {

    public static void shellSort(int[] intArray) {

        int inner, outer;
        int valueToInsert;
        int interval = 1;
        int elements = intArray.length;
        int i = 0;

        while(interval <= elements/3) {
            interval = interval*3 +1;
        }

        while(interval > 0) {
            System.out.printf("iteration %d#:", i);
            display();

            for(outer = interval; outer < elements; outer++) {
                valueToInsert = intArray[outer];
                inner = outer;

                while(inner > interval -1 && intArray[inner - interval]
                        >= valueToInsert) {
                    intArray[inner] = intArray[inner - interval];
                    inner -=interval;
                    System.out.printf(" item moved :%d\n",intArray[inner]);
                }

                intArray[inner] = valueToInsert;
                System.out.printf(" item inserted :%d, at position :%d\n",valueToInsert,inner);
            }

            interval = (interval -1) /3;
            i++;
        }
    }
}
