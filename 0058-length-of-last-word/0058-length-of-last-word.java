import java.util.StringTokenizer;
class Solution {
    public int lengthOfLastWord(String s) {
       String length = "";
	StringTokenizer st = new StringTokenizer(s," ");
	while(st.hasMoreTokens()){
	    length = st.nextToken();
	
	}

	return length.length();
    }
}