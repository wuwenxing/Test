package builder.enums;

/**
 * 摘要：活动类型
 * @author eva
 * @version 1.0
 * @Date 2017年6月14日
 */
public enum ActTypeEnum {
	/**任务型*/
	RW("rw","任务型"),
	/**物品兑换型*/
	WPDH("wpdh","物品兑换型"),
	/**入金赠金型*/
	RJZJ("rjzj","入金赠金型"),
	/**层级型*/
	CJ("cj","层级型"),
	/**其他*/
	QT("qt","其他");
	
	private String value;
	private  String labelKey;
	ActTypeEnum(String value,String labelKey){
		this.value = value;
		this.labelKey = labelKey;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

    public String getLabelKey() {
        return labelKey;
    }

    public void setLabelKey(String labelKey) {
        this.labelKey = labelKey;
    }
}