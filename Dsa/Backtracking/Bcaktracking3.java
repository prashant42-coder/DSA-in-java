import java.util.*;
class Bcaktracking3 {
    public List<List<Integer>> permute(int[] nums) {
        // initalization of data structure witch store in the value 
        List<Integer> ds = new ArrayList<>();
        // intilization array of array witch is print output the permutaion 
        List<List<Integer>> ans = new ArrayList<>();
        //initalization of another arry of length of final arry nums of type
        boolean [] freq= new boolean [nums.length];
        // calling the function 
        permutation(ds,ans,nums,freq);
        return ans;
        }
        public void permutation(List<Integer>ds,List<List<Integer>>ans,int[] nums,boolean[]freq){// this is the base case condition where size of decelare data structure become equal to intilal array
        if(ds.size()== nums.length){
            ans.add(new ArrayList<>(ds));
            return;


        }// we use for loop
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                // if not visited mark true
                freq[i]= true;
                // add it to ds
                ds.add(nums[i]);
                // calling the function again becuuse it recursion calling back to back 
                permutation (ds,ans,freq,nums);
                
                ds.remove(ds.size()-1);
                freq[i]= false;

            }
        }
    }

}
// Time complexity:O(n! * n) because we compute the permutation of array
//  and running the loop n times
// Space complexity:O(n) + O(n) we decalring two array one ds which 
// store the value during recurrsion and another is frequency array which mark the 
// index visited or not visited during recursive call