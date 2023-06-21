class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
        int match = 0;
        int zero = 0;
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        
        for (int lotto : lottos) {
            for (int win_num : win_nums) {
                if (lotto == win_num) {
                    match++;
                    break;
                }
            }
        }
            
        for (int lotto : lottos) {
            if (lotto == 0) {
                zero++;
            }
        }

        int maxRank = rank[match + zero];
        int minRank = rank[match];

        return new int[]{maxRank, minRank};
    }
}
