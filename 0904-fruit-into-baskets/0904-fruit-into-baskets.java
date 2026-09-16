class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < fruits.length; right++) {

            // Add current fruit
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            // More than 2 different fruit types
            while (map.size() > 2) {

                int fruit = fruits[left];

                map.put(fruit, map.get(fruit) - 1);

                // If no fruit of this type remains, remove it
                if (map.get(fruit) == 0) {
                    map.remove(fruit);
                }

                left++;
            }

            // Current window is valid
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}