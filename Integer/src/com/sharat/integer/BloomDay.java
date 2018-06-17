package com.sharat.integer;

import java.util.Deque;
import java.util.LinkedList;

public class BloomDay {

	public int kEmptySlots(int[] flowers, int k) {
		int n = flowers.length;
		if (n == 0 || k >= n) return -1;
		int[] f = new int[n + 1];

		for (int i = 0; i < n; ++i)
			if (IsValid(flowers[i], k, n, f))
				return i + 1;

		return -1;
	}

	private boolean IsValid(int x, int k, int n, int[] f) {
		f[x] = 1;
		if (x + k + 1 <= n && f[x + k + 1] == 1) {
			boolean valid = true; 
			for (int i = 1; i <= k; ++i)
				if (f[x + i] == 1) {
					valid = false;
					break;
				}
			if (valid) return true;
		}
		if (x - k - 1 > 0 && f[x - k - 1] == 1) {
			for (int i = 1; i <= k; ++i)
				if (f[x - i] == 1) return false;
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2,5,1,4,3};
		int k=2;

		BloomDay bd=new BloomDay();
		int first_day=bd.kEmptySlots(arr, k);

		System.out.println("first day: "+first_day);
	}
}
