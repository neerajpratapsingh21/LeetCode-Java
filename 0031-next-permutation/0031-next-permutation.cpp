class Solution {
    public :
    void reverse(vector<int>& nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public :
    void swap(vector<int>& nums,int ind1,int ind2){
        if(ind2==-1) return ;
        int temp=nums[ind1];
        nums[ind1]=nums[ind2];
        nums[ind2]=temp;
    }
public:
    void nextPermutation(vector<int>& nums) {
        int n=nums.size();
        int ind1=-1;
        int ind2=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind1=i;
                break;
            }
        }
        if(ind1 == -1){
            reverse(nums,0,n-1);
            return ;
        }
        for(int i=n-1;i>=0;i--){
            if(nums[ind1]<nums[i]){
                ind2=i;
                break;
            }
        }
        swap(nums,ind1,ind2);
        reverse(nums,ind1+1,n-1);
    }
};