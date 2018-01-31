package chain;

import java.util.ArrayList;
import java.util.List;

/**
 * @desc 可以设置多个FilterChain对象，并可以由调用方自由组合过滤规则
 * @desc doFilter中添加参数FilterChain，使得每个FilterChain对象执行后，调用下一个FilterChain对象,...
 * @desc 
 * @author wayne
 *
 */
public class FilterChain implements Filter {

	private int index = 0;
	
	private List<Filter> filterList = new ArrayList<Filter>();
	
	public FilterChain addFilter(Filter filter){
		filterList.add(filter);
		return this;
	}
	
	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		System.out.println("--过滤开始--");
		if(null == filterList || filterList.size() <= 0 || filterList.size() <= index){
			System.out.println("--没有下一个filter，则退出--");
			return;
		}
		Filter filter = filterList.get(index);
		index++;
		filter.doFilter(request, response, chain);
		System.out.println("--过滤结束--");
		return;
	}

}
