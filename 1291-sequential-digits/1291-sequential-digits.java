class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        String digits = "123456789";

        // try every window length from 2 up to 9
        for (int length = 2; length <= 9; length++) {
            // slide the window across the digit string
            for (int start = 0; start + length <= 9; start++) {
                String window = digits.substring(start, start + length);
                int num = Integer.parseInt(window);

                if (num >= low && num <= high) {
                    result.add(num);
                }
            }
        }

        return result;
    }
}