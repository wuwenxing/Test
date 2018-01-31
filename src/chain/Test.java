package chain;

public class Test {

	/**
	 * @desc 责任链模式
	 * @desc request对象是正序过滤、response对象是倒序过滤
	 * @desc 实现原理：自身FilterChain对象包含所有要执行的filter；每次执行doFilter方法时，都把自身当参数传入，并将下标自增，在调用下一个Filter;
	 */
	@org.junit.Test
	public void test1() {
		Request request = new Request();
		request.setMsg("责任链模式是一种对象的行为模式--[购买黄金<br>]");
		Response response = new Response();
		response.setMsg("很多对象由每一个对象对其下家的引用而连接起来形成一条链--[购买黄金<br>]");
		
		FilterChain chain = new FilterChain();
		chain.addFilter(new HTMLFilter())
			.addFilter(new KeysFilter());
		
		chain.doFilter(request, response, chain);
	}

	public static void main(String[] args) {
		
	}
}
