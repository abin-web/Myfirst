package pr2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * �������ݿ��࣬����һ�������ṩ��ȡ���ݿ����ӵķ���
 * 
 * @author 1651200111 ����־
 */
public class DBUtil {
	
	// ���ݿ�����·��
	private static final String URL = "jdbc:mysql://localhost:3306/login?useSSL=false"
			;
	private static final String NAME = "root";
	private static final String PASSWORD = "";
	private static Connection conn = null;
	
	// ��̬����飨�������������������ݿ���뾲̬���У�
	 static{
	        try {
	            // ������������
	            Class.forName("com.mysql.jdbc.Driver");
	            // ��ȡ���ݿ������
	            conn = DriverManager.getConnection(URL, NAME, PASSWORD);
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	 
	 // �����ṩһ����������ȡ���ݿ�����	    
	 public static Connection getConnection(){     
		 return conn;	   
	 }
	
	
}