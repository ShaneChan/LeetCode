package Algorithm;

public class FirstNotRepeatingChar {
    public char solution(String str) {
        int[] statistic = new int[128];
        for (int i = 0; i < str.length(); i++) {
            statistic[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (statistic[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }

        return ' ';
    }
}
