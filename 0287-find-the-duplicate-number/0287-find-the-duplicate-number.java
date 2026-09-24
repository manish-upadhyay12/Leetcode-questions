class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int fre[] = new int[n+1];
               for (int i = 0; i < nums.length; i++) {
           fre[nums[i]]++;
               }
            for (int j = 0; j <fre.length; j++) {
                if (fre[j] >1) {
                   return j;
                }
            
        }
        return  - 1;
    }
}