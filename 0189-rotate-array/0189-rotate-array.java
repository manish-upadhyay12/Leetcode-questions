class Solution {
    public void rotate(int[] arr1, int k) {

        k = k % arr1.length;

        int arr2[] = new int[k];
        int arr3[] = new int[arr1.length];

        int n1 = arr1.length - 1;
        int n2 = arr2.length - 1;

        for(int i = 0; i <= n2; i++){
            arr2[i] = arr1[n1 - i];
        }

        for(int i = 0; i < k; i++){
            arr3[i] = arr2[n2 - i];
        }

        int left = 0;

        for(int i = k; i < arr3.length; i++){
            arr3[i] = arr1[left++];
        }

        // Copy result back to original array
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = arr3[i];
        }
    }
}