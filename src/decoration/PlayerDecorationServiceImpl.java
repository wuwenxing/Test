package decoration;

/**
 * 包装器-在PlayerService接口外，在去实现一层业务逻辑
 * 装饰者、代理模式很相似，区别：装饰者模式是增强对象功能,代理模式是控制代理的对象，但不对其做功能增加
 * @desc 
 * @author wayne
 *
 */
public class PlayerDecorationServiceImpl implements PlayerService {
	
	/**
	 * 聚合-接口对象
	 */
	private PlayerService playerService;
	
	/**
	 * 构造方法，参数为接口对象
	 * @param playerService
	 */
	public PlayerDecorationServiceImpl(PlayerService playerService) {
		this.playerService = playerService;
	}

	/**
	 * 运动员喝饮料动作
	 */
	public void drinks(Player player, Drinks drinks){
		System.out.println("运动员" + player.getName() + "打篮球中，口渴了");
		playerService.drinks(player, drinks);
		System.out.println("运动员" + player.getName() + "喝完饮料，继续打篮球");
	}
	
}
