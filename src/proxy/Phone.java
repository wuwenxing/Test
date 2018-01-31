package proxy;

/**
 * 手机对象
 * @author wayne
 *
 */
public class Phone {
	
	/**
	 * 手机名称
	 */
	private String name;

	/**
	 * 手机品牌
	 */
	private String trademark;
	
	/**
	 * 手机尺寸
	 */
	private String size;
	
	/**
	 * 操作系统类型
	 */
	private String systemType;

	
	public Phone() {
		super();
	}
	
	public Phone(String name, String trademark, String size, String systemType) {
		super();
		this.name = name;
		this.trademark = trademark;
		this.size = size;
		this.systemType = systemType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTrademark() {
		return trademark;
	}

	public void setTrademark(String trademark) {
		this.trademark = trademark;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSystemType() {
		return systemType;
	}

	public void setSystemType(String systemType) {
		this.systemType = systemType;
	}
	
}
