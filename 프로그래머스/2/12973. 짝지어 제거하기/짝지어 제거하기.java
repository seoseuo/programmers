import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        
        Stack<Character> stack = new Stack<>();
        int answer;
        char c;                
        
        for(int i=0; i<s.length(); i++) {            
            c = s.charAt(i);
            
            if(!stack.isEmpty()&&stack.peek()==c) stack.pop();
            else stack.push(c);
        }

        return stack.isEmpty() ? 1 : 0;
    }
}