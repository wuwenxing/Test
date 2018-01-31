package factory;

public class Test {

	public static void main(String[] args) {
		
//		DataSourceFactory dataSource = new MysqlDataSourceFactory();
//		dataSource.createDataSource().getConnect();
		
		/**
		 * 只需改动创建的实现类,不必改动其他代码,易扩展,这个创建的类也可以放入到配置文件中;
		 */
		DataSourceFactory dataSource = new PostgresqlDataSourceFactory();
		dataSource.createDataSource().getConnect();
	}
}
