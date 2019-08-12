package lk;

public class Example extends Thread {
	@Override

	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print("run");

	}

	public static void main(String[] args) {

		Example example = new Example();

		// 普通方法的调用和通过线程start的启动调用的区别
		example.run();// 把线程的run方法当普通方法调用
		System.out.print("main");
		int a[]=null; 
		a[0]=1;
//		example.start();// 启动线程是调用start方法
//		System.out.print("main");

	}
}
