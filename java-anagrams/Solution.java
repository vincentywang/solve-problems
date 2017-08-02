import java.io.*;
import java.util.*;

public class Solution {

	static boolean isAnagram(String a, String b) {
		// Complete the function

		HashMap<String, Integer> mapA = new HashMap<>();
		HashMap<String, Integer> mapB = new HashMap<>();
		char[] charArrayA = a.toCharArray();
		char[] charArrayB = b.toCharArray();

		for (int i = 0; i < charArrayA.length; i++) {
			String skey = Character.toString(charArrayA[i]).toLowerCase();
			if (!mapA.containsKey(skey)) {
				mapA.put(skey, 1);
			} else {
				int temp = mapA.get(skey);
				mapA.put(skey, ++temp);
			}
		}
		for (int k = 0; k < charArrayB.length; k++) {
			String sKey = String.valueOf(charArrayB[k]).toLowerCase();
			if (!mapB.containsKey(sKey)) {
				mapB.put(sKey, 1);
			} else {
				int temp = mapB.get(sKey);
				mapB.put(sKey, ++temp);
			}
		}

		if (mapA.equals(mapB)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
