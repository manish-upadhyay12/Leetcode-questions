class Solution {
    public int missingNumber(int[] arr) {
int k = 0;
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
         
           sum1+= arr[i];
        }

        for (int i = 0; i <= arr.length; i++) {
           sum+=i;
          
        }
            
            
        
        return sum-sum1;
    }
}