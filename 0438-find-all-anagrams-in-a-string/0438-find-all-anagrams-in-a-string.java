class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>  result  = new ArrayList<>();
        if(p.length()>s.length()){
            return result;
        }
        int fre[] = new int[26];
        int windowFre[] = new int[26];

        for(int i  = 0;i<p.length();i++){
            fre[p.charAt(i)-'a']++;
        } 
        int  windowSize = p.length();
        for(int i = 0;i<windowSize;i++){
            windowFre[s.charAt(i)-'a']++;
}   
if(Arrays.equals(fre,windowFre)){
    result.add(0);
}

        for(int i = windowSize;i<s.length();i++){
            windowFre[s.charAt(i)-'a']++;
            windowFre[s.charAt(i-windowSize)-'a']--;
            if(Arrays.equals(fre,windowFre)){
                     result.add(i-windowSize+1);
}
        }
  return result;
  
 }
}