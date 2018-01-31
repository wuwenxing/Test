package factory;

/**
 * mysql-数据源对象
 * @author wayne
 *
 */
public class MysqlDataSource extends DataSource {

	@Override
	public void getConnect() {
		System.out.println("连接mysql数据源");
	}
	
}
