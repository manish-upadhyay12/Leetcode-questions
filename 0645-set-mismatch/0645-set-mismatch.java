class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int duplicate = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                duplicate = entry.getKey();
                break;
            }
        }

        int missing = 0;
        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                missing = i;
                break;
            }
        }

        return new int[] { duplicate, missing };
    }
}