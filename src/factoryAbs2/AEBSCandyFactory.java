package factoryAbs2;

/**
 * 阿尔卑斯糖果工厂
 * @author wayne
 *
 */
public class AEBSCandyFactory  extends FoodFactory{

	@Override
	public Food create() {
		return new AEBSCandy();
	}
	
}
