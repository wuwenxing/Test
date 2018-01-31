package adapter;

/**
 * 适配器实现类
 * @desc 里面都是空方法，子类根据自己的业务逻辑，选择实现的方法,都可以达到登录的目的
 * @author wayne
 *
 */
public class InterfaceLoginAdapterImpl extends AbsLoginAdapter {

	/**
	 * 统一入口、调用loginByInterface方法实现登录
	 */
	@Override
	public void login() {
		this.loginByInterface();
	}
	
	/**
	 * 重写Interface登录方法
	 */
	@Override
	public void loginByInterface() {
		System.out.println("通过Interface登录系统");
	}

}
