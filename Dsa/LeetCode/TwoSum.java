import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    class Solution {
    public int[] twoSum(int[] A, int target) {
        // declare the lenth of array
        int N= A.length;
        int []out = new int [2];
        // using hash map 
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<N;i++){
            int b = target-A[i];
            // b is check weather is prsent or not 
            if(map.containsKey(b)){
                out[0]= Math.min(i,map.get(b));
                out[1]= Math.max(i,map.get(b));
                      return out;
            }else{
                map.put(A[i],i);
            }
        }
        return null;
    }
}
}
//Out put 
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
