class Solution {
    public String solution(String phone_number) {
        StringBuilder makeStar = new StringBuilder();
        String answer = "";
        for(int i=0; i<phone_number.length()-4; i++){
            makeStar.append('*');
        }
        makeStar.append(phone_number.substring(phone_number.length() - 4));
        answer = makeStar.toString();
        return answer;
    }
}
