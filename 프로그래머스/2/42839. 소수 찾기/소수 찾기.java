import java.util.HashSet;
import java.util.Iterator;

class Solution {
    
    HashSet<Integer> numberSet = new HashSet<>();
    
    public boolean isPrime(int num) {
        if(num==0 || num==1) return false;
        int lim = (int)Math.sqrt(num);
        for(int i=2; i<=lim; i++) {
            if(num%i==0) return false;
        }
        return true;
        
    }
    public void recursive(String comb, String others) {
        if(!comb.equals("")) {
               numberSet.add(Integer.valueOf(comb));
        }
        
        for(int i=0; i<others.length(); i++) {
            recursive(comb+others.charAt(i),
                      others.substring(0,i)+others.substring(i+1));
        }
    }
    
    public int solution(String numbers) {
        int answer=0;
        
        recursive("",numbers);
        
        Iterator<Integer> it = numberSet.iterator();
        while(it.hasNext()) {
            if(isPrime(it.next())) {
                answer++;
            }
        }
        return answer;
    }
}