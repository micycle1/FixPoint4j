package com.github.xmunkki.fixpoint;

class Util {
	public static void Check(String opName, long output, long expected, long input0) {
		if (output != expected)
			System.out.printf("MISMATCH in %s: got %d, expected %d, inputs %d\n", opName, output, expected, input0);
	}

	public static void Check(String opName, long output, long expected, long input0, long input1) {
		if (output != expected)
			System.out.printf("MISMATCH in %s: got %d, expected %d, inputs %d %d\n", opName, output, expected, input0, input1);
	}

	public static void Check(String opName, int output, int expected, int input0) {
		if (output != expected)
			System.out.printf("MISMATCH in %s: got %d, expected %d, inputs %d\n", opName, output, expected, input0);
	}

	public static void Check(String opName, int output, int expected, int input0, int input1) {
		if (output != expected)
			System.out.printf("MISMATCH in %s: got %d, expected %d, inputs %d %d\n", opName, output, expected, input0, input1);
	}
}

public class FixPointTest {
	public static void main(String[] args) {
		System.out.println("Executing all unit tests..");
		UnitTest.TestAll();
		System.out.println("Unit tests finished!");
	}
}
