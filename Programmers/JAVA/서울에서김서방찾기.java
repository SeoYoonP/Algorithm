public class Solution {
    public String solution(String[] seoul) {
        int index = -1;
        for (int i = 0; i < seoul.length; i++) {
            if ("Kim".equalsIgnoreCase(seoul[i])) {
                index = i;
                break;
            }
        }
        return "김서방은 " + index + "에 있다";
    }
}
