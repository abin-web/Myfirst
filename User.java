package pr2;

/**
 * �û�ģ����,�������ݿ��û������Ӧ���ֶ�get��set����

 */
public class User {
	
	private int ID;
	// �û���
	private String userName;
	// ����
	private String passwd;
	
	
	/**
	 * ��ȡID
	 */
	public int getID() {
		return ID;
	}
	/**
	 * ����ID
	 */
	public void setID(int iD) {
		ID = iD;
	}
	
	
	/**
	 * ��ȡ�û���
	 */
	public String getUser() {
		return userName;
	}
	/**
	 * �����û���
	 */
	public void setUser(String userName) {
		this.userName = userName;
	}
	
	/**
	 * ��ȡ�û�����
	 */
	public String getPasswd() {
		return passwd;
	}
	/**
	 * �����û�����
	 */
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

}