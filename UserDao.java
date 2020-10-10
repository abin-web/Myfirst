package pr2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pr2.User;

/**
 * �û�����Ϣ���ݷ��ʶ����࣬���������û���Ϣ
 * 
 */
public class UserDao {
	    

	/**
	 * �����û���Ϣ
	 */
    public void updateUser (User user, String username, String passwd) throws SQLException{
    	// �����õ����ݿ������
        Connection con = DBUtil.getConnection();
        String sql="update login "
        		// ������?��ʾ���൱��ռλ��
        		+"set user=?,passwd=? "
        		+ "where id=1";
        //Ԥ����sql���
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        //�ȶ�ӦSQL��䣬��SQL��䴫�ݲ���
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, passwd);
        //ִ��SQL���
        preparedStatement.execute();    
    }

	
	/**
	 * ��ѯ�û���Ϣ(������)
	 *  
	 * @return
	 * 		userList
	 */
	public List<User> query() throws Exception{	       
		Connection con = DBUtil.getConnection();	        
		Statement stmt = con.createStatement();	       
		ResultSet rs = stmt.executeQuery("select user,passwd from login");	      
		List<User> userList = new ArrayList<User>();	       
		User user = null;	     
		// ��������������ݣ��ͻ�ѭ����ӡ����
		while (rs.next()){	           
			user = new User();	           
			user.setUser(rs.getString("user"));	       
			user.setPasswd(rs.getString("passwd"));
			userList.add(user);	        
		}	       
		return userList;	  
	}
	

	/**
	 * '���ԣ��Ƿ���Եõ��û�������ݶ���Ϣ
	 */
    public static void main(String[] args) throws Exception {
        UserDao userDao = new UserDao();
        List<User> userList=userDao.query();
        for (User goddess : userList) {
            System.out.println(goddess.getUser()+","+goddess.getPasswd());
        }
    }
	
}