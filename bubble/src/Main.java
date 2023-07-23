import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] unsorted = {9, 8, 6, 7, 4, 5, 1, 2, 3, 21, 11, 14, 19, 18, 13, 20};
        System.out.println("Array length: " + unsorted.length);
        System.out.println("Unsorted array: " + Arrays.toString(unsorted));
        System.out.println("After bubble sorting: " + Arrays.toString(bubbleSort(unsorted)));
    }

    private static int[] bubbleSort(int[] array) {

        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - j - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = 0;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }

}