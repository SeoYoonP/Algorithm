package HanghaeExam02;

public class Main {
    public void solution(int star) {
        if (star < 0 || star > 100) {
            System.out.println("유효한 정수의 범위가 아닙니다. 0이상 100이하의 정수만 출력 가능합니다.");
            return;
        }
        for (int i = 0; i < star; i++) {
            for (int j = 0; j < star - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int z = 0; z < i * 2 + 1; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main method = new Main();
        int star = 9;
        method.solution(star);
    }
}

