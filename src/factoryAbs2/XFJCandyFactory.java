package factoryAbs2;

/**
 * 徐福记糖果工厂
 * @author wayne
 *
 */
public class XFJCandyFactory extends FoodFactory {

	@Override
	public Food create() {
		return new XFJCandy();
	}
	
}
