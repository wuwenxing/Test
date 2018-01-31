package combination;


/**
 * 定义抽象类
 * @author wayne
 *
 */
public abstract class Company {
	
	private String name;
	
	public Company() {
		
    }
	
	public Company(String name) {
        super();
        this.name = name;
    }
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 添加子节点 
	 */
	protected abstract void add(Company company);
	
	/**
	 * 移除子节点 
	 */
	protected abstract void remove(Company company);
	
	/**
	 * 显示子节点 
	 */
	protected abstract void display(int depth);
	
}
