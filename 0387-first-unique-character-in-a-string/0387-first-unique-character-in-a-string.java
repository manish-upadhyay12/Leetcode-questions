class Solution {
    public int firstUniqChar(String s) {
     int arr[] = new int[26];
       int count= 0;
       for(int start = 0;start<s.length();start++){
   
          arr[s.charAt(start)-'a']++;
       }

int finals = 0;
       for(int i = 0;i<s.length();i++){
        int ch = (int)s.charAt(i)-'a';
        if(arr[ch]==1){
           return i;
        }
       
       }
       return -1; 
           }
}