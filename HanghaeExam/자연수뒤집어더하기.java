package HanghaeExam01;

public class Main {

    public String solution(int n) {
        if (n < 1 || n >= 100000000) {
            return "유효한 정수의 범위가 아닙니다. 매개변수의 범위는 1억이하의 자연수만 가능합니다.";
        }

        String answer = "";
        int sum = 0;
        int length = Integer.toString(n).length();
        for (int i = 0; i < length; i++) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
            answer = (i == 0) ? String.valueOf(digit) : answer + "+" + digit;
        }
        answer += "=" + sum;
        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        System.out.println(method.solution(718253));
    }
}
