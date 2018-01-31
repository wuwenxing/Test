package proxy;

public class Test {

	/**
	 * @desc 代理模式-多一个代理类出来，替原对象进行一些操作。代理类就像中介，它比我们掌握着更多的信息
	 */
	@org.junit.Test
	public void test1() {
		PhoneBusiness proxy = new PhoneBusinessProxy(new PhoneBusinessImpl());
		proxy.sellPhone(proxy.getPhone());
	}

	public static void main(String[] args) {

	}
}
