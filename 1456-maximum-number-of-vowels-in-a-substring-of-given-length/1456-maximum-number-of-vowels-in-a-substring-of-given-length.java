class Solution {
    public int maxVowels(String s, int k) {
       
       int left = 0;
       int vowel_count=0;
       for(int  i = 0;i<k;i++){
        char ch = s.charAt(i);
        if(ch =='a' || ch== 'e' || ch == 'i' || ch =='o' || ch =='u'){
            vowel_count++;
        }
       }
       int max_vowel = vowel_count;
       for(int i = k;i<s.length();i++){
        char ch1 = s.charAt(left);
        if(ch1 =='a' || ch1 == 'e' || ch1 == 'i' || ch1 =='o' || ch1 =='u'){
            vowel_count--;
        }
        left++;
        char ch2 = s.charAt(i);
            if(ch2 =='a' || ch2 == 'e' || ch2  == 'i' || ch2  =='o' || ch2 =='u'){
            vowel_count++;
        }
        max_vowel = Math.max(max_vowel,vowel_count);
       
       }
       return max_vowel;
    }
}