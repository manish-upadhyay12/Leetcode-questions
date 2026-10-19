class Solution {
    public int numberOfSteps(int num) {
      
         return count(num,0);
    }
   public static int count(int n,int step){
       if(n==0)
       return step;
   
   if(n%2==0){
    return count(n/=2,step+1);
    
   }

   return count(n-1,step+1);
    }
}
