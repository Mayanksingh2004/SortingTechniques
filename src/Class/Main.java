package Class;

import Class.HeapSortTechnique.MyHeapSort;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] arr = {1,32,23,33,22,33,32,23,1};
        MyHeapSort heapSort = new MyHeapSort();
        System.out.println("Unsorted --> "+Arrays.toString(arr));
        heapSort.heapSort(arr);
        System.out.println("Sorted --> "+Arrays.toString(arr));
    }
}
