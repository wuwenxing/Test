package flyweight;

import java.sql.Connection;

public class Test {

	/**
	 * @desc 享元模式-实现对象的共享，即共享池
	 * @desc 
	 */
	@org.junit.Test
	public void test1() {
		Connection con = ConnectionPool.getInstance().getConnection();
		System.out.println("获取一个数据库连接" + con);
		System.out.println("数据池大小=" + ConnectionPool.getInstance().getPoolSize());

		ConnectionPool.getInstance().release();
		System.out.println("数据池大小=" + ConnectionPool.getInstance().getPoolSize());
	}

	public static void main(String[] args) {

	}
}
