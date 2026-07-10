class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums){
            pq.offer(num);
        }
        for(int i = 0; i<n; i++){
            nums[i] = pq.poll();
        }
        return nums;
    }
}