import java.util.*;

class Solution {
    public String solution(int[] numbers) {       
        
        String[] list = new String[numbers.length];  
        
        for (int i = 0; i < numbers.length; i++) {
            list[i] = String.valueOf(numbers[i]);
        }        
        
        Arrays.sort(list, (a,b) -> (b+a).compareTo(a+b));        
        
        String answer = "";
        
        for(String num : list) {
            answer+= num;
        }            
        
        return answer.startsWith("0") ? "0" : answer;
    }
}
