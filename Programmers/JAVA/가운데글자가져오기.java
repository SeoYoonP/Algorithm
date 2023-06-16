class Solution {
    public String solution(String s) {
        String answer = "";
        int sLength = s.length();
        answer = (sLength % 2 == 0) ? s.substring(sLength/2 - 1, sLength/2 + 1) : s.substring(sLength/2, sLength/2 + 1);
        return answer;
    }
    
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s);
    }
}
