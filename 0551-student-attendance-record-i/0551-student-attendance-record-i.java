class Solution {
    public boolean checkRecord(String s) {
        int Acount = 0;
        int Lcount = 0;

        for(int i = 0;i<s.length();i++){
            char ch1 = s.charAt(i);
            
               if(ch1=='L'){
                Lcount++;
            }
           
            else{
                Lcount =0;
            }
            
        
          if(ch1=='A'){
                Acount++;
            }
            if(Acount==2){
                return false;
            }
             if(Lcount == 3){
               return false;
            }
           
        }
       
       return true;
        
        
    }
}