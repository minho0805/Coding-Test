import java.util.*;

class Solution {
    public int solution(int[] nums) {

        List<Integer> numsList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (!numsList.contains(nums[i])) {
                numsList.add(nums[i]);
            }
        }
        int select = nums.length / 2;

        int answer;

        if (numsList.size() < select) {
            answer = numsList.size();
        } 
        else {
            answer = select;
        }

        return answer;
    }
}