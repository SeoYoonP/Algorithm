class Solution {
    public int solution(int n) {
        int answer = 0;
        int count1 = 0;
        int count2 = 0;
        while(n!=0){
            if(n%2==0){
                count1++;
                n/=2;
            } else {
                count2++;
                if(n%3==2){
                    count1++;
                    n=0;
                    break;
                }
                n/=3;
            }
        }
        answer = (count1+1) * (count2+1);
        return answer;  
    }
}
