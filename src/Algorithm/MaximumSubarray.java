package Algorithm;

public class MaximumSubarray {
    // 解法一：暴力循环
    public int solution1(int[] nums) {
        int max = 0, temMax;
        for (int i = 0; i < nums.length; i++) {
            temMax = 0;
            for (int j = i; j < nums.length; j++) {
                temMax += nums[j];
                if (temMax > max) {
                    max = temMax;
                }
            }
        }
        return max;
    }

    // 解法二：分治算法
    public int solution2(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        return divide(nums, 0, nums.length - 1);
    }

    private int divide(int[] nums, int Left, int Right) {
        int MaxLeftBorderSum, MaxRightBorderSum;
        int LeftBorderSum, RightBorderSum = 0;

        if (Left == Right) {
            return nums[Left];
        }

        int mid = (Left + Right) / 2;

        MaxLeftBorderSum = nums[mid];
        LeftBorderSum = 0;
        for (int i = mid; i >= Left; i--) {
            LeftBorderSum += nums[i];
            if (LeftBorderSum > MaxLeftBorderSum) {
                MaxLeftBorderSum = LeftBorderSum;
            }
        }

        MaxRightBorderSum = nums[mid + 1];
        RightBorderSum = 0;
        for (int i = mid + 1; i <= Right; i ++) {
            RightBorderSum += nums[i];
            if (RightBorderSum > MaxRightBorderSum) {
                MaxRightBorderSum = RightBorderSum;
            }
        }

        return Math.max(MaxLeftBorderSum + MaxRightBorderSum, Math.max(divide(nums, Left, mid), divide(nums, mid + 1, Right)));
    }

    // 解法三：动态规划
    public int solution3(int[] nums) {
        int currMax = nums[0];
        int gMax = nums[0];

        for(int i = 1; i < nums.length; i++) {
            currMax = Math.max(nums[i], nums[i] + currMax);
            gMax = Math.max(gMax, currMax);
        }

        return gMax;
    }
}
