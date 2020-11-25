package Algorithm;

public class JumpFloor {
    public int solution(int n) {
        if (n == 0) {
            return 1;
        }

        if (n <= 2) {
            return n;
        }

        int first = 1, second = 2; // first：前一次的结果 second：后一次的结果
        int result = 0;
        for (int i = 2; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
        }

        return result;
    }
}
