package adapter;

/**
 * 适配器实现类
 * @desc 里面都是空方法，子类根据自己的业务逻辑，选择实现的方法,都可以达到登录的目的
 * @author wayne
 *
 */
public class PCLoginAdapterImpl extends AbsLoginAdapter {

	/**
	 * 统一入口、调用loginByPC方法实现登录
	 */
	@Override
	public void login() {
		this.loginByPC();
	}

	/**
	 * 重写PC登录方法
	 */
	@Override
	public void loginByPC() {
		System.out.println("通过PC端登录系统");
	}

}
