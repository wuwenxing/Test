package factoryAbs;

/**
 * 吉百利巧克力工厂
 * @author wayne
 *
 */
public class CadburyChocolateFactory extends ChocolateFactory{

	@Override
	public Chocolate create() {
		return new CadburyChocolate();
	}
	
}
