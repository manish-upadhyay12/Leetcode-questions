class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        long max = 0;
        int left = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            int value = nums[i];
           while(set.contains(value)){
            sum-=nums[left];
            set.remove(nums[left]);
            left++;
           }
           set.add(value);
           sum+= value;
           
           if(set.size()==k){
            max = Math.max(sum,max);
            sum-=nums[left];
            set.remove(nums[left]);
                left++;
             
                       }
        }
        return max;
    }
}