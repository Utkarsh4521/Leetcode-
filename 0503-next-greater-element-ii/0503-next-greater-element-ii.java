class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> stk = new Stack<>();

        Arrays.fill(ans, -1);

        for (int i = 2 * n - 1; i >= 0; i--) {
            int idx = i % n;

            while (!stk.isEmpty() && stk.peek() <= nums[idx]) {
                stk.pop();
            }

            if (i < n) {
                if (!stk.isEmpty()) {
                    ans[idx] = stk.peek();
                }
            }

            stk.push(nums[idx]);
        }

        return ans;
    }
}