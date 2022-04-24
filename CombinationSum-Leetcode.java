#java
class Solution {
    
    public void printcombination(int i,int[] arr, int t, List<List<Integer>> ans , List<Integer>ds){
        //base case
        if(i==arr.length){
            if(t==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }        
        //pick
        if(arr[i]<=t){
        ds.add(arr[i]);
         printcombination(i,arr,t-arr[i],ans,ds);
        ds.remove(ds.size() -1);
        }
        //not pick
        printcombination(i+1,arr,t,ans,ds);
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        printcombination(0,candidates,target,ans,new ArrayList<Integer>());
        return ans;
    }
}
