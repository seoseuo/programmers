class Solution { 
    public int[] solution(String s) {
        int bf_rm_zero_len = 0;
        int af_rm_zero_len = 0;
        int rm_zero = 0;
        int bin_cnt = 0;
        
        char c;
        // 1. s 가 "1"이 되기 전 까지 계속하여 반복
        while(!s.equals("1")) {
            
            // 2. 기존 길이 - '0' 제거 이후 길이 = 제거한 '0'의 개수
            bf_rm_zero_len = s.length();
            s = s.replace("0","");
            af_rm_zero_len = s.length();
            rm_zero += bf_rm_zero_len - af_rm_zero_len;
            
            // 3. 2진수 전환 -> 배열의 길이를 전환한다.
            s = Integer.toBinaryString(af_rm_zero_len);
            bin_cnt++;
        }
       
        return new int[]{bin_cnt, rm_zero};
    }
}