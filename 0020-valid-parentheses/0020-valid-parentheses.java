class Solution {
    public boolean isValid(String s) {
        if(s.length()<2) return false;
        Stack <Character> st=new Stack<>();
        for(int i=0; i<s.length(); i++){
        if(!st.isEmpty() &&
         ((s.charAt(i)==')' && st.peek()=='(' ) ||
         (s.charAt(i)==']' && st.peek()=='[') ||
         (s.charAt(i)=='}' && st.peek()=='{')) )  {
            st.pop();
            }else{
                st.push(s.charAt(i));
            }
           
        }
        if(st.size()==0){
            return true;
        }
        return false;
    }
}