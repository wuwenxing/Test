package builder.model;

import builder.enums.ItemTypeEnum;

/**
 * 实物物品
 */
public class RealItem extends Item {

	/**
	 * 重载父类方法，固定物品类型为实物物品
	 */
	@Override
	public String getItemType() {
		return ItemTypeEnum.REAL.getLabelKey();
	}

}
