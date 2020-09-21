/*
 * @lc app=leetcode.cn id=912 lang=java
 *
 * [912] 排序数组
 */

// @lc code=start
import java.util.Arrays;
class Solution {
    public int[] sortArray(int[] nums) {
        //选择排序:每一次选择最小的数放在未排的前面
        int len=nums.length;
        for (int i = 0; i < len-1; i++) {

            for (int j = i+1; j < len; j++) {
                if(nums[i]>nums[j])
                swap(nums, i, j);
            }
        }
        return nums;
    }
    //交换数组的位置
    private void swap(int[] nums,int index1,int index2) {
        int temp=nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;

    }
    public static void main(String[] args) {
        int[] nums={5,2,3,1,5,8,6};
        Solution solution = new Solution();
        int[] res=solution.sortArray(nums);
        System.out.println(Arrays.toString(res));
    }
}
// @lc code=end

