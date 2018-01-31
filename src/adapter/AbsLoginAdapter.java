package adapter;

/**
 * 适配器实现类
 * @desc 里面都是空方法，子类根据自己的业务逻辑，选择实现的方法,都可以达到登录的目的
 * @author wayne
 *
 */
public abstract class AbsLoginAdapter implements LoginAdapter {

	@Override
	public abstract void login();
	
	@Override
	public void loginByApp() {

	}

	@Override
	public void loginByPC() {

	}

	@Override
	public void loginByInterface() {

	}

}
