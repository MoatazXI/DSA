import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * we need to move negative numbers to left of array and positive to right
 * without sorting them , same order
 *  1 , -1 , -5 , 2 , 3   >>  -1 , -5 , 1 , 2 , 3
 * using merge sort technique
 * O(nlogn)
 * */
public class Main {
    public static void segregate(int[] array, int start, int end) {
        if (end <= start) return;

        int midpoint = (start + end) / 2;
        segregate(array, start, midpoint);
        segregate(array, midpoint + 1, end);
        merge(array, start, midpoint, end);

    }

    private static void merge(int[] array, int start, int mid, int end) {
        int i = 0, j = 0, k = 0;

        int leftLength = mid - start + 1 , rightLength = end - mid;
        int[] left_array = new int[leftLength] , right_array = new int[rightLength];

        for (i = 0; i < leftLength; i++) {
            left_array[i] = array[i + start];
        }
        for (j = 0; j < rightLength; j++) {
            right_array[j] = array[j + mid + 1];
        }

        i = j = 0;
        k = start;
        while(i < leftLength && left_array[i] <= 0){
            array[k] = left_array[i];
            i++;
            k++;
        }

        while(j < rightLength && right_array[j] <= 0){
            array[k] = right_array[j];
            j++;
            k++;
        }

        while(i < leftLength){
            array[k] = left_array[i];
            i++;
            k++;
        }
        while (j < rightLength){
            array[k] = right_array[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {

        int[] arr = new int[]{6, -5, 12, 10, -9, -1};
        System.out.println(Arrays.toString(arr));
        segregate(arr, 0 , arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
