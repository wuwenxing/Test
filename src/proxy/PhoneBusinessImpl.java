package proxy;

/**
 * 手机商户对象-实现接口
 * @desc 需要去PhoneFactory工厂拿货，然后在卖给消费者
 * @author wayne
 *
 */
public class PhoneBusinessImpl implements PhoneBusiness {

	@Override
	public Phone getPhone() {
		PhoneFactory factory = new PhoneFactory();
		return factory.create();
	}

	@Override
	public void sellPhone(Phone phone) {
		System.out.println("卖掉一部手机:" + phone.getName());
	}
	
}
