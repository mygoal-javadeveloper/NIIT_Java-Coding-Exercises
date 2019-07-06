package codings;

import java.util.Arrays;
import java.util.StringTokenizer;

public class NumberOfWordsInASentence {
public static void main(String[] args) {
	NumberOfWordsInASentence obj1 = new NumberOfWordsInASentence();
	String str = " I Love    Java a    lot";
	obj1.countWordswithSplit(str);
	obj1.StringTokenizerCount(str);
}
public void countWordswithSplit(String str) {
	String[] arr;
	if(str == null || str.isEmpty()) {
		System.out.println("String is Empty.");
		return;
	}else {
		arr = str.trim().split("\\s+");
	}
	System.out.println(arr.length);
	System.out.println(Arrays.toString(arr));
} 
public void StringTokenizerCount(String str) {
	StringTokenizer senttoken = new StringTokenizer(str);
	System.out.println(senttoken.countTokens());
}
}