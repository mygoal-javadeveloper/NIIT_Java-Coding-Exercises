package codings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRepeatedWordWithCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		str = "me \n me me \t I love Java!;{} \r I am in love with Java, (I am in Mumbai????)";
		int count = 0;
		String[] arr = str.trim().replaceAll("\\W", " ").toLowerCase().split("\\s+");

		Map<String, Integer> lstmap = new HashMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (lstmap.containsKey(arr[i])) {
				lstmap.put(arr[i], (lstmap.get(arr[i]) + 1));
			} else {
				lstmap.put(arr[i], 1);
			}

		}
		System.out.println(Arrays.toString(arr));
		for (String wd : lstmap.keySet()) {
			count = lstmap.get(wd);
			System.out.print(wd + ": " + count +"  ");
		}
	}
}
