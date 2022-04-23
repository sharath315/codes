
#include<bits/stdc++.h>
using namespace std;

int countsubseq(int i,vector<int>&arr,vector<int>&ds,int k,int sum){
    if(i==arr.size()){
        if(sum==k)
            return 1;
        return 0;
    }
    //pick
    sum+=arr[i];
    ds.push_back(arr[i]);
    int l=countsubseq(i+1,arr,ds,k,sum);
    //not pick
    sum-=arr[i];
    ds.pop_back();
    int r=countsubseq(i+1,arr,ds,k,sum);
    return l+r;
}

int main(){
    vector<int>arr={1,2,1,3,-1,2};
    int k=2;
    vector<int>ds;
    cout<<"Number of subsequence with given sum is:"<<countsubseq(0,arr,ds,k,0);
}
//Here we just need to print the count of such possible subsequence so there is no need to print those subsequence  
  
//Hence removing the ds is recommended as it is of no use now.  
