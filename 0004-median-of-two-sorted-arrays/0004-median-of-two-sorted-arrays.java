class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i   = 0;
        int j = 0;
        int k = 0;
        int  m = nums1.length;
        int  n = nums2.length;
        int   [] c = new int[m+n];
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                c[k++] = nums1[i++];

            }
            else
            c[k++] = nums2[j++];
        }
        while(i<m){
            c[k++] = nums1[i++];
        }

        
        while(j<n){
            c[k++] = nums2[j++];
        }
       int   len = c.length;
if(len%2==0){
        int a = len/2;
        int b = a-1;
         return  (double)(c[a]+ c[b])/2;
    }
    else{
        return (double)c[len/2];
    }
    }
}