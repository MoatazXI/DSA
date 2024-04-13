import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    /**
     * This method implements the Merge Sort algorithm on an array of integers.
     * It is a divide and conquer algorithm that splits the array into two halves,
     * sorts them separately and then merges them.
     *
     * @param array  The array to be sorted
     * @param start  The starting index of the portion of the array to be sorted
     * @param end    The ending index of the portion of the array to be sorted
     */
    public static void mergeSort(int[] array, int start, int end) {
        // Base case: if the portion to be sorted has 1 or 0 elements, it is already sorted
        if (end <= start) return;

        // Calculate the midpoint of the array
        int midpoint = (end + start) / 2;

        // Recursively sort the first half of the array
        mergeSort(array, start, midpoint);

        // Recursively sort the second half of the array
        mergeSort(array, midpoint + 1, end);

        // Merge the two sorted halves
        merge(array, start, midpoint, end);

    }

    /**
     * This method merges two sorted portions of an array.
     * It creates two temporary arrays for the two halves of the original array,
     * compares the elements of these arrays one by one and puts the smaller one in the original array.
     *
     * @param array     The original array
     * @param start     The starting index of the first portion of the array
     * @param midpoint  The ending index of the first portion and starting index of the second portion of the array
     * @param end       The ending index of the second portion of the array
     */
    static void merge(int[] array, int start, int midpoint, int end) {
        // Initialize indices for the left and right halves and the merged array
        int i, j, k;

        // Calculate the lengths of the left and right halves
        int leftLength = midpoint - start + 1, rightLength = end - midpoint;

        // Create temporary arrays for the left and right halves
        int[] leftArray = new int[leftLength], rightArray = new int[rightLength];

        // Copy the elements of the left half into the temporary array
        for (i = 0; i < leftLength; i++) {
            leftArray[i] = array[start + i];
        }

        // Copy the elements of the right half into the temporary array
        for (j = 0; j < rightLength; j++) {
            rightArray[j] = array[midpoint + 1 + j];
        }

        // Reset the indices for the merge process
        i = j = 0;
        k = start;

        // Merge the two halves by comparing the elements one by one
        while (i < leftLength && j < rightLength) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // If there are remaining elements in the left half, copy them to the original array
        while (i < leftLength) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // If there are remaining elements in the right half, copy them to the original array
        while (j < rightLength) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[]{9 , 5 , 1 , 4};
        System.out.println("Array before sorting : " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Array after sorting : " + Arrays.toString(arr));
    }
}