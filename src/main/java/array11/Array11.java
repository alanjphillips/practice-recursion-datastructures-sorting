package array11;


public class Array11 {

    public static int array11(int[] nums, int index) {
        if (nums.length < 0) {
            throw new IllegalArgumentException("Array length must be Zero or greater");
        }
        if (index < 0) {
            throw new IllegalArgumentException("index must be Zero or greater");
        }

        if (nums.length == 0) {
            return 0;
        }
        if (index == nums.length - 1) {
            if (nums[index] == 11) return 1;
            else return 0;
        }

        int amt = 0;
        if (nums[index] == 11) amt = 1;

        return amt + array11(nums, index + 1);
    }

}
