package Class.QuickSortTechnique;

//Name :- Mayank Kumar Singh
//Sec D RollNo.-27
public class QuickSort {
    public void quickSortTechnique(int[] arr, int lower, int upper) {
        if (lower < upper) {
            int pivotIndex = partition(arr, lower, upper);
            quickSortTechnique(arr, lower, pivotIndex - 1);
            quickSortTechnique(arr, pivotIndex + 1, upper);
        }
    }

    public int partition(int[] arr, int lower, int upper) {
        int pivot = arr[lower];
        int down = lower;
        int up = upper;
        while (down < up) {
            while (arr[down] <= pivot) {
                //search for element greater than pivot
                down = down + 1;
                System.out.println("Down : " +down+"  :   "+arr[down]);
            }
            System.out.println("---------------------");
            while (arr[up] > pivot) {
                //search for element smaller than pivot
                up = up - 1;
                System.out.println("Up : "+up+"    :    "+arr[up]);
            }
            System.out.println("--------------------");
            if (down < up) {
                // if
                int temp = arr[down];
                arr[down] = arr[up];
                arr[up] = temp;
            }
        }
        System.out.println("END---------------"+arr[up]);
        arr[lower] = arr[up];
        arr[up] = pivot;
        return up;
    }
}
