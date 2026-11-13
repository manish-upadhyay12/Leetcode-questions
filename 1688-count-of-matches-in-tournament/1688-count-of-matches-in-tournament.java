class Solution {
    public int numberOfMatches(int n) {
        int no_of_team = 0;
       
        while(n!=1){
            if(n%2==0){
                no_of_team += n/2;
                n = n/2;
            }
            else{
                no_of_team += (n-1)/2;
                n = (n-1)/2 + 1;
            }

        }
        return no_of_team;
    }
}