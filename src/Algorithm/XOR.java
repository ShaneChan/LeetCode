package Algorithm;

public class XOR {
    public int solution(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }

        return result;
    }
}
