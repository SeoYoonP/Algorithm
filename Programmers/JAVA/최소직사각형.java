class Solution {
    public int solution(int[][] sizes) {
        // int answer = 0;
        // int maxNumber = Integer.MIN_VALUE;
        // for(int i=0; i<sizes.length; i++){
        //     for(int j=0; j<sizes[i].length; j++){
        //         if(sizes[i][j] > maxNumber){
        //             maxNumber = sizes[i][j];
        //         }
        //     }
        // }
        int maxWidth = 0;
        int maxHeight = 0;

        for (int i = 0; i < sizes.length; i++) {
            int width = Math.max(sizes[i][0], sizes[i][1]); //i 인덱스의 두 수를 비교해서 큰 값을 width에저장
            int height = Math.min(sizes[i][0], sizes[i][1]); //i 인덱스의 두 수를 비교해서 작은 값을 height에저장

            maxWidth = Math.max(maxWidth, width); // 큰 값중에서 가장 큰 값을 maxWitdth에 저장
            maxHeight = Math.max(maxHeight, height); // 작은 값중에서 가장 큰 값을 maxHeight에 저장
        }
        return maxWidth * maxHeight;
    }
}
