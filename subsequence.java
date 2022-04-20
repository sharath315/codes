package day1;

import java.util.ArrayList;

public class subsequence {

	static void solve(int i, String s, String f, ArrayList<String> ans) {
		if (i == s.length()) {
			ans.add(s);
			return;
		}
		// picking
		// f = f + s.charAt(i);
		solve(i + 1, s, f + s.charAt(i), ans);
		// poping out while backtracking
		// f.pop_back();
		solve(i + 1, s, f, ans);
	}

	public static void main(String args[]) {
		ArrayList<String> ans = new ArrayList();
		String s = "abc";
		String f = "";
		System.out.println("All possible subsequences are: ");
		solve(0, s, f, ans);
		System.out.println(ans);
	}

}
