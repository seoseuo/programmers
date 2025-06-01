import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        //시작하는 수
        int x = 0 ;
        for(int i=1; i<=n; i*=10) {
            x = i;
        }

        for(int i=x; i>=1; i/=10) {
            // System.out.println(i);
            answer+=n/i;
            n=n%i;            
        }

        return answer;
    }
}