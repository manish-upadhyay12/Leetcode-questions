class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set  = new HashSet<>();
        int maxSize = 0;
        int stcount = 0;
        int left = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(left++));
                stcount--;
            }
            set.add(ch);
            stcount++;
            maxSize = Math.max(maxSize,stcount);
        }
        return maxSize;
    }
}