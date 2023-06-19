class Solution {
    boolean solution(String s) {
        int count1 = 0;
        int count2 = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'p'|| s.charAt(i) == 'P'){
                count1++;
            }
            if(s.charAt(i) == 'y'|| s.charAt(i) == 'Y'){
                count2++;
            }
        }
        if(count1 == count2){
            return true;
        }
        if(count1 != count2){
            return false;
        }

        return true;
    }
}
