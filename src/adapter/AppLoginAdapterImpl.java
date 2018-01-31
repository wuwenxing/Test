package adapter;

/**
 * 适配器实现类
 * @desc 里面都是空方法，子类根据自己的业务逻辑，选择实现的方法,都可以达到登录的目的
 * @author wayne
 *
 */
public class AppLoginAdapterImpl extends AbsLoginAdapter {

	/**
	 * 统一入口、调用loginByApp方法实现登录
	 */
	@Override
	public void login() {
		this.loginByApp();
	}

	/**
	 * 重写APP登录方法
	 */
	@Override
	public void loginByApp() {
		System.out.println("通过APP登录系统");
	}

}
