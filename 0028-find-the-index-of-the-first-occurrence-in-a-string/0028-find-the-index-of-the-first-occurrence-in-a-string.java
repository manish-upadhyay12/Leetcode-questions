class Solution {
    public int strStr(String haystack, String needle) {
            int   i = 0;
            int j = 0;
            int k = needle.length();
            while(i<haystack.length()){
                if(j<k &&haystack.charAt(i) ==needle.charAt(j) ){
                    i++;
                    j++;

                
                        if(j == needle.length()){
                            return i-j;
                        }
                }
            
             else{
                    i= i-j+1;
                   j=0; 
                }
            }
     return -1;
    }
}