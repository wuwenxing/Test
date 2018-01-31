package builder.model;

import java.util.List;

/**
 * 活动抽象对象-所以的活动继承该类
 * @desc 由于该对象复杂度高，采用建造模式构造该对象
 * @desc 使用条件1:当创建复杂对象的算法应该独立于该对象的组成部分以及它们的装配方式时。
 * @desc 使用条件2:当构造过程必须允许被构造的对象有不同的表示时。
 * @desc 建造步驟：
 * @desc 第一：建造活动基础信息
 * @desc 第二：建造活动的参与条件
 * @desc 第三：建造活动的任务列表及奖励物品
 * @author wayne
 *
 */
public abstract class Active {

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

	/**
	 * 活动参与条件对象,可设置多个条件
	 */
	private List<ActiveCondition> activeConditionList;

	/**
	 * 活动奖励任务对象,可设置多个奖励任务
	 */
	private List<ActiveTask> activeTaskList;

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

	public List<ActiveCondition> getActiveConditionList() {
		return activeConditionList;
	}

	public void setActiveConditionList(List<ActiveCondition> activeConditionList) {
		this.activeConditionList = activeConditionList;
	}

	public List<ActiveTask> getActiveTaskList() {
		return activeTaskList;
	}

	public void setActiveTaskList(List<ActiveTask> activeTaskList) {
		this.activeTaskList = activeTaskList;
	}
	
}
