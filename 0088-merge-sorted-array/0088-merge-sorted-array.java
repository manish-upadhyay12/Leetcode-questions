class Solution {
    public void merge(int[] left, int a, int[] right, int b) { 

       
        int i =a-1 ;
        int j = b-1;
        int k  = a + b -1;
    

        while(i>=0 && j>=0 ){
            if(left[i]>right[j]){
                left[k--] =  left[i--];
            }
            else{
                left[k--] =  right[j--];
            }

        }
        while(j>=0){
            left[k--] = right[j--];
        }
        
    }

			}
			
		