class Solution {
    public static String build(String s){
 Stack<Character> ans=new Stack<>();
 for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='#'){
            if(!ans.empty()){
                ans.pop();
            }
        }else{
            ans.push(s.charAt(i));
        }
    }
    return  String.valueOf(ans);
}
    public boolean backspaceCompare(String s, String t) {
         return  build(s).equals(build(t));
    }
}