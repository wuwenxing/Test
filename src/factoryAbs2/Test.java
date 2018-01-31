package factoryAbs2;

public class Test {

	/**
	 * @desc 未使用模式
	 * @desc 获取一个糖果和一个巧克力，使用new创建
	 */
	@org.junit.Test
	public void test1() {
		// 参见factoryAbs包
	}

	/**
	 * @desc 简单工厂模式-生产同一类的所有产品
	 * @desc 获取一个糖果和一个巧克力，交给各自对应的工厂类创建
	 * @desc 这时只需更改相应的工厂类，不需更改其他代码，增加了可扩展性，
	 */
	@org.junit.Test
	public void test2() {
		// 参见factoryAbs包
	}

	/**
	 * @desc 抽象工厂模式-生产所有类的所有产品
	 * @desc 获取一个糖果和一个巧克力，交给食品工厂类创建
	 * @desc 这时只需更改相应的工厂类，不需更改其他代码，增加了可扩展性，
	 */
	@org.junit.Test
	public void test3() {
		System.out.println("抽象工厂模式-生产所有类的所有产品");

//		FoodFactory foodFactory = new XFJCandyFactory();
//		FoodFactory foodFactory = new AEBSCandyFactory();
//		FoodFactory foodFactory = new FerreroChocolateFactory();
		FoodFactory foodFactory = new CadburyChocolateFactory();
		Food food = foodFactory.create();
		food.getName();
		food.getTradeMark();
		
	}

	public static void main(String[] args) {

	}
}
