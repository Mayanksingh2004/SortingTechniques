package MeSearchAndSort;

public class Practice {
    public void sort(int[] arr) {
        if(arr.length>1){
            int half = arr.length / 2;
            int[] leftArray = new int[half];
            int[] rightArray = new int[arr.length - half];
            for (int i = 0; i < half; i++) {
                leftArray[i] = arr[i];
            }
            for (int i = half; i < arr.length; i++) {
                rightArray[i-half] = arr[i];
            }
            sort(leftArray);
            sort(rightArray);
            merge(arr, leftArray, rightArray);
        }
    }

    private void merge(int[] arr, int[] leftArray, int[] rightArray) {
        int left = 0, right = 0, out = 0;
        while (left < leftArray.length && right < rightArray.length) {
            if (leftArray[left] >= rightArray[right]) {
                arr[out++] = rightArray[right++];
            } else {
                arr[out++] = leftArray[left++];
            }
        }
        while (left<leftArray.length){
            arr[out++] = leftArray[left++];
        }
        while ((right<rightArray.length)){
            arr[out++] = rightArray[right++];
        }
    }
}
