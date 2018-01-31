package bridge;

public class Test {

	/**
	 * @desc 桥接模式-应对多维度的变化
	 * @desc 桥接模式即将抽象部分与它的实现部分分离开来，使他们都可以独立变化
	 * @desc 将一方与桥绑定，即实现桥接口，另一方在抽象类中调用桥接口（指向的实现类），
	 * @desc 这样桥方可以通过实现桥接口进行单方面扩展，而另一方可以继承抽象类而单方面扩展，而之间的调用就从桥接口来作为突破口，不会受到双方扩展的任何影响
	 */
	@org.junit.Test
	public void test1() {
		System.out.println("桥接模式...");

		Color w = new White();
		Color b = new Black();

		Shape r = new Rectangle(w);
		Shape r_1 = new Rectangle(b);
		Shape s = new Square(w);
		Shape s_1 = new Square(b);

		r.draw();
		r_1.draw();
		s.draw();
		s_1.draw();
		
	}
	
	public static void main(String[] args) {
		
	}
}
