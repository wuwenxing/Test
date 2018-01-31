package factory;

/**
 * postgresql-数据源对象
 * @author wayne
 *
 */
public class PostgresqlDataSource extends DataSource {

	@Override
	public void getConnect() {
		System.out.println("连接postgresql数据源");
	}

}
