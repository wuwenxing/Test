package factoryAbs;

/**
 * 徐福记糖果工厂
 * @author wayne
 *
 */
public class XFJCandyFactory extends CandyFactory {

	@Override
	public Candy create() {
		return new XFJCandy();
	}
	
}
