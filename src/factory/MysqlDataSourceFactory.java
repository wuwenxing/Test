package factory;

/**
 * mysql-数据源抽象工厂类-专门生产mysql类型的数据源对象
 * @author wayne
 *
 */
public class MysqlDataSourceFactory extends DataSourceFactory {

	@Override
	public DataSource createDataSource() {
		DataSource dataSource = new MysqlDataSource();
		return dataSource;
	}
	
}
