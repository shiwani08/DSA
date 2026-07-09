class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i;
        for (i = 0; i < n; i++){
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1);
        // for (i=0; i<nums1.length; i++)
        //     System.out.println(nums1[i]);
    }
}