class Solution {
    public int[] sortArray(int[] nums) {
     return helper(nums,0,nums.length-1);
}
public static int[] helper(int a[],int s,int e){
    if(s==e){
        return new int[]{a[s]};
    }
    int mid = s+(e-s)/2;
    int left[] = helper(a,s,mid);
    int right[] = helper(a,mid+1,e);
    int result[] = mergsort(left,right);
    return result;
}

public static int[] mergsort(int left[],int right[]){
    int i = 0;
    int j = 0;
    int k = 0;
    int m = left.length;
    int n = right.length;

    int c[] = new int[m+n];


    while(i<m && j<n){
        if(left[i]<right[j]){
            c[k++] = left[i++];
        }
        else{
            c[k++] = right[j++];
        }
    }
        while(i<m){
            c[k++] = left[i++];
        }
        while(j<n){
            c[k++] = right[j++];
        }
        return c;
    }

}