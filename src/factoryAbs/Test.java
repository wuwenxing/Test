package factoryAbs;

public class Test {

	/**
	 * @desc 未使用模式
	 * @desc 获取一个糖果和一个巧克力，使用new创建
	 */
	@org.junit.Test
	public void test1() {
		System.out.println("未使用模式");

		Candy candy = new AEBSCandy();
		candy.getName();
		candy.getTradeMark();

		Chocolate colate = new FerreroChocolate();
		colate.getName();
		colate.getTradeMark();

	}

	/**
	 * @desc 简单工厂模式-生产同一类的所有产品
	 * @desc 获取一个糖果和一个巧克力，交给各自对应的工厂类创建
	 * @desc 这时只需更改相应的工厂类，不需更改其他代码，增加了可扩展性，
	 */
	@org.junit.Test
	public void test2() {
		System.out.println("简单工厂模式-生产同一类的所有产品");

		// CandyFactory candyFactory = new AEBSCandyFactory();
		CandyFactory candyFactory = new XFJCandyFactory();
		Candy candy = candyFactory.create();
		candy.getName();
		candy.getTradeMark();

		// ChocolateFactory colateFactory = new FerreroChocolateFactory();
		ChocolateFactory colateFactory = new CadburyChocolateFactory();
		Chocolate chocolate = colateFactory.create();
		chocolate.getName();
		chocolate.getTradeMark();

	}

	/**
	 * @desc 抽象工厂模式-生产所有类的所有产品
	 * @desc 获取一个糖果和一个巧克力，交给食品工厂类创建
	 * @desc 这时只需更改相应的工厂类，不需更改其他代码，增加了可扩展性，
	 */
	@org.junit.Test
	public void test3() {
		// 参见factoryAbs2包
	}

	public static void main(String[] args) {

	}
}
