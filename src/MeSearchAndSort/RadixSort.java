package MeSearchAndSort;

import java.util.Arrays;

public class RadixSort {
    public void radixSort(int[] arr, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(arr, i, radix);
        }
    }

    private void radixSingleSort(int[] arr, int position, int radix) {
        int[] countArray = new int[radix];
        for (int j = 0; j < arr.length; j++) {
            countArray[getDigit(position, arr[j], radix)]++;
        }
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }
        int[] temp = new int[arr.length];
        for (int j = arr.length - 1; j >= 0; j--) {
            temp[--countArray[getDigit(position,arr[j],radix)]] = arr[j];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }

    private int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }
}
