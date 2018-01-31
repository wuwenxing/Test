package factoryAbs2;

/**
 * 吉百利巧克力工厂
 * @author wayne
 *
 */
public class CadburyChocolateFactory extends FoodFactory{

	@Override
	public Food create() {
		return new CadburyChocolate();
	}
	
}
