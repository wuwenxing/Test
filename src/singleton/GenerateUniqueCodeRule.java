package singleton;

/**
 * 消息中心-自定义编号生成规则
 * @author wayne
 *	
 */
public class GenerateUniqueCodeRule {
	
	private static GenerateUniqueCodeRule gucu = null;

	public static int number = 100;// 自增number

	public static String tplCode = "define_tpl_";
	public static String tagCode = "define_tag_";
	
	public static String logCode = "XX1";
	public static int logNumber = 100;// 自增number
	
	static {
		
	}
	
	private GenerateUniqueCodeRule(){
		// 设为私有、禁止外部创建
	}
	
	/**
	 * 不需频繁创建，使用单例
	 * @return
	 */
	public static GenerateUniqueCodeRule getInstance(){
		if(null == gucu){
			synchronized (GenerateUniqueCodeRule.class) {
				if(null == gucu){
					gucu = new GenerateUniqueCodeRule(); // 线程安全
				}
			}
		}
		return gucu;
	}

	/**
	 * 获取唯一code
	 */
	public String getCode(String prefix) {
		if(null == prefix){
			prefix = "";
		}
		String dateStr = "";
		synchronized (GenerateUniqueCodeRule.class) {
			dateStr = "";
			number ++;
		}
		return prefix + dateStr+ "_" + number;
	}

	/**
	 * 获取唯一code
	 * logNumber发送流水号
	 */
	public String getLogCode(String prefix) {
		if(null == prefix){
			prefix = "";
		}
		String dateStr = "";
		synchronized (GenerateUniqueCodeRule.class) {
			dateStr = "";
			logNumber ++;
		}
		return prefix + dateStr + logNumber;
	}

	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<1000; i++){
					System.out.println(GenerateUniqueCodeRule.getInstance().getCode("T_"));
				}
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<1000; i++){
					System.out.println(GenerateUniqueCodeRule.getInstance().getCode("F_"));
				}
			}
		}).start();
	}
	
}
