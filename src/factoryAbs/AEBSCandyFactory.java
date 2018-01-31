package factoryAbs;

/**
 * 阿尔卑斯糖果工厂
 * @author wayne
 *
 */
public class AEBSCandyFactory  extends CandyFactory{

	@Override
	public Candy create() {
		return new AEBSCandy();
	}
	
}
