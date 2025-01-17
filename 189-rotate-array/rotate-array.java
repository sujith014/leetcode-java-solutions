class Solution {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        int r = k % l;
        int[] res = new int[l];

        if (nums.length == 1 || k == 0 || r == 0)
            return;

        System.arraycopy(nums, l - r, res, 0, r);
        System.arraycopy(nums, 0, res, r, l - r);

        System.arraycopy(res, 0, nums, 0, nums.length);
    }
}