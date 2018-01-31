package decoration;

/**
 * 远动员service实现
 * @author wayne
 *
 */
public class PlayerServiceImpl implements PlayerService {
	
	/**
	 * 运动员喝饮料动作
	 */
	public void drinks(Player player, Drinks drinks){
		System.out.println("运动员" + player.getName() + "在喝" + drinks.getName() + "饮料...");
	}
	
}
