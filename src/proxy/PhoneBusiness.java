package proxy;

/**
 * 手机商户对象-接口
 * @desc 需要去PhoneFactory工厂拿货，然后在卖给消费者
 * @author wayne
 *
 */
public interface PhoneBusiness {

	/**
	 * 拿货
	 */
	public Phone getPhone();
	
	/**
	 * 卖手机
	 */
	public void sellPhone(Phone phone);
	
}
