package singleton;

/**
 * 登录动作-单例
 * 许多时候整个系统只需要拥有一个的全局对象，这样有利于我们协调系统整体的行为
 *  1.需要频繁实例化然后销毁的对象。 
    2.创建对象时耗时过多或者耗资源过多，但又经常用到的对象。 
    3.有状态的工具类对象。 
    4.频繁访问数据库或文件的对象。 
    
    1.资源共享的情况下，避免由于资源操作时导致的性能或损耗等。如上述中的日志文件，应用配置。 
    2.控制资源的情况下，方便资源之间的互相通信。如线程池等。
 */
public class LoginActive {

	public static LoginActive loginActive = null;
	public static int number = 0;// 登录人数在线计数
	
	public static LoginActive getInstance() {
		if (null == loginActive) {
			synchronized(LoginActive.class){
				// 多线程安全问题分析-是在cpu执行多线程时，在执行的过程中可能随时切换到其他的线程上执行
				// 多线程下，synchronized保证线程安全，只在首次会影响效率，比在方法开头加synchronized效率高很多;
				if(null == loginActive){
					loginActive = new LoginActive();
				}
			}
		}
		return loginActive;
	}

	/**
	 * 登录人数在线计数
	 */
	public void login(boolean flag) {
		if(flag){
			number ++;
		}else{
			number --;
		}
		System.out.println(number);
	}

	public static void main(String[] args) {
		LoginActive.getInstance().login(true);
		LoginActive.getInstance().login(true);
		LoginActive.getInstance().login(false);
		LoginActive.getInstance().login(false);
	}

}
