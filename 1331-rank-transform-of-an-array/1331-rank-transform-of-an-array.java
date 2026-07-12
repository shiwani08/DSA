class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        // get sorted unique values
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        // assign rank to each unique value
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int num : sorted) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }

        // map original array to ranks
        for (int i = 0; i < n; i++) {
            result[i] = rankMap.get(arr[i]);
        }

        return result;
    }
}