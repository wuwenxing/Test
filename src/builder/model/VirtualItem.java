package builder.model;

import builder.enums.ItemTypeEnum;

/**
 * 虚拟物品
 */
public class VirtualItem extends Item {

	/**
	 * 重载父类方法，固定物品类型为虚拟物品
	 */
	@Override
	public String getItemType() {
		return ItemTypeEnum.VIRTUAL.getLabelKey();
	}

}
