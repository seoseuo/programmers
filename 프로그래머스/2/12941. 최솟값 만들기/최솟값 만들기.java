import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;        

        // 1. A 는 오름차순, B는 내림차순으로 정렬
        Arrays.sort(A);
        Arrays.sort(B);
        
        int[] des_B = new int[B.length];
        int p = 0;
        
        for(int i=B.length-1; i>=0; i--) {
            des_B[p] = B[i];
            p++;
        }
        
        // 2. 각 i 번째 값을 꺼내서 곱하면, 그 값이 A와 B 배열에서 만들 수 있는 최소 곱의 결과 조합.
        
        for(int i=0; i<A.length; i++) {
            answer+=A[i]*des_B[i];
        }            

        return answer;
    }
}