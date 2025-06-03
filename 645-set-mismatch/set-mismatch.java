class Solution {
    public int[] findErrorNums(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // After cyclic sort, find the index where arr[index] != index + 1
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                // arr[index] = duplicate, index + 1 = missing
                return new int[]{arr[index], index + 1};
            }
        }

        // If no error found
        return new int[]{-1, -1};
    }

    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
