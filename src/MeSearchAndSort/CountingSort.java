package MeSearchAndSort;

import java.util.Arrays;

public class CountingSort {
    public void countingSort(int[] arr){
        int maxNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(maxNum<arr[i]){
                maxNum = arr[i];
            }
        }
        int[] countArray = new int[maxNum+1];
        for (int i = 0; i < arr.length; i++) {
            countArray[arr[i]]++;
        }
        for (int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i-1];
        }
        System.out.println(Arrays.toString(countArray));
        int[] temp = new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--) {
            temp[countArray[arr[i]]-1] = arr[i];
        }
        System.out.println(Arrays.toString(temp));
    }
}
