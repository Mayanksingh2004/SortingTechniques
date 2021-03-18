package MeSearchAndSort;

public class MergeSort {
    public void mergeSort(int[] arr) {
        if (arr.length > 1) {
            int halfSize = arr.length / 2;
            int[] leftArray = new int[halfSize];
            int[] rightArray = new int[arr.length - halfSize];
            for (int i = 0; i < halfSize; i++) {
                leftArray[i] = arr[i];
            }
            int j=0;
            for (int i = halfSize; i < arr.length; i++) {
                rightArray[j++] = arr[i];
            }
            mergeSort(leftArray);
            mergeSort(rightArray);
            merge(arr, leftArray, rightArray);
        }
    }

    private void merge(int[] outputArray, int[] leftArray, int[] rightArray) {
        int iLeft = 0;
        int iRight = 0;
        int iOutput = 0;
        while (iLeft < leftArray.length && iRight < rightArray.length) {
            if (leftArray[iLeft] <= rightArray[iRight]) {
                outputArray[iOutput] = leftArray[iLeft++];
            } else {
                outputArray[iOutput] = rightArray[iRight++];
            }
            iOutput++;
        }
        while (iLeft < leftArray.length) {
            outputArray[iOutput++] = leftArray[iLeft++];
        }
        while (iRight < rightArray.length) {
            outputArray[iOutput++] = rightArray[iRight++];
        }
    }
}
