import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> arrList = new ArrayList<Integer>();
        if (arr.length > 0) {
            arrList.add(arr[0]);
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arrList.add(arr[i]);
            }
        }
        int[] answer = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }

        return answer;
    }
}
