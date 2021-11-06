package com.yelinlan.code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *@项目名称: leetcodeRecord
 *@类名称: TwoSum
 *@类描述: 两数之和
 *@创建人: quanyixiang
 *@创建时间: 2021/11/6 15:38
 **/
public class TwoSum {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {//hashtable
			if (map.containsKey(target - nums[i])) {
				return new int[]{i, map.get(target - nums[i])};
			}
			map.put(nums[i], i);
		}
		return null;
	}
/*
	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[]{i, j};
				}
			}
		}
		return null;
	}
*/
}