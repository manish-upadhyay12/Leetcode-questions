import java.util.HashSet;
class Solution {
    public int countGoodSubstrings(String s) {
        int left = 0;
        int count = 0;
        HashSet<Character> set = new HashSet<>();

        for(int i = 0;i<s.length();i++){

            char ch = s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(left))  ;
                left++;
            }
            set.add(ch);
            if(set.size() ==3){
                count++;
                set.remove(s.charAt(left));
                left++;
            }
        }
        return count;
    }
}