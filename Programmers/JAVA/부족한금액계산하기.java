class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long totPrice = 0;
        for(int i=1; i<=count; i++){
            totPrice += (price * i);
        }
        answer = totPrice - money;
        return answer > 0 ? answer : 0;
    }
}
