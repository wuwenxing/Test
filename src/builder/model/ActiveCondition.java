package builder.model;

/**
 * 活动参与条件对象
 * @author wayne
 *
 */
public class ActiveCondition {

	/**
	 * 交易类型-开仓还是平仓
	 */
	private String tradeType;

	/**
	 * 累计交易手数
	 */
	private String tradeVolumeCount;
	
	/**
	 * 累计交易次数
	 */
	private String tradeCount;

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getTradeVolumeCount() {
		return tradeVolumeCount;
	}

	public void setTradeVolumeCount(String tradeVolumeCount) {
		this.tradeVolumeCount = tradeVolumeCount;
	}

	public String getTradeCount() {
		return tradeCount;
	}

	public void setTradeCount(String tradeCount) {
		this.tradeCount = tradeCount;
	}
	
}
