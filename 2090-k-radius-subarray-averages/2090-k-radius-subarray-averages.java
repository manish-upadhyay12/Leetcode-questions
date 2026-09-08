import java.util.Arrays;
class Solution {
    public int[] getAverages(int[] nums, int k) {
        int index =2*k+1; 
        int left = 0;
        long  sum = 0;
        int ans[] = new int[nums.length];
            Arrays.fill(ans,-1);
            if(nums.length<index){
                return ans;
            }
        for(int i = 0;i<index;i++){
            sum+=nums[i];
        }
        ans[k] =(int)(sum/index);
    
    for(int i  = index;i<nums.length;i++){
        sum+=nums[i] ;
       sum-= nums[i-index];
        ans[++k] = (int)(sum/index);
    }
    return ans;
}
}