#c++
class Solution {
public:
    
    void printcombi(int i,vector<int>& arr,int t,vector<vector<int>>& ans , vector<int>& ds ){
        if(i==arr.size()){
            if(t==0)
                ans.push_back(ds);
            return ;
        }
        
        //pick
        if(arr[i]<=t){
            ds.push_back(arr[i]);
            printcombi(i,arr,t-arr[i],ans,ds);
            ds.pop_back();
        }
        //dont pick
        printcombi(i+1,arr,t,ans,ds);
        
    }
    
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<vector<int>> ans;
        vector<int> ds;
        printcombi(0,candidates,target,ans,ds);
        return ans;
    }
};
