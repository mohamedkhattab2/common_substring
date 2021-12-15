package common_substring;

import java.util.Arrays;

public class Main {

	// take two string and return if there is common char between
	// 1- sort two strings
	// 2- compare first string with second and if there is common return YES if not
	// return NO

	public static void main(String[] args) {
		String sorted = isCommon("cat", "be");
		System.out.println(sorted);
	}

	public static String isCommon(String s1, String s2) {

		char[] arr1 = s1.toCharArray();
		Arrays.sort(arr1);
		String firstString = String.valueOf(arr1);

		char[] arr2 = s2.toCharArray();
		Arrays.sort(arr2);
		String secondString = String.valueOf(arr2);

		for (int i = 0; i < firstString.length(); i++) {
			for (int j = i; j < secondString.length(); j++) {
				if (firstString.charAt(i) == secondString.charAt(j)) {
					return "YES";
				}
			}
		}

		return "NO";

	}

}
