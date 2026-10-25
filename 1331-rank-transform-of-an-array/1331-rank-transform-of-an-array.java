import java.util.HashSet;

class Solution {
 
public static int find(int arr[] ,int target){
                int start = 0;
                int end   = arr.length-1;
                int index= 0;
                while(start<=end){
                    int mid = start  +(end - start)/2;
                    if(arr[mid] == target)
                    {
                        index = mid+1;
                        break;
                    }
                    else if(arr[mid]>target){
                        end = mid-1;
                    }
                    else{
                        start = mid+1;
                    }
                }
                return index;
}
   public int[] arrayRankTransform(int[] arr) {
              

        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }

        int res[] = new int[set.size()];

        int k = 0;

        for (int i : set) {
            res[k++] = i;
        }
        Arrays.sort(res);

        for (int i = 0; i < arr.length; i++) {
                int index = find(res,arr[i]);
                arr[i]=  index;
           

        }
        return arr;
    }
}