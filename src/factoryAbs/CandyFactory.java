package factoryAbs;

/**
 * 糖果对象工厂，生产所有类型的糖果
 * @author wayne
 *
 */
public abstract class CandyFactory {
	
	/**
	 * 生产一个糖果
	 */
	public abstract Candy create();
	
}
