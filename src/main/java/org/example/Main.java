package org.example;

import org.example.test1.Test1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		System.out.println("Start!");
		Test1 test1 = new Test1();

		String str = new String();
		Class c = str.getClass();

		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<>();

		var list3 = new ArrayList<String>();

		// test1.TestMethod1();

		System.out.println("AAAAA: " + Test1.class);
		System.out.println("AAAAA: " + test1.hashCode());
		System.out.println("AAAAA: " + test1.getClass());
		System.out.println("AAAAA: " + c);
		//System.out.println("AAAAA: " + test1.getClass().getSimpleName());
		//System.out.println("AAAAA: " + test1.getClass().descriptorString());
		//System.out.println("AAAAA: " + test1.getClass().getAnnotations());

		System.out.println("End!");

		int[] testArr = {2, 3, 5, 4, 1};
		System.out.println("stream: " + Arrays.stream(testArr));
		System.out.println("stream: " + Arrays.stream(testArr).toString());
//		System.out.println("stream" + Arrays.stream(testArr).forEach(n -> System.out.println(n)));
		System.out.println("stream3");
		Arrays.stream(testArr).forEach(n -> System.out.println(n));
		System.out.println("stream4");
		Arrays.stream(testArr).filter(x -> x > 3).forEach(x -> System.out.println(x));

		System.out.println("sum(): " + Arrays.stream(testArr).sum());
		System.out.println("count(): " + Arrays.stream(testArr).count());
		Arrays.stream(testArr).sorted().forEach(x -> System.out.println(x));
		System.out.println("reduce(): " + Arrays.stream(testArr).reduce(0, (a, b) -> a + b));
		System.out.println("reduce(): " + Arrays.stream(testArr).reduce(1, (a, b) -> a * b));
	}
}