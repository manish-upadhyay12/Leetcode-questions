import java.util.ArrayList;
import java.util.HashSet;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> li  =  new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            if(set.contains(n)){
                li.add(n);
            }
            else{
                set.add(n);
            }
        }
        return li;
    }
}