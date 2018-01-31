package factoryAbs2;

/**
 * 费力罗巧克力工厂
 * @author wayne
 *
 */
public class FerreroChocolateFactory extends FoodFactory{

	@Override
	public Food create() {
		return new FerreroChocolate();
	}
	
}
