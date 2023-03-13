package sorting_techniques;

import static sorting_techniques.SortingMain.display;

/*
Merge sort is a sorting technique based on divide and conquer technique. With worst-case time complexity being
Ο(n log n), it is one of the most respected algorithms.

Merge sort first divides the array into equal halves and then combines them in a sorted manner.
 */
public class MergeSort {

    public static void mergeSort(int[] intArray, int low, int high) {
/*        int[] b = new int[intArray.length - 1];
        int mid;

        if(low < high) {
            mid = (low + high) / 2;
            mergeSort(intArray, low, mid);
            mergeSort(intArray, mid+1, high);
            merging(low, mid, high, intArray);
        } else {
            return;
        }*/
    }

    public static void merging(int low, int mid, int high, int[] a) {
/*        int l1, l2, i;
        int[] b = new int[a.length - 1];

        for(l1 = low, l2 = mid + 1, i = low; l1 <= mid && l2 <= high; i++) {
            if(a[l1] <= a[l2])
                b[i] = a[l1++];
            else
                b[i] = a[l2++];
        }

        while(l1 <= mid)
            b[i++] = a[l1++];

        while(l2 <= high)
            b[i++] = a[l2++];

        for(i = low; i <= high; i++)
            a[i] = b[i];*/
    }
}
