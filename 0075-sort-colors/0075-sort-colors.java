class Solution {
    public void sortColors(int[] arr) {
for(int j = 0;j<arr.length-1;j++){
       for(int i = 0;i<arr.length-1;i++){
           
            if(arr[i]>arr[i+1]){
                 int tem = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = tem;
            }
        }
}
    }

}