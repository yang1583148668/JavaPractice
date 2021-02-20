package day17.thread.test01;

public class MyThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <=100; i++) {
			System.out.println("myThread:"+i);
		}
	}
	
}
