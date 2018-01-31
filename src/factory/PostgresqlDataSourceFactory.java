package factory;

/**
 * postgresql-数据源抽象工厂类-专门生产postgresql类型的数据源对象
 * @author wayne
 *
 */
public class PostgresqlDataSourceFactory extends DataSourceFactory {

	@Override
	public DataSource createDataSource() {
		DataSource dataSource = new PostgresqlDataSource();
		return dataSource;
	}
	
}
