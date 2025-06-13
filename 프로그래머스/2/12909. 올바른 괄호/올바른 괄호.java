import java.util.Stack;

class Solution {
    boolean solution(String s) {
      // 1. Stack 없이
        int balance = 0;
        char c;   
        
        for(int i=0; i<s.length(); i++) {
            c = s.charAt(i);
            if(c=='(') balance++;
            else balance--;
            if(balance<0) return false;
        }
        
        return balance==0;
    }
}