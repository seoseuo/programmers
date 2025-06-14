class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        
        for(int i=1; i<=n; i++) {
            for(int j=i; j<=n; j++) {
                sum+=j;
                if(sum>n) {
                  //  System.out.println("over then "+n);    
                    break;
                }
                
                //System.out.println("i :"+i+", j :"+j+", sum : "+sum);
                
                if(sum==n) {
                    answer++;
                    //System.out.println("answer++");
                    break;
                }
                
            }
            sum = 0;
        }
        return answer;
    }
}