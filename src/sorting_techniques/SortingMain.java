package sorting_techniques;

import static sorting_techniques.BubbleSort.bubbleSort;
import static sorting_techniques.InsertionSort.insertionSort;
import static sorting_techniques.MergeSort.mergeSort;
import static sorting_techniques.SelectionSort.selectionSort;
import static sorting_techniques.ShellSort.shellSort;

public class SortingMain {

    static int[] list = new int[]{4,6,3,2,1,9,7};

    public static void main(String[] args) {
        System.out.print("Input Array: ");
        display();
        System.out.println("==================================================");

/*        bubbleSort(list);
        System.out.print("\nOutput Array: ");
        display();*/

/*        insertionSort(list);
        System.out.print("\nOutput Array: ");
        display();*/

/*        selectionSort(list);
        System.out.print("\nOutput Array: ");
        display();*/

/*not working
        mergeSort(list, 0, list.length - 1);
        System.out.print("\nOutput Array: ");
        display();
*/

        shellSort(list);
        System.out.print("\nOutput Array: ");
        display();

    }

    static void display() {
        System.out.print("[ ");

        // navigate through all items
        for (int i = 0; i < list.length; i++) {
            System.out.printf("%d ", list[i]);
        }

        System.out.println("]");
    }
}
