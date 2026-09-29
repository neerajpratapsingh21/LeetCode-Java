class Solution {
public:
    string largestNumber(vector<int>& nums) {
        vector<string> temp;
        for(int i : nums){
            temp.push_back(to_string(i));
        }
       sort(temp.begin(),temp.end(),[](string a,string b){ return a+b > b+a ;});
       if(temp[0]=="0") return "0";
       string ans="";
       for(string i: temp){
        ans+=i;
        
       } 
       return ans;
    }
};