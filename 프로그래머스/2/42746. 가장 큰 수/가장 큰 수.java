import java.util.*;


class Solution {
    public String solution(int[] numbers) {
    if (numbers == null || numbers.length == 0) return "";

    String[] list = new String[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
        list[i] = String.valueOf(numbers[i]);
    }

    Arrays.sort(list, (a, b) -> (b + a).compareTo(a + b));

    if (list[0].equals("0")) return "0";  // 모든 수가 0일 때 대비

    StringBuilder sb = new StringBuilder();
    for (String s : list) sb.append(s);

    return sb.toString();
}

}