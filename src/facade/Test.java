package facade;

public class Test {

	/**
	 * @desc 外观模式-为了解决类与类之间的依赖关系
	 * @desc 就是将他们的关系放在一个Facade类中，降低了类类之间的耦合度
	 */
	@org.junit.Test
	public void test1() {
		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();
	}

	public static void main(String[] args) {

	}
}
