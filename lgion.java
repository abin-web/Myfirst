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
 * 登录界面类
 */
@SuppressWarnings("serial")
public class lgion extends JFrame {
	
	private final JFrame frame = new JFrame("图书馆管理系统");
	private final Container container = frame.getContentPane();
	
	// 用户名框
	private JTextField texFieldtUserName  = new JTextField();
	// 密码框
	private JPasswordField textFieldPasswd = new JPasswordField();
	// 重置按钮
	private JButton buttonReset = new JButton("reset");
	// 登录按钮
	private JButton buttonLogin = new JButton("login");
	
	public lgion() {
		
		container.setLayout(null);
	
		
			
		container.add(texFieldtUserName);
		container.add(textFieldPasswd);
		container.add(buttonLogin);
		container.add(buttonReset);

		// 设置窗口大小、位置、可视、默认关闭方式等
		frame.setVisible(true);
		// 窗口不可调整大小
		frame.setResizable(false);
		frame.setSize(550, 388);
		frame.setLocation(300,150);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);	
	}


	/**
	 * 设置重置按钮以及监听事件
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
	 * 设置登录按钮以及监听事件
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
				        		JOptionPane.showMessageDialog(null,"用户名或密码不能为空","错误"
										,JOptionPane.PLAIN_MESSAGE);
				        	} else {
				        		JOptionPane.showMessageDialog(null,"用户名或密码错误","错误"
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