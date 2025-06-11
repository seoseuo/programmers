import java.util.Set;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


class Solution {
    public int[] solution(int[] numbers) {
        
        Set<Integer> set = new TreeSet<Integer>();
        
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        // 변환이 가능하다
        List<Integer> list = new ArrayList<>(set);
        int[] answer = new int[list.size()];
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}