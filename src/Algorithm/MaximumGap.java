package Algorithm;

public class MaximumGap {
    public int maximumGap(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }

        // 桶排序

        int max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int temp = nums[i + 1] - nums[i];
            if (temp > max) {
                max = temp;
            }
        }

        return max;
    }
}
