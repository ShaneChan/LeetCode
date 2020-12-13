import Algorithm.*;

public class Main {
    public static void main(String[] args) {
        // 最小栈
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.push(-5);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        // 链表交点
        // 数组相邻数字相差最大值
        MaximumGap maxiMumGap = new MaximumGap();
        int[] array = {-1, -2};
        System.out.println(maxiMumGap.maximumGap(array));
        // 最大连续子序列
        MaximumSubarray maxiMumSubarray = new MaximumSubarray();
        System.out.println("maximum is");
        System.out.println(maxiMumSubarray.solution1(array));
        System.out.println(maxiMumSubarray.solution2(array));
        ReplicateNum stk = new ReplicateNum();
        int[] array1 = {1, 2, 3, 3};
        System.out.println(stk.duplicateNum(array1));
        String as = "leetcode";
        FirstNotRepeatingChar firstNotRepeatingChar = new FirstNotRepeatingChar();
        System.out.println("===========");
        int O = firstNotRepeatingChar.solution(as);
        System.out.println(O);
        JumpFloor jumpFloor = new JumpFloor();
        System.out.println("===========");
        System.out.println(jumpFloor.solution(44));
        XOR xor = new XOR();
        int[] array6 = {1, 1, 2, 2, 3, 3, 4, 4};
        System.out.println("==========");
        System.out.println(xor.solution(array6));
    }
}
