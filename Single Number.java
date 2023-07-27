class Solution {
    public static int singleNumber(int[] nums) {
         HashSet<Integer> set = new HashSet<>();

	        for (int num : nums) {
	            if (!set.remove(num)) {
	                set.add(num);
	            }
	        }
	        return set.iterator().next();
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 2, 3, 4, 1, 2, 3};
	        int singleNum = singleNumber(nums);
	        System.out.println("The single number is: " + singleNum);
    }
}
