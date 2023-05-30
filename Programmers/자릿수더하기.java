//https://school.programmers.co.kr/learn/courses/30/lessons/120906
//자릿수더하기
//정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
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

