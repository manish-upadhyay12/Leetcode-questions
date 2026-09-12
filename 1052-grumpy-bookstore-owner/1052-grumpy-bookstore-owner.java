class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int zeroValid = 0;
        int maxwindow = 0;
        int windowSum = 0;
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                zeroValid += customers[i];
            }
        }
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                windowSum += customers[i];
            }
        }
        maxwindow = windowSum;

        for (int i = minutes; i < customers.length; i++) {
            if (grumpy[i - minutes] == 1) {
                windowSum -= customers[i - minutes];
            }

            if (grumpy[i] == 1) {
                windowSum += customers[i];

                maxwindow = Math.max(windowSum, maxwindow);
            }
        }
  return maxwindow + zeroValid;
    }
}