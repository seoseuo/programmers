import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 1. 문자열 정수 배열로 변환
        // 공백 기준으로 스플릿
        String[] split_arr = s.split(" ");
        
        int[] int_arr = new int[split_arr.length];
        
        for(int i=0; i<int_arr.length; i++) {
            int_arr[i] = Integer.parseInt(split_arr[i]);
        }
        
        // 2. 정수 배열 정렬        
        Arrays.sort(int_arr);
        
        
        // 3. 맨 앞, 맨 뒤 값 입력 (문자열로);
        answer+=Integer.toString(int_arr[0])+" ";
        answer+=Integer.toString(int_arr[int_arr.length-1]);
        
        return answer;
    }
}