package Com.My_Package.Array;

import java.util.Arrays;

public class InsertionSort {
    

    private static int[] isInsertion(int[] a) {

        for (int i = 1; i < a.length; i++) {

            int key = a[i];      // current element
            int j = i - 1;       // previous index

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j]; // shift element
                j--;
            }

            a[j + 1] = key;     // insert key at correct position
        }

        return a;
    }
    public static void main(String[] args) {

        int[] a = {5, 10, 1, 17, 3, 2};
        System.out.println(Arrays.toString(isInsertion(a)));
    }
}

