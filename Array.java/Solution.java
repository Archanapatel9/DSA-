import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer , Integer>Map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if(Map.containsKey(complement)){
                return new int[]
                { Map.get(complement), i };
            }

            Map.put(nums[i],i);
        }
        return new int[]{};   
    }
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        Solution obj = new Solution();
        int[] result = obj.twoSum(nums,target);

        System.out.println(Arrays.toString(result));
    }
}