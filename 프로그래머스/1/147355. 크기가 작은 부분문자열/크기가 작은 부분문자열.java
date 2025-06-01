class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();
        int tLength = t.length();

        long pNum = Long.parseLong(p);  // p를 숫자로 변환

        for (int i = 0; i <= tLength - pLength; i++) {
            String sub = t.substring(i, i + pLength);
            long subNum = Long.parseLong(sub);  // 부분 문자열 숫자로 변환

            if (subNum <= pNum) {
                answer++;
            }
        }

        return answer;
    }
}
