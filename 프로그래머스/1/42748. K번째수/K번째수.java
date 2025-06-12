import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] temp;
        int[] answer = new int[commands.length];
        int index;
        
        for(int i=0; i<commands.length; i++) {  
            
            // temp 배열 길이 commands 조건 마다 맞추기
            temp = new int[commands[i][1] - commands[i][0]+1 ];
            
            // 슬라이싱 시작 index
            index = commands[i][0]-1;
            
            for(int j=0; j < commands[i][1]-commands[i][0]+1; j++) {
                temp[j] = array[index++];                                 
            }   
            System.out.print("Before Sorting temp : ");  
            for(int num : temp) {
                System.out.print(num+" ");  
            }
            
            Arrays.sort(temp);             
            
            System.out.print("\nSorting temp : ");  
            for(int num : temp) {
                System.out.print(num+" ");  
            }
                        
            // K번째이지만 배열의 시작은 0 이기 때문에 -1
            answer[i] = temp[commands[i][2]-1];
            System.out.println("\nanswer["+i+"] = "+answer[i]);
            System.out.println("------");
        }
        
        return answer;
    }
}