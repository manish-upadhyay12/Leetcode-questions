class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        int k = 0;
        int sub = 0;
        int i = 0;
        int j = 0;

        while (i < arr1.length) {
            if (j < arr2.length) {
                sub = arr1[i] - arr2[j];

                if (Math.abs(sub) <= d) {
                    i++;
                    j = 0;
                    k = 0;
                    continue;
                } else {
                    k++;
                    j++;
                }
            }

            if (k == arr2.length) {
                count++;
                i++;
                j = 0;
                k = 0;
            }
        }

        return count;
    }
}