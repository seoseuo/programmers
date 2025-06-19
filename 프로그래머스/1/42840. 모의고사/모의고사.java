import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
                
        int[] a_answers = {1,2,3,4,5};
        int[] b_answers = {2,1,2,3,2,4,2,5};
        int[] c_answers = {3,3,1,1,2,2,4,4,5,5};
        
        int a = 0,b = 0,c = 0;
        
        for(int i = 0; i<answers.length; i++) {
            if(answers[i]==a_answers[i%5]) a++;
            if(answers[i]==b_answers[i%8]) b++;
            if(answers[i]==c_answers[i%10]) c++;
        }        
        
        List<Integer> list = new ArrayList<Integer>();        
        
        int max = Math.max(a,Math.max(b,c));        
        
        if(a==max) list.add(1);
        if(b==max) list.add(2);
        if(c==max) list.add(3);

        int[] answer = new int[list.size()];
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        if(answer.length>1) Arrays.sort(answer);
        
        return answer;
    }
}