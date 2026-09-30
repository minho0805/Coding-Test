import java.util.*;

class Solution {
    public int solution(int[] nums) {

        List<Integer> numsList = new ArrayList<>();

        for (int num : nums) {
            numsList.add(num);
        }

        for (int i = 0; i < numsList.size() - 1; i++) {
            if (numsList.get(i).equals(numsList.get(i + 1))) {
                numsList.remove(i + 1);
                i--; 
            }
        }

        int answer = numsList.size();
        return answer;
    }
}