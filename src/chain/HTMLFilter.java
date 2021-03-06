package chain;

/**
 * 网页标签过滤规则实现
 * @author wayne
 *
 */
public class HTMLFilter implements Filter{

	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		System.out.println("过滤器--HTMLFilter--被调用");
		
		request.setMsg(request.getMsg().replace("<br>", ""));
		System.out.println(request.getMsg());
		
		chain.doFilter(request, response, chain);
		
		response.setMsg(response.getMsg().replace("<br>", ""));
		System.out.println(response.getMsg());
	}

}
