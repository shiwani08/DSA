class Solution {
    public int findDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        int j = 0, i = 0, dup = -1;
        int n = nums.length; 

        for (int num : nums) {
            if(set.contains(num))
            return num;

            set.add(num);
        }

        return dup;
    }
}