class Solution {
    public int solution(int n) {
        int answer = 0;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrt; i++) { //0은 약수가 될 수 없으니 시작점은 1부터 i<=n의제곱근까지만;(중복된 약수 출력안하기)
            if (n % i == 0) { //n/i의 나머지가 0이라면 answer++(약수판별)
                answer++;
                if (i != n / i) {//앞선if문에 대칭되는 약수로 answer++해주기
                    answer++;
                }
            }
        }
        System.out.println(answer);
        return answer;
    }
}
//에라토스테네스의 체로 구현해볼 것
