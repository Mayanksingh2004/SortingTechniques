package Class.HeapSortTechnique;

import java.util.Arrays;

public class MyHeapSort {
    /*   private void heap(int[] arr) {
           for (int i = 0; i < arr.length; i++) {
               insert(arr, i);
           }
       }

       private void insert(int[] arr, int childIndex) {
           if (childIndex == 0) {
               return;
           } else {
               int parentIndex = (childIndex - 1) / 2;
               while (parentIndex >= 0 && arr[childIndex] > arr[parentIndex]) {
                   swap(arr, parentIndex, childIndex);
                   childIndex = parentIndex;
                   parentIndex = (childIndex - 1) / 2;
               }
           }
       }

       private void swap(int[] arr, int parentIndex, int childIndex) {
           int temp = arr[parentIndex];
           arr[parentIndex] = arr[childIndex];
           arr[childIndex] = temp;
       }
       */
    public void heapSort(int[] arr) {
        // step1 create a heap MaxHeap
        //in place arr --  heap
        //first element is already inserted in heap\
        for (int i = 0; i < arr.length; i++) {
            //heap creation code
            int child = i;
            int parent = (child - 1) / 2;
            while (parent >= 0 && arr[parent] < arr[child]) {
                //swap parent and child
                swap(arr, child, parent);
                child = parent;
                parent = (child - 1) / 2;
            }
        }//step 1 ends : MAXHEAP created
        //step 2 :removing the max element  -> root and placing it onto the array at the index starting from size-1
        System.out.println("HeapArray --> "+Arrays.toString(arr));
        for (int i = arr.length - 1; i >= 0; i--) {
            //apply removal on maxHeap
            swap(arr, i, 0);
            int parent = 0;
            int maxChild = getMaxChild(arr, parent, i);
            while( parent < i && arr[parent] < arr[maxChild]){
                //swap
                swap(arr,maxChild,parent);
                parent = maxChild;
                maxChild = getMaxChild(arr,parent,i);
                if(maxChild == 0){
                    break;
                }
            }
        }//step 2 ends array is sorted
    }

    private int getMaxChild(int[] arr, int parent, int lastSortedIndex) {
        int response = 0;
        int leftChild = (2 * parent) + 1;
        int rightChild = (2 * parent) + 2;
        if (leftChild < lastSortedIndex && rightChild < lastSortedIndex){
            if(arr[leftChild] >= arr[rightChild]){
                response = leftChild;
            }
            else{
                response = rightChild;
            }
        }
            return response;
    }

    private void swap(int[] arr, int child, int parent) {
        int temp = arr[parent];
        arr[parent] = arr[child];
        arr[child] = temp;
    }
}
