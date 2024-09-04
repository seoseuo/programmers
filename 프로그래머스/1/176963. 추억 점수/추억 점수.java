import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
         int[] answer = new int[photo.length];
        
        int sum = 0;
        HashMap<String,Integer> point = new HashMap<String,Integer>();
        
        for(int i=0; i<name.length; i++) {
            point.put(name[i],yearning[i]);
        }
        
        for(int i=0; i<photo.length; i++) {
            for(int j=0; j<photo[i].length; j++) {
                if(point.containsKey(photo[i][j])) {
                    answer[i]+=point.get(photo[i][j]);
                }
            }
        }
        
        return answer;
    }
}