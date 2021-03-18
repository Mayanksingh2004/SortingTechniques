package MeSearchAndSort;

public class SelectionSort {
    public void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            swap(arr, minIndex, i);
        }
    }

    private void swap(int[] arr, int minIndex, int j) {
        int temp = arr[minIndex];
        arr[minIndex] = arr[j];
        arr[j] = temp;
    }
}
