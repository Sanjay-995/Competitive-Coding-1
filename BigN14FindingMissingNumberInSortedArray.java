// Time Complexity is O(logN) as we are applying binary search on it
// Space complexity is O(1) as we are not using any extra space

public class BigN14FindingMissingNumberInSortedArray {
	public int find(int[] nums) {
		// edge case
		if (nums == null || nums.length == 0)
			return -1;
		int low = 0;
		int high = nums.length - 1;
		while (high - low >= 2) {
			int mid = low + (high - low) / 2;
			if (nums[mid] - mid == nums[low] - low) {
				low = mid;
			} else {
				high = mid;
			}
		}
		return (nums[low] + nums[high]) / 2;
	}
	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		BigN14FindingMissingNumberInSortedArray missing = new BigN14FindingMissingNumberInSortedArray();
		System.out.println(missing.find(nums));
	}
}
