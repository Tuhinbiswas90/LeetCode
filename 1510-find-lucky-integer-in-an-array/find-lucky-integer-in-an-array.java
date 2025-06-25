class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        // Count frequency of each number
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int result = -1;

        // Check for lucky integers
        for (int num : freq.keySet()) {
            if (freq.get(num) == num) {
                result = Math.max(result, num); // Get the largest lucky integer
            }
        }

        return result;
    }
}