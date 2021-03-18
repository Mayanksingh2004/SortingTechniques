package MeSearchAndSort;

public class InsertionSort {

    public void sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int curr = i;
            while(curr>0 && arr[curr-1] > val){
                arr[curr] = arr[curr-1];
                curr--;
            }
            arr[curr]=val;
        }
    }

}
