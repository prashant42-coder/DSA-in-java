// 1431. Kids With the Greatest Number of Candies
//  here are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

// Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

// Note that multiple kids can have the greatest number of candies.

// Example 1:

// Input: candies = [2,3,5,1,3], extraCandies = 3
// Output: [true,true,true,false,true] 
// Explanation: If you give all extraCandies to:
// - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
// - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
// - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
// - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
// - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
 
 // Soluation:-

 class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = -1;
        // we use for loop
        for(int i: candies){
            if(i>max){
                max =i;
                }
        }
        // making  an ArrayList  in Boolen 
        List<Boolean> res = new ArrayList();
        for(int i:candies){
            if(i+ extraCandies>= max){  // i candies is make graeter than extra candies with respect to max
                res.add(true);// for the child Coresponding we add the true in res 

            }else{
                res.add(false);

            }
        }
        return res;
    }
}