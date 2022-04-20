#include<bits/stdc++.h>
using namespace std;

void fun(int i,vector<int> &arr,int k,int sum,vector<int> &ans){
    if(i==arr.size()){
        if(sum==k){
        for(int x:ans)
            cout << x <<" ";
        cout<<endl;
        }
        return ;    
    }
    //pick
    ans.push_back(arr[i]);
    sum+=arr[i];
    fun(i+1,arr,k,sum,ans);
    //not pick
    ans.pop_back();
    sum-=arr[i];
    fun(i+1,arr,k,sum,ans);

}

int main(){
    vector<int>arr={1,2,2,5};
    vector<int> ans={};
    int key=5,i=0;
    fun(0,arr,key,0,ans);
    return 0;
}