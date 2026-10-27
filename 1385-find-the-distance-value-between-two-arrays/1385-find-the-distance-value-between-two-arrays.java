public class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
;
        for(int i = 0;i<arr1.length;i++){
         boolean  yes = true;
            for(int j = 0;j<arr2.length;j++){
                int sub = (int)Math.abs(arr1[i] - arr2[j]);
                if(sub <=d){
                    yes = false;
                    break;
                }
            
           
        }
        if(yes)  count++;
        

        else  continue; ;
    }
    return count;
}
}