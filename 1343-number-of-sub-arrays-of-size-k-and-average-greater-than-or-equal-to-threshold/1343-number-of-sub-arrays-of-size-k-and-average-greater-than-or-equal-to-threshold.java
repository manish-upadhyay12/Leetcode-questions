class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left = 0;
        int sum = 0;
        int no_sub_array = 0;
        double average = 0;
        for(int i  = 0;i<k;i++){
            sum+=arr[i];
                }
        average = sum/k;
        if(average>=threshold){
            no_sub_array++;
        }
        for(int i  = k;i<arr.length;i++){
            sum+=arr[i] - arr[left];
            left++;
        average = sum/k;
        if(average>=threshold){
            no_sub_array++;
        }
        }
        return  no_sub_array;
    }
}