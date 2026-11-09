class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max = 0;
        int ans = 0;
        int area =0;
        for(int i = 0;i<dimensions.length;i++)
        {
         area = dimensions[i][0]* dimensions[i][1];
            int dsum = dimensions[i][0]*dimensions[i][0] + dimensions[i][1]*dimensions[i][1];
            
            if(dsum==max &&  area>ans){
                ans = area;
                area  = 0;
            }
            if(dsum>max){
                max = dsum;
                ans  = area;
                area = 0;
                }
            
        }
        return ans;
    }
}