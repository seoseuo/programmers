class Solution {
    public int solution(int[] number) {
        int answer = 0;
                
        for(int i=0; i<number.length-1; i++) {            
            for(int k=i+1; k<number.length-1; k++) {            
                for(int j=number.length-1; j>k; j--) {                
                System.out.println("i : "+number[i]+", k : "+number[k]+", j : "+number[j]);    
                    if(number[i]+number[k]+number[j]==0) {
                        System.out.println("answer++;");
                        answer++;
                    }
                }                
            }
        }
        
        return answer;
    }
}