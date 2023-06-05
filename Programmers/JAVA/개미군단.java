class Solution {
    public int solution(int hp) {
        int answer = 0;
        int generalAnt = 5;
        answer = hp/generalAnt;
        hp%=generalAnt;
        switch(hp){
            case 1 -> answer++;
            case 2 -> answer+=2;
            case 3 -> answer++;
            case 4 -> answer+=2;
        }
        return answer;
    }
}
