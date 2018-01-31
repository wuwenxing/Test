package builder.dto;

/**
 * 活动数据传输对象
 * @author wayne
 *
 */
public class ActiveDTO {

	/**
	 * 活动编号
	 */
	private String code;
	
	/**
	 * 活动名称
	 */
	private String name;
	
	/**
	 * 活动类型-对应ActTypeEnum枚举
	 */
	private String type;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
