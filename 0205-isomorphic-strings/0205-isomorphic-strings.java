class Solution {
    public boolean isIsomorphic(String s, String t) {
       int []  arr1 = new int[s.length()];
       int []  arr2 = new int[t.length()];

       for(int i = 0;i<arr1.length;i++){
          
          char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
        for(int j = i;j<arr1.length;j++){
            if(arr1[j]==0 && ch1 == s.charAt(j)){
                arr1[j] = i+1;
            }

              if(arr2[j]==0 && ch2 == t.charAt(j)){
                arr2[j] = i+1;
            }
        }
           
       }
       for(int i = 0;i<arr1.length;i++){
         if(arr1[i]!=arr2[i]){
                 return false;
         }
       }
       return true;
        }
    }
