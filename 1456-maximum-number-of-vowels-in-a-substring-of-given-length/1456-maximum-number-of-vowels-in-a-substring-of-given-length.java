class Solution {
    public int maxVowels(String s, int k) {
       
       int left = 0;
       int vowel_count=0;
       for(int  i = 0;i<k;i++){
        char ch = s.charAt(i);
        if(isvowel(ch)){
            vowel_count++;
        }
       }
       int max_vowel = vowel_count;
       for(int i = k;i<s.length();i++){
        char ch1 = s.charAt(left);
        if(isvowel(ch1)){
            vowel_count--;
        }
        left++;
        char ch2 = s.charAt(i);
            if(isvowel(ch2)){
            vowel_count++;
        }
        max_vowel = Math.max(max_vowel,vowel_count);
       

       }

      
       return max_vowel;

    }
      public static boolean isvowel( char ch){
             return ch =='a' || ch == 'e' || ch == 'i' || ch =='o' || ch =='u';
        }
}