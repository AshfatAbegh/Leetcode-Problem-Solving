class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == majority) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    majority = nums[i];
                    count = 1;
                }
            }
        }

        count = 0;
        for (int num : nums) {
            if (num == majority) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return majority;
        } else {
            return -1;
        }
    }

    public void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int majority = majorityElement(nums);
        System.out.println("Majority element: " + majority);
    }
}
