package proxy;

/**
 * 定义一个生产手机的工厂对象
 * @author wayne
 *
 */
public class PhoneFactory {
	
	public Phone create(){
		return new Phone("IPhone6s", "苹果", "4.7英寸", "IOS");
	}
	
}
