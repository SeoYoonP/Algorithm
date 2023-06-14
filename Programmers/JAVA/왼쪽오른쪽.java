class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        int indexNumber1 = -1;
        int indexNumber2 = -1;
        for(int i=0; i<str_list.length; i++){
            if(str_list[i].equals("l")){
                indexNumber1 = i;
                break;
            }
            if(str_list[i].equals("r")){
                indexNumber2 = i;
                break;
            }
        }
        
        if(indexNumber1 != -1){
            answer = new String[indexNumber1];
            for(int j=0; j<indexNumber1; j++){
                answer[j] = str_list[j];
            }
            return answer;
        }
        if(indexNumber2 != -1){
            answer = new String[str_list.length - indexNumber2 - 1];
            for(int j=0; j < answer.length; j++){
                answer[j] = str_list[indexNumber2 + j + 1];
            }
            return answer;
        }
        return new String[0];
    }
}
