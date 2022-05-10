package org.example.anonymousClass;

class Outer2 {
	Runnable getRunnable(int i)	 {
		int num = 100;

		return new Runnable() {
			@Override
			public void run() {
				System.out.println(i);
				System.out.println(num);
			}
		};
	}

	Runnable runner = new Runnable() {
		@Override
		public void run() {
			System.out.println("Runnable anonymous class");
		}
	};
}

public class anonymousMain {
	public static void main(String[] args) {
		System.out.println("START");
		Outer2 out = new Outer2();

		System.out.println("111");
		Runnable runnable = out.getRunnable(3000);
		System.out.println("222");
		runnable.run();
		System.out.println("333");
		out.runner.run();
		System.out.println("END");
	}
}
