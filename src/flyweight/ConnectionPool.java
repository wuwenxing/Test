package flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 * 享元模式-实现对象的共享，即共享池
 * @author wayne
 *
 */
public class ConnectionPool {

	/* 公有属性 */
	private String url = "jdbc:mysql://localhost:3306/dasweb";
	private String username = "root";
	private String password = "Dev1234{}";
	private String driverClassName = "com.mysql.jdbc.Driver";

	// Vector是矢量队列,可实现自动增长的对象数组
	// 对于预先不知或者不愿预先定义数组大小，并且需要频繁地进行查找，插入，删除工作的情况，可以考虑使用向量类
	private Vector<Connection> pool;
	private int poolSize = 5;
	private static ConnectionPool instance = null;
	private Connection conn = null;

	/* 构造方法，做一些初始化工作 */
	private ConnectionPool() {
		pool = new Vector<Connection>(poolSize);
		for (int i = 0; i < poolSize; i++) {
			try {
				Class.forName(driverClassName);
				conn = DriverManager.getConnection(url, username, password);
				pool.add(conn);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/* 返回连接到连接池 */
	public synchronized void release() {
		pool.add(conn);
	}

	/* 返回连接池中的一个数据库连接 */
	public synchronized Connection getConnection() {
		if (pool.size() > 0) {
			Connection conn = pool.get(0);
			pool.remove(conn);
			return conn;
		} else {
			return null;
		}
	}

	/**
	 * 返回可用连接大小
	 * @return
	 */
	public int getPoolSize(){
		return pool.size();
	}
	
	public static ConnectionPool getInstance() {
		if (null == instance) {
			synchronized (ConnectionPool.class) {
				// 多线程安全问题分析-是在cpu执行多线程时，在执行的过程中可能随时切换到其他的线程上执行
				// 多线程下，synchronized保证线程安全，只在首次会影响效率，比在方法开头加synchronized效率高很多;
				if (null == instance) {
					instance = new ConnectionPool();
				}
			}
		}
		return instance;
	}
}
