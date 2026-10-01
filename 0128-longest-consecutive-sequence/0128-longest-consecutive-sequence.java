import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        ;
        int max = 0;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        if (set.isEmpty()) {
            return 0;
        }

        for (int i : set ) {

            if (!set.contains(i - 1)) {
                int count = 1;
                j = i;
                while (set.contains(j + 1)) {

                    j++;
                    count++;
                }

                max = Math.max(max, count);

            }

        }
        return max;
    }
}