class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer> st = new Stack<>();
		
		for(String i :  arr) {


			if(i.equals("C") && !st.isEmpty()) {
				st.pop();
			}
			else if(i.equals("D") ) {
				 int first = st.peek()*2;
				 st.push(first);
			}
			
			else if(i.equals("+") ) {
				int last = st.pop();
				int second_last = st.peek();
				int sum = last + second_last;
				st.push(last);
				st.push(sum);
			}
			else{
                st.push(Integer.parseInt(i));
            }
		}
		int final_sum = 0;
		
		for(int n : st){
		    final_sum+= n;
	}
	return final_sum;
    }
}