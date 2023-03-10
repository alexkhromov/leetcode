package com.github.alexkhromov;

/**
 * Solution for problem https://leetcode.com/problems/shuffle-string/
 */
public class ShuffleString {

	public String restoreString(String s, int[] indices) {

		char [] result = new char[s.length()];

		for (int i = 0; i < indices.length; i++) {
			result[indices[i]] = s.charAt(i);
		}

		return String.valueOf(result);
	}
}