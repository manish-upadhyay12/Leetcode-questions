class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> str = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!st.isEmpty() && ch == '#'){
                st.pop();
            }
            else if(ch!='#') {
                st.push(ch);
            }
        }
       for(int i = 0;i<t.length();i++){
            char ch = t.charAt(i);
 if(!str.isEmpty() && ch == '#'){
                str.pop();
            }
            else if(ch!='#') {
                str.push(ch);
            }
         }
     
            return st.equals(str);
      }
    }
