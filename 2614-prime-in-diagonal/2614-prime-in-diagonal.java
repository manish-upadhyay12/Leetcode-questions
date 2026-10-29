class Solution {
       public static int prime(int val){
            if(val<=1){ 
            return 0;
            }
        for(int i = 2;i<=val/i;i++)
            {
                if(val%i==0){
                    return 0;
                }
            }
        return val;
        }
  
 
    public int diagonalPrime(int[][] arr) {
    
     
  int  max = 0;
       
        int k = arr.length-1;
        for(int i  = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                   if(i==j){
                       int max1 = prime(arr[i][j]);
                       if(max1>max){
                           max  = max1;
                       }
                       
                   }
                 if(j ==k && k>-1){
    int max2 = prime(arr[i][j]);
                 k--;
                    if(max2>max){
                        max = max2;
                    }
                       
                }
                
            }
            
        }
 return max;
     //   System.out.println("Try clicking the Run button.");
    }
}