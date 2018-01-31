package builder.model;

/**
 * 活动任务对象
 * @author wayne
 *
 */
public class ActiveTask {

	/**
	 * 任务编号
	 */
	private String taskCode;
	
	/**
	 * 任务名称
	 */
	private String taskName;
	
	/**
	 * 奖励物品
	 */
	private Item item;

	public String getTaskCode() {
		return taskCode;
	}

	public void setTaskCode(String taskCode) {
		this.taskCode = taskCode;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
}
