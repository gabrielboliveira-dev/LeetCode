package Java;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int currentSum = numbers[left] + numbers[right];

            if (currentSum == target) {
                return new int[] { left + 1, right + 1 };
            }

            if (currentSum > target) {
                right--;
            } else {
                left++;
            }
        }
        throw new IllegalArgumentException("No solution found");
    }
}
