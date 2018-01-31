package factory;

/**
 * 数据源抽象工厂类，可以创建不同类型的数据源对象-具体类型是由用户自己需要
 * @author wayne
 *
 */
public abstract class DataSourceFactory {

	/**
	 * 创建数据源对象
	 * @return
	 */
	public abstract DataSource createDataSource();
	
}
