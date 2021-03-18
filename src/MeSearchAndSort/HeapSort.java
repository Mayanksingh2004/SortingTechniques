package MeSearchAndSort;

public class HeapSort {

    public void heapSort(int[] arr) {
        buildHeap(arr);
        shrinkHeap(arr);
    }

    private void buildHeap(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int childIndex = i;
            int parentIndex = (i - 1) / 2;
            while (parentIndex >= 0 && arr[childIndex] > arr[parentIndex]) {
                swap(arr, childIndex, parentIndex);
                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            }
        }
    }

    private void shrinkHeap(int[] arr) {
        int curr = arr.length;
        while (curr-- > 0) {
            int parent = 0;
            swap(arr, 0, curr);
            int maxIndex = maxChild(arr, parent, curr);
            while (maxIndex > 0 && arr[maxIndex] > arr[parent]) {
                swap(arr,parent,maxIndex);
                parent = maxIndex;
                maxIndex = maxChild(arr,parent,curr);
                if(maxIndex == -1){
                    break;
                }
            }
        }

    }

    private int maxChild(int[] arr, int index, int last) {
        int leftChild = index * 2;
        int rightChild = leftChild + 1;

        if (leftChild < last && rightChild < last) {
            if (arr[leftChild] >= arr[rightChild]) {
                return leftChild - 1;
            } else {
                return rightChild - 1;
            }
        } else if (leftChild < last) {
            return leftChild - 1;
        } else if (rightChild < last) {
            return rightChild - 1;
        }
        return -1;
    }

    private void swap(int[] arr, int childIndex, int parentIndex) {
        int temp = arr[childIndex];
        arr[childIndex] = arr[parentIndex];
        arr[parentIndex] = temp;
    }
}
