import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        String answer="";
        int i=0;
        for(; i<completion.length; i++) {
            if(!(participant[i].equals(completion[i]))) {
                break;
            }
            
        }
        return participant[i];
        
    }
}