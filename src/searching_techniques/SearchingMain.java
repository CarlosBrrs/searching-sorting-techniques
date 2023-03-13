package searching_techniques;

import static searching_techniques.InterpolationSearch.findPositionInterpolationSearch;
import static searching_techniques.LinearSearch.findPositionLinearSearch;
import static searching_techniques.BinarySearch.findPositionBinarySearch;

public class SearchingMain {

    static int[] intArray = new int[]{1,2,3,4,6,7,9,11,12,14,15,16,17,19,33,34,43,45,55,66};

    public static void main(String[] args) {
        System.out.print("Input Array: ");
        display();
        System.out.println("==================================================");

        //find location of 1
        //findPositionLinearSearch(intArray, 55);
        //no item found
        //findPositionLinearSearch(intArray, 56);

        //find location of 1
        //findPositionBinarySearch(intArray, 55);
        //no item found
        //findPositionBinarySearch(intArray, 56);

        //find location of 1
        //findPositionInterpolationSearch(intArray, 55);
        //no item found
        findPositionInterpolationSearch(intArray, 56);



    }

    public static void displayResults(int index, int comparisons) {
        // if element was found
        System.out.println("\nTotal comparisons made: " + comparisons);
        if(index != -1)
            System.out.printf("Element found at location: %d\nElement found at index: %d",(index +1), index);
        else
            System.out.println("Element not found.");
    }

    static void display() {
        System.out.print("[ ");
        for (int j : intArray) System.out.print(j + " ");
        System.out.print("]\n");
    }
}
