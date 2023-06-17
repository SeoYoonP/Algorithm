class Solution {
    public String solution(int a, int b) {
        int day = 0;

        for (int month = 1; month < a; month++) {
            day += switch (month) {
                case 2 -> 29;
                case 4, 6, 9, 11 -> 30;
                default -> 31;
            };
        }

        day += b;

        int dayOfWeek = day % 7;

        return switch (dayOfWeek) {
            case 0 -> "THU";
            case 1 -> "FRI";
            case 2 -> "SAT";
            case 3 -> "SUN";
            case 4 -> "MON";
            case 5 -> "TUE";
            case 6 -> "WED";
            default -> "";
        };
    }
}
