
import java.util.HashSet;
class Solution {
    public int removeDuplicates(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
      
       int  k = 0;
       for(int n : nums){
        if(set.contains(n)){
            continue;
        }
        else{
            set.add(n);
           nums[k] = n;
            k++;
        }
       }
       return k;
           }
}