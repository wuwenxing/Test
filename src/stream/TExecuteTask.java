package stream;

public class TExecuteTask {
    /**
     * 主键
     */
    private Long excId;

    /**
     * 布控名称
     */
    private String taskName;

    /**
     * 分属区域
     */
    private String taskArea;

    /**
     * 分属区域-详细
     */
    private String taskAreaDetail;
    
    /**
     * 主键
     * @return exc_id 主键
     */
    public Long getExcId() {
        return excId;
    }

    /**
     * 主键
     * @param excId 主键
     */
    public void setExcId(Long excId) {
        this.excId = excId;
    }

    /**
     * 布控名称
     * @return task_name 布控名称
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * 布控名称
     * @param taskName 布控名称
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    /**
     * 分属区域
     * @return task_area 分属区域
     */
    public String getTaskArea() {
        return taskArea;
    }

    /**
     * 分属区域
     * @param taskArea 分属区域
     */
    public void setTaskArea(String taskArea) {
        this.taskArea = taskArea == null ? null : taskArea.trim();
    }

    public String getTaskAreaDetail() {
		return taskAreaDetail;
	}

	public void setTaskAreaDetail(String taskAreaDetail) {
		this.taskAreaDetail = taskAreaDetail;
	}

}