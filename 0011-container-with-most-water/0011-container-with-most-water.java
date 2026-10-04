class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0;
        int right = height.length-1;
        while(left<right){
            int h = Math.min(height[left],height[right]);
            int w = right-left;
            int water = w*h;
            maxWater  = Math.max(water,maxWater);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxWater;
    }
}