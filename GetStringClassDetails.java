package codings;

/**
 * class literal in Java
 * A very useful tool to get details of a class.
 * By Nisrin Dhoondia
 */

import java.lang.reflect.Method;

public class GetStringClassDetails {

	public static void main(String[] args) {
		Class<String> strobj = String.class;
		System.out.println(strobj);
		System.out.println(strobj.getName());
		Method[] strobjarr = strobj.getDeclaredMethods();
		for (int j = 0; j < strobjarr.length; j++) {
			System.out.println(strobjarr[j]);
		}
	}
}
