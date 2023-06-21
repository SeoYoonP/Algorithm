import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] supo1 = {1, 2, 3, 4, 5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int correct1 = 0;
        int correct2 = 0;
        int correct3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == supo1[i % supo1.length]) {
                correct1++;
            }
            if (answers[i] == supo2[i % supo2.length]) {
                correct2++;
            }
            if (answers[i] == supo3[i % supo3.length]) {
                correct3++;
            }
        }

        int maxCorrect = Math.max(Math.max(correct1, correct2), correct3);

        List<Integer> winners = new ArrayList<>();
        if (correct1 == maxCorrect) {
            winners.add(1);
        }
        if (correct2 == maxCorrect) {
            winners.add(2);
        }
        if (correct3 == maxCorrect) {
            winners.add(3);
        }

        int[] answer = new int[winners.size()];
        for (int i = 0; i < winners.size(); i++) {
            answer[i] = winners.get(i);
        }

        return answer;
    }
}
