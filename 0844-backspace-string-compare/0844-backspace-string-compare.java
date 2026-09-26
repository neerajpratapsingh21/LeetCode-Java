class Solution {
    public boolean backspaceCompare(String s, String t) {
          StringBuilder S = new StringBuilder();
    StringBuilder T = new StringBuilder();

    for(int i = 0; i < s.length(); i++){
        if(s.charAt(i) == '#'){
            if(!S.isEmpty()){
                S.deleteCharAt(S.length() - 1);
            }
        }else{
            S.append(s.charAt(i));
        }
    }

    for(int i = 0; i < t.length(); i++){
        if(t.charAt(i) == '#'){
            if(!T.isEmpty()){
                T.deleteCharAt(T.length() - 1);
            }
        }else{
            T.append(t.charAt(i));
        }
    }

    return S.toString().equals(T.toString());
    }
}