package builder.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * 物品类型
 * @author wayne
 * 
 */
public enum ItemTypeEnum {

	/** 实物物品 */
	REAL("实物物品", "real"),
	/** 虚拟物品 */
	VIRTUAL("虚拟物品", "virtual"),
	/** 接口物品 */
	INTERFACE("接口物品", "interface"),
	/** 模拟币 */
	ANALOGCOIN("模拟币", "analogCoin"),
	/** 代币 */
	TOKENCOIN("代币", "tokenCoin"),
	/** 赠金 */
	WITHGOLD("赠金", "withGold");

	private final String value;
	private final String labelKey;

	ItemTypeEnum(String _operator, String labelKey) {
		this.value = _operator;
		this.labelKey = labelKey;
	}

	public static List<ItemTypeEnum> getList() {
		List<ItemTypeEnum> result = new ArrayList<ItemTypeEnum>();
		for (ItemTypeEnum ae : ItemTypeEnum.values()) {
			result.add(ae);
		}
		return result;
	}

	public static String format(String labelKey) {
		for (ItemTypeEnum ae : ItemTypeEnum.values()) {
			if (ae.getLabelKey().equals(labelKey)) {
				return ae.getValue();
			}
		}
		return labelKey;
	}

	public String getValue() {
		return value;
	}

	public String getLabelKey() {
		return labelKey;
	}

}
