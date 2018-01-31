package chain;

/**
 * 关键字过滤规则实现
 * @author wayne
 *
 */
public class KeysFilter implements Filter{

	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		System.out.println("过滤器--KeysFilter--被调用");
		
		request.setMsg(request.getMsg().replace("购买黄金", ""));
		System.out.println(request.getMsg());
		
		chain.doFilter(request, response, chain);
		
		response.setMsg(response.getMsg().replace("购买黄金", ""));
		System.out.println(response.getMsg());
	}

}
