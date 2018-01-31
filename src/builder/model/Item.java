package builder.model;

/**
 * 物品抽象类-所以的物品继承该类
 * @author wayne
 *
 */
public abstract class Item {
	
	/**
	 * 物品名称
	 */
	private String itemName;
	/**
	 * 物品编号
	 */
	private String itemCode;
	/**
	 * 物品类型-对应ItemTypeEnum
	 */
	private String itemType;
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	
}
