package MeSearchAndSort;

public class Binary_Search {
    int element;
    int[] arr;

    public Binary_Search(int[] arr, int element) {
        this.element = element;
        this.arr = arr;
    }

    public boolean binarySearchRecursive(int low , int high){
        if (low <= high){
            int mid=(low+high)/2;
            if (arr[mid] == element){
                return true;
            }else if(arr[mid] > element){
                return binarySearchRecursive(low,mid-1);
            }else {
                return binarySearchRecursive(mid+1,high);
            }
        }
        return false;
    }

    public boolean binarySearchIterative(int low , int high){
        int mid = (low+high)/2;
        while (low <= high){
            if(arr[mid] == element){
                return true;
            }else if(arr[mid] > element){
                high = mid-1;
            }else {
                low = mid +1;
            }
            mid = (low+high)/2;
        }
        return false;
    }
}
