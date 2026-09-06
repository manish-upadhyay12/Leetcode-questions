class Solution {
    public void sortColors(int[] arr) {
int first = 0;
int last = arr.length-1;
int mid = 0;

while(mid<=last){

    if(arr[mid] ==0){
        int temp1  = arr[first];
        arr[first] = arr[mid];
        arr[mid] = temp1;
        mid++;
        first++;
    }
   else  if(arr[mid]==2){
        int temp2 = arr[mid];
        arr[mid] = arr[last];
        arr[last] = temp2;
        last--;
    }
    else{
        mid++;
    }

}

    }

}