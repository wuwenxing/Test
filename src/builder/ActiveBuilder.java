package builder;

import builder.dto.ActiveDTO;
import builder.model.Active;

/**
 * 活动对象建造接口
 * @author wayne
 *
 */
public interface ActiveBuilder {

	/**
	 * 建造活动整个对象
	 */
	Active buliderActive(ActiveDTO param);
	
	/**
	 * 建造活动基本信息
	 */
	Active createActiveBaseInfo(ActiveDTO param);
	
	/**
	 * 建造活动参与条件
	 */
	Active createActiveCondition(ActiveDTO param);

	/**
	 * 建造活动任务与奖励物品
	 */
	Active createActiveTask(ActiveDTO param);
	
}
