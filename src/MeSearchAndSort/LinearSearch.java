package MeSearchAndSort;

public class LinearSearch {

    public boolean linearSearch(int[] arr, int element) {
        boolean response = false;
        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]) {
                response = true;
            }
        }
        return response;
    }
}
