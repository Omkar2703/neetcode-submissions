class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sumi = nums[0]; int max_sum = nums[0];
        for(int i = 1; i<n; i++){
            sumi = Math.max(nums[i], sumi+nums[i]);
            max_sum = Math.max(max_sum, sumi);
        }
        return max_sum;
    }
}
