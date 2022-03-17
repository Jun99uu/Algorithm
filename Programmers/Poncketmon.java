import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> mon = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(mon.size() == nums.length / 2){
                break;
            }
            mon.add(nums[i]);
        }
        answer = mon.size();
        return answer;
    }
}