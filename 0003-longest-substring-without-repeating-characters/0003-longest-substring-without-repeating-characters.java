class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set  = new HashSet<>();
        int maxSize = 0;        
        int left = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(left++));                
            }
            set.add(ch);           
            maxSize = Math.max(maxSize,set.size());
        }
        return maxSize;
    }
}