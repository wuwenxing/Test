package builder;

import builder.dto.ActiveDTO;
import builder.enums.ActTypeEnum;
import builder.model.Active;

/**
 * 活动对象建造接口实现-任务型建造
 * @author wayne
 *
 */
public class ActiveRWConstructBuilder implements ActiveBuilder {

	/**
	 * 聚合活动对象
	 */
	private Active active;
	
	/**
	 * 构造方法
	 * @param active
	 */
	public ActiveRWConstructBuilder(Active active) {
		super();
		this.active = active;
	}

	/**
	 * 此方法，根据具体的业务逻辑，去组合建造，自由组合，提升扩展性
	 */
	@Override
	public Active buliderActive(ActiveDTO param) {
		this.createActiveBaseInfo(param);
		this.createActiveCondition(param);
		this.createActiveTask(param);
		return active;
	}

	@Override
	public Active createActiveBaseInfo(ActiveDTO param) {
		System.out.println("任务型-建造活动基本信息");
		active.setType(ActTypeEnum.RW.getLabelKey());
		return active;
	}

	@Override
	public Active createActiveCondition(ActiveDTO param) {
		System.out.println("任务型-建造活动参与条件");
		return active;
	}

	@Override
	public Active createActiveTask(ActiveDTO param) {
		System.out.println("任务型-建造活动任务与奖励物品");
		return active;
	}
	
}
