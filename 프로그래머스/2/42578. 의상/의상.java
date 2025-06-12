import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> wear = new HashMap<>();

        // 1. 옷 종류별 개수를 센다
        for (String[] cloth : clothes) {
            String type = cloth[1];
            wear.put(type, wear.getOrDefault(type, 0) + 1);
        }

        // 2. 조합 계산: 각 종류에서 안 입는 경우까지 포함
        int answer = 1;
        for (int count : wear.values()) {
            answer *= (count + 1);  // 입는 경우 + 안 입는 경우
        }

        // 3. 아무것도 안 입는 경우 제거
        return answer - 1;
    }
}
