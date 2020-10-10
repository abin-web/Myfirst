package pr2;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import pr2.UserDao;
import pr2.User;

/**   
 * ��¼������
 */
@SuppressWarnings("serial")
public class lgion extends JFrame {
	
	private final JFrame frame = new JFrame("ͼ��ݹ���ϵͳ");
	private final Container container = frame.getContentPane();
	
	// �û�����
	private JTextField texFieldtUserName  = new JTextField();
	// �����
	private JPasswordField textFieldPasswd = new JPasswordField();
	// ���ð�ť
	private JButton buttonReset = new JButton("reset");
	// ��¼��ť
	private JButton buttonLogin = new JButton("login");
	
	public lgion() {
		
		container.setLayout(null);
	
		
			
		container.add(texFieldtUserName);
		container.add(textFieldPasswd);
		container.add(buttonLogin);
		container.add(buttonReset);

		// ���ô��ڴ�С��λ�á����ӡ�Ĭ�Ϲرշ�ʽ��
		frame.setVisible(true);
		// ���ڲ��ɵ�����С
		frame.setResizable(false);
		frame.setSize(550, 388);
		frame.setLocation(300,150);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);	
	}


	/**
	 * �������ð�ť�Լ������¼�
	 */
	private void setButtonReset() {
		buttonReset.setBounds(310,280,90,30);
		buttonReset.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				texFieldtUserName.setText("");
				textFieldPasswd.setText("");
			}
		});
	}


	
	/**
	 * ���õ�¼��ť�Լ������¼�
	 */
	private void setButtonLogin() {
		buttonLogin.setBounds(150,280,90,30);
		buttonLogin.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent paramActionEvent) {
				// TODO Auto-generated method stub
				String username = texFieldtUserName.getText();
				String passwd = new String(textFieldPasswd.getPassword());
				UserDao userDao = new UserDao();						
				try {		   
					    List<User> userList = userDao.query();
				        for (User user : userList) {	
				        	if (user.getUser().equals(username) && user.getPasswd().equals(passwd)) {
				        		frame.setVisible(false);
				        		new D();
				        	} else if(username.equals("") || passwd.equals("")) {
				        		JOptionPane.showMessageDialog(null,"�û��������벻��Ϊ��","����"
										,JOptionPane.PLAIN_MESSAGE);
				        	} else {
				        		JOptionPane.showMessageDialog(null,"�û������������","����"
										,JOptionPane.PLAIN_MESSAGE);		
				        	}
				        }			        
				}catch(Exception ex) {
					ex.printStackTrace();
				}  
			}
		});
	}
}