class Solution {
    public boolean checkDivisibility(int n) {
          int sum = 0;
        int product  = 1;
int tem = n;
        while(n>0){
            sum += n%10;
            product*= n%10;
            n/=10;
        }
        int final_sum = sum+ product;
        if(tem%final_sum==0){
            return true;
        }
        else{
            return false
            ;
        }
    }
}