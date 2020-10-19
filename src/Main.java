import Algorithm.*;

public class Main {
    public static void main(String[] args) {
        // 最小栈
        MinStack minstack = new MinStack();
        minstack.push(-2);
        minstack.push(0);
        minstack.push(-3);
        minstack.push(-5);
        System.out.println(minstack.getMin());
        minstack.pop();
        System.out.println(minstack.top());
        System.out.println(minstack.getMin());
        // 链表交点
        // 数组相邻数字相差最大值
        MaximumGap maximumGap = new MaximumGap();
        int[] array = {-1, -2};
        System.out.println(maximumGap.maximumGap(array));
        // 最大连续子序列
        MaximumSubarray maximumsubarray = new MaximumSubarray();
        System.out.println("maximum is");
        System.out.println(maximumsubarray.solution1(array));
        System.out.println(maximumsubarray.solution2(array));
    }
}
