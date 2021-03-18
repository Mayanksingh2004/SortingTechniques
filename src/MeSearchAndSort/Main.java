package MeSearchAndSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[] {1,9,3,3,4,5,6,7,7,8};
        Practice n = new Practice();
        n.sort(arr);
//        QuickSort sort = new QuickSort();
//        sort.quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
