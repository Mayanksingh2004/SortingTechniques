package Class.MergeSortTechnique;

public class MyMergeSort {

//    public int[] merge(int[] arr , int[] brr){
//        int[] crr = new int[arr.length + brr.length];
//        int i=0,j=0,k=0;
//        while (i<arr.length && j< brr.length){
//            if(arr[i] < brr[j]){
//                crr[k++] = arr[i++];
//            }
//            else{
//                crr[k++]=brr[j++];
//            }
//        }
//        if(i<arr.length){
//            while(i<arr.length){
//                crr[k++] = arr[i++];
//
//            }
//        }else{
//            while(j<brr.length){
//                crr[k++] = brr[j++];
//            }
//        }
//        return crr;
//    }

    public void mergeSort(int[] arr, int low, int high) {
        //step 1
        if (low >= high) {
            return;
        }
        //step 2
        int mid = (low + high) / 2;
        //step 3
        mergeSort(arr, low, mid);
        //step 4
        mergeSort(arr, mid + 1, high);
        //step 5
        merge(arr, low, mid, high);
    }

    public void merge(int[] arr, int low, int mid, int high) {
        //step 1
        int s = high + 1;
        int[] crr = new int[s];
        //step 2
        int i = low;
        int j = mid + 1;
        int k = 0;
        //step 3
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                crr[k] = arr[i];
                k++;
                i++;
            } else {
                crr[k] = arr[j];
                k++;
                j++;
            }
        }
        //step 4
        if (i > mid) {
            //process j
            while (i <= mid) {
                crr[k] = arr[j];
                k++;
                j++;
            }
        } else {
            while (i <= mid) {
                crr[k] = arr[i];
                k++;
                i++;
            }
        }
        //step 5
        int p = 0;
        for (int x = low; x <= high; x++) {
            arr[x] = crr[p];
            p++;
        }
    }
}
