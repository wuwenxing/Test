package proxy;

/**
 * 商户代理对象-自己不卖手机也不拿货-完全交给其他商户
 * 装饰者、代理模式很相似，区别：装饰者模式是增强对象功能,代理模式是控制代理的对象，但不对其做功能增加
 * @desc 
 * @author wayne
 *
 */
public class PhoneBusinessProxy implements PhoneBusiness{

	private PhoneBusiness phoneBusiness;
	
	public PhoneBusinessProxy(PhoneBusiness phoneBusiness) {
		super();
		this.phoneBusiness = phoneBusiness;
	}

	@Override
	public Phone getPhone() {
		return phoneBusiness.getPhone();
	}

	@Override
	public void sellPhone(Phone phone) {
		phoneBusiness.sellPhone(phone);
	}
	
}
