package day1;

import java.util.ArrayList;

public class subsequence_sum {

	static void fun(ArrayList<Integer> arr, String ans, int i, int sum, int k) {
		if (i == arr.size()) {
			if (sum == k)
				System.out.println(ans + " ");
			return;
		}

		// pick

		fun(arr, ans + arr.get(i) + ",", i + 1, sum + arr.get(i), k);
		// drop

		fun(arr, ans, i + 1, sum, k);

	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList();
		arr.add(1);
		arr.add(2);
		arr.add(1);
		int key = 2;
		String ans;
		fun(arr, "", 0, 0, key);// inp ans index sum,key

	}

}
