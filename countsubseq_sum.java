package day1;

import java.util.ArrayList;

public class countsubseq_sum {

	static int fun(ArrayList<Integer> arr, String ans, int i, int sum, int k) {
		if (i == arr.size()) {
			if (sum == k)
				return 1;
			return 0;
		}

		// pick

		int l = fun(arr, ans + arr.get(i) + ",", i + 1, sum + arr.get(i), k);
		// drop

		int r = fun(arr, ans, i + 1, sum, k);
		return l + r;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(1);
		int key = 2;
		String ans = "";
		int res = fun(arr, "", 0, 0, key);// inp ans index sum,key
		System.out.println(res);
	}
}
