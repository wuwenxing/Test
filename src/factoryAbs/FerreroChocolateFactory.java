package factoryAbs;

/**
 * 费力罗巧克力工厂
 * @author wayne
 *
 */
public class FerreroChocolateFactory extends ChocolateFactory{

	@Override
	public Chocolate create() {
		return new FerreroChocolate();
	}
	
}
