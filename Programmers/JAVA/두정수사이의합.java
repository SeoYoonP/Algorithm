class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a <= b){
            for(int i=a; a <= b; a++){
                answer += a;
            }    
        } else {
            for(int i=b; b <= a; b++){
                answer += b;
            }
        }
        return answer;
    }
        public static void main(String[] args){
            Solution s = new Solution();
            System.out.println();
        }
    
}
