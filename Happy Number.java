class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        while (n!=1 && !set.contains(n)){
            set.add(n);
            int sum = 0;
            while (n!=0){
                int remainder = n%10;
                sum = sum + (remainder*remainder);
                n = n/10;
            }
            n = sum;
        }
       if(n == 1){
           return true;
       }
       else{
           return false;
       }
    }
} 

