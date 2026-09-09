import java.util.Arrays;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int left =  0;
            for(int i = 0;i<nums.length;i++){

                while(set.contains(nums[i])){
                    if(nums[left]== nums[i]){
                        long diff = Math.abs(nums[left] -nums[i]);
                         if(diff<k){
                             return true;
        }   
                    }
                    else{
                        left++;
                    }
            
                }
                set.add(nums[i]);
            if(set.size() == k+1){
                set.remove(nums[left]);
                left++;

            }
            }
        return false;

    }
}