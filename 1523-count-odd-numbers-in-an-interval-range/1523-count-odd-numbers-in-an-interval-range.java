class Solution {
    public int countOdds(int low, int high) {
        int count = 0;
   int st = low;
   int end  = high;
 
   while(st<=end){
    if(st==end){
        if(st%2==1){
            count++;
            break;
        }
    }

    if(st%2==1){
        st+=2;
        count++;

    }
    else{
        st++;
    }
    if(end%2==1){
        end-=2;
        count++;
    }
    else{
        end--;
    }
   }
return count;   
    }
}