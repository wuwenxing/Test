package builder.enums;

/**
 * 虚拟物品类型下-物品种类
 * @author wayne
 * 
 */
public enum ItemCategoryEnum {
	/**流量*/
    MOBILEDATA("mobile_data","流量"),
    /**话费*/
    MOBILECHARGE("mobile_charge","话费"),
    /**会员*/
    MEMBERVIP("member_vip","会员"),
    /**串码物品*/
    STRINGCODE("string_code","串码物品");
 
	private String value;
	private  String labelKey;
	ItemCategoryEnum(String value,String labelKey){
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
