class Solution {
    public int numberOfSteps(int num) {
        if(num==0){
            return 0;
        }
         return count(num,0);
    }
   public static int count(int n,int step){
       if(n==0)
       return step-1;
   
   if(n%2!=0){
    n-=1;
    step+=1;
   }

   return count(n/=2,step+1);
    }
}
