class Solution {
    public int findNumbers(int[] nums) {
        
        int count = 0;
        for (int num : nums) {
            if (hasEvenDigits(num)) {
                count++;
            }
        }
        return count;
    }
    
    public static boolean hasEvenDigits(int num) {
        int digitCount = 0;
        while (num != 0) {
            num /= 10;
            digitCount++;
        }
        return digitCount % 2 == 0;
    }
}
