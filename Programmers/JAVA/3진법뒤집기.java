class Solution {
    public int solution(int n) {
        StringBuilder answer = new StringBuilder(); //answer를 효율적으로 조작하기 위해 StringBuilder타입으로 선언
        String ternaryScale = (Integer.toString(n,3)); // 3진법이라는 ternaryScale을 선언하고 Integer.toString을 통해 n값을 받아서 3진법으로 변환시킨다. //toString : 특정 진법의 문자열로 변환하는데 사용되었다.
        for(int i=ternaryScale.length()-1; i>=0;i--){ //for문을 통해 문자열을 뒤집어서 저장한다.
            answer.append(ternaryScale.charAt(i));
        }
        return Integer.parseInt(answer.toString(),3); //StringBuilder에서 toString은 스트링빌더 객체를 일반문자열로 변환하는데 사용하였다.
    }
}
