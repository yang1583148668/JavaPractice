package day17.thread.test01;

public class TestThread {
	public static void main(String[] args) {
		System.out.println("主线程");
		MyThread myThread = new MyThread();
		myThread.start();
		for (int i = 1; i <=100; i++) {
			System.out.println("mainThread:"+i);
		}
	}
}
