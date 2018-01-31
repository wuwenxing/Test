package chain;

/**
 * 定义filter过滤接口
 * @author wayne
 *
 */
public interface Filter {
	
	void doFilter(Request request, Response response, FilterChain chain);
	
}
