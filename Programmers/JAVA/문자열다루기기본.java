class Solution {
    public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                switch (s.charAt(i)) {
                    case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> {}
                    default -> { return false; }
                }
            }
            return true;
        }
        return false;
    }
}
