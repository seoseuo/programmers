import java.util.ArrayList;

class Solution {    
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
                
        // 3진법 바꾸기                
        // while(true) {
        //     if( (n/3)<3 ) {
        //         list.add(n%3);
        //         list.add(n/3);
        //         break;
        //     } else {
        //         list.add(n%3);
        //     }                 
        //     n=n/3;
        // }
        
        // 개선 코드
        while(n>0) {
            list.add(n%3);
            n=n/3;
        }
        
        System.out.println(list);
        
        String as = "";
        for(int i=0; i<list.size(); i++) {
            as+=list.get(i);
        }
        
        answer = Integer.parseInt(as,3);
        
        return answer;
    }
}