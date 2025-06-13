class Solution {
    public String solution(String s) {
        String answer = "";
        char c;
        
        for(int i=0; i<s.length(); i++) {
            c = s.charAt(i);
            
            // 1. 맨 글자이거나, 이전 문자가 공백이면 대문자로
            if(i==0 || s.charAt(i-1)==' ') {
                c = Character.toUpperCase(c);
            } 
            // 2. 나머지는 소문자로
            else {
                c = Character.toLowerCase(c);
            }
            answer += c;
        }            
        return answer;                               
    }
}