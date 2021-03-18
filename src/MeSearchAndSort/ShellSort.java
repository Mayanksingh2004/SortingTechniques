package MeSearchAndSort;

import java.util.Arrays;

public class ShellSort {

    public void shellSort(int[] arr) {
        for (int gap = arr.length / 2; gap > 0 ; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int val = arr[i];
                int j = i;
                while (j>=gap && arr[j-gap]>val){
                    arr[j] = arr[j-gap];
                    j -= gap;
                }
                arr[j] = val;
            }
        }
    }

    public void sort(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int newElement = arr[i];
                int j = i;
                while (j >= gap && arr[j-gap] > newElement) {
                    arr[j] = arr[j-gap];
                    j -= gap;
                }
                arr[j] = newElement;
            }
        }
    }
}
