class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max = 0;
        for(int i=0;i<k;i++)
            max += nums[i];
        int temp = max ;
        for(int i=k;i<nums.length;i++)
        {
            temp = temp + nums[i] - nums[i-k];
            max = Math.max(temp,max);
        }
        return (max*1.0)/k;
    }
}
