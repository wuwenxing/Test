package adapter;

/**
 * 登录操作-使用适配器模式
 * @desc 都只是实现登录的功能-由于定义的每个接口都是实现同一个功能-所以这时可以使用适配器模式
 * @author wayne
 *
 */
public interface LoginAdapter {

	/**
	 * 登录统一入口,具体调用哪个登录接口，交给外部选择
	 */
	public void login();
	
	/**
	 * app端登录
	 */
	public void loginByApp();

	/**
	 * pc端登录
	 */
	public void loginByPC();

	/**
	 * 接口登录
	 */
	public void loginByInterface();
	
}
