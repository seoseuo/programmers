import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> days = new LinkedList<>();
        
        for(int i=0; i<progresses.length; i++) {
            int remain = 100 - progresses[i];
            int day = (int) Math.ceil( (double)remain / speeds[i] );
            days.offer(day);
        }
        
        List<Integer> answer = new ArrayList<>();
        
        int current,count = 0;
        
        while(!days.isEmpty()) {
            current = days.poll();
            count = 1;
            
            while(!days.isEmpty() && days.peek() <= current) {
                days.poll();
                count++;
            }
            answer.add(count);
        }        
        return answer.stream().mapToInt(i -> i).toArray();
        
    }
}