class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        int sumOfNumbers = 0;
        for(int i=0; i<numbers.length; i++){
            sumOfNumbers += numbers[i];
        }
        return answer - sumOfNumbers;
    }
}
