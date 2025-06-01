import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
            
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        if (arr.length > 0) {
            answerList.add(arr[0]);
        }
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]) {
                continue;
            } else {
                answerList.add(arr[i]);
            }    
        }
        
        int[] answer = new int[answerList.size()];
        for (int j = 0; j < answerList.size(); j++) {
            answer[j] = answerList.get(j);
        }
        
        return answer;
    }
}
