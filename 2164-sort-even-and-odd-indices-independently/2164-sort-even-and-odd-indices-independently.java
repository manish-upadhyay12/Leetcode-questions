 import java.util.Arrays;

class Solution {
    public int[] sortEvenOdd(int[] nums) {       
     int n = nums.length;
        int res[] = new int[n/2];
        int res1[] = new int[(n+1)/2];

        int k = 0;
        for(int i = 1;i<n;i+=2){
            res[k++] = nums[i];
        }
        Arrays.sort(res);
       int len = res.length-1;
        for(int i = 1;i<nums.length;i+=2){
            nums[i]  = res[len--];
        }
      // ---
        int k1 = 0;
        for(int i = 0;i<n;i+=2){
            res1[k1++] = nums[i];
        }
        Arrays.sort(res1);
  

        int len1 = 0;
        for(int i = 0;i<nums.length;i+=2){
            nums[i]  = res1[len1++];
        }
       return nums;
    }
}