package adapter;

public class Test {

	/**
	 * @desc 适配器模式
	 */
	@org.junit.Test
	public void test1() {
		System.out.println("适配器模式...");
		
		/**
		 * 创建一个登录适配器实现类，只需修改构建的实现类，自由切换或者实现可配置的功能
		 */
		LoginAdapter loginAdapter = new AppLoginAdapterImpl();
//		LoginAdapter loginAdapter = new PCLoginAdapterImpl();
//		LoginAdapter loginAdapter = new InterfaceLoginAdapterImpl();
		loginAdapter.login();
		
	}
	
	public static void main(String[] args) {
		
	}
}
