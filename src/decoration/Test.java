package decoration;

public class Test {

	/**
	 * 举例1：运动员老王喝可口可乐；
	 * 举例2：运动员老王打完篮球后在喝可口可乐；
	 * 
	 * 特征：装饰对象和真实对象有相同的接口。
	 * 特征：装饰对象包含一个真实对象的引用。
	 * 特征：装饰对象接受所有来自客户端的请求。它把这些请求转发给真实的对象。
	 * 特征：装饰对象可以在转发这些请求以前或以后增加一些附加功能。
	 */
	
	/**
	 * 实现第一个举例
	 * @desc 未使用模式-老王喝饮料
	 * @desc 获取一个糖果和一个巧克力，使用new创建
	 */
	@org.junit.Test
	public void test1() {
		System.out.println("未使用模式...");
		Player player = new Player();
		player.setName("老王");
		Drinks drinks = new Drinks();
		drinks.setName("可口可乐");
		PlayerService playerService = new PlayerServiceImpl();
		playerService.drinks(player, drinks);
	}

	/**
	 * 实现第二个举例
	 * @desc 使用装饰模式-运动员老王打完篮球后在喝可口可乐；
	 * @desc 获取一个糖果和一个巧克力，使用new创建
	 */
	@org.junit.Test
	public void test2() {
		System.out.println("使用装饰模式...");
		Player player = new Player();
		player.setName("老王");
		Drinks drinks = new Drinks();
		drinks.setName("可口可乐");
		PlayerService playerServiceDecoration = new PlayerDecorationServiceImpl(new PlayerServiceImpl());
		playerServiceDecoration.drinks(player, drinks);
	}

	public static void main(String[] args) {

	}
}
