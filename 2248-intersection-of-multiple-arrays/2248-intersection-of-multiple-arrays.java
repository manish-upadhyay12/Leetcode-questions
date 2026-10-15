import java.util.Collections;
import java.util.ArrayList;
class Solution {
    public List<Integer> intersection(int[][] nums) {
      
        ArrayList<Integer> lis = new ArrayList<>();

        ArrayList<Integer> lis1 = new ArrayList<>();
        
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums[i].length;j++){
               lis1.add(nums[i][j]);
            }
        }

            for(int i = 0;i<nums[0].length;i++){
                int count = Collections.frequency(lis1,nums[0][i]);
                if(count >=nums.length){
                    lis.add(nums[0][i]);
                }
            }
        Collections.sort(lis);
        return lis;
    }
}