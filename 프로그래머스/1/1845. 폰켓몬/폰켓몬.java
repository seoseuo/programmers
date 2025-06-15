import java.util.HashSet;
import java.util.Set;

import java.lang.Math;

class Solution {
    public int solution(int[] nums) {

        Set<Integer> set = new HashSet<>();
        
        for(int num : nums) {
            set.add(num);
        }
        
        return Math.min(set.size(),nums.length/2);
    }
}