package MeSearchAndSort;

public class QuickSort {
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int pIndex = low;
        for (int i = low; i < high; i++) {
            if (pivot >= arr[i]) {
                int temp = arr[i];
                arr[i] = arr[pIndex];
                arr[pIndex] = temp;
                pIndex++;
            }
        }
        arr[high] = arr[pIndex];
        arr[pIndex] = pivot;
        return pIndex;
    }
}
