package pr2;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;
import pr2.UserDao;
import pr2.User;
public class B extends JFrame
{
static JFrame frm= new JFrame("图书馆管理系统");
static JPanel pan1=new JPanel();
static JButton btn1=new JButton("学生登陆");
static JButton btn2=new JButton("管理员登陆");
static JButton btn3=new JButton("登陆");
static JButton btn4 = new JButton("登陆");
static JFrame frm1= new JFrame();
static JFrame frm2= new JFrame("学生登陆管理");
static JButton btn5 = new JButton("个人信息");
//static JButton btn6= new JButton("修改密码");
static JButton btn7 = new JButton("图书查询");
//static JButton btn8 = new JButton("借阅信息查询");
static JLabel lab4=new JLabel("登陆失败");
static JPanel pan2=new JPanel();
static JPasswordField jpf = new JPasswordField();
static JTextField jtf1 = new JTextField();
static JFrame frame;
static JTextField textField;
static JTextField textField_1;
static JTextField textField_2;
static JTextField textField_3;
static JTextField textField_4;
static JLabel lblNewLabel_4;
static JTextField textField_5;
static JFrame frame1;
static JTable table1;
static JTable table_2;
static JTable table_1;
static JTable table_3;
static JTable table_4;
static JTable table_5;
static JScrollBar scrollBar;
static JTextField textField1;
static JTextField textField_11;
static JTextField textField_21;
static JTextField textField_31;
static JTextField textField_41;
static JTextField textField_51;
static JTextField textField_61;
static JTextField textField_71;
static JTextField textField_81;
static JTextField textField_91;
static JTextField textField_101;
static JTextField textField_111;
static JLabel lblId;
static JLabel label1;
static JLabel label_11;
static JLabel label_21;
static JLabel label_31;
static JLabel label_41;
	public B()
	{
		ImageIcon ic1=new ImageIcon("P2.jpg");
		JLabel lab1=new JLabel(ic1);
		lab1.setOpaque(false);
		lab1.setSize(485,257);
		
		frm.add(lab1);
		pan1.add(btn2);
		pan1.add(btn1);		
		frm.setLayout(null);
		pan1.setLayout(new GridLayout(1,2));
		frm.setSize(485, 300);
		frm.setResizable(false);
		pan1.setBounds(80, 200, 300, 20);
		frm.add(pan1);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
		
	}
public static void main(String[] args) 
{
	    new B();
	    //new C();
	    
	    //new AAA();
	    btn1.addActionListener(new ActionListener(){
			//单击按钮执行的方法
			public void actionPerformed(ActionEvent e) {
			closeThis();
			JFrame frm2 = new JFrame("学生登陆");
			 frm2.setLayout(null);
			frm2.setSize(300,300);
			frm2.setResizable(false);
			//frm2.setLocationRelativeTo(null);
			JLabel lab2 = new JLabel("账号：");
			lab2.setBounds(20,80,40,20);
			frm2.add(lab2);
			
			jtf1.setBounds(60,80,140,20);
			frm2.add(jtf1);
			JLabel lab3= new JLabel("密码：");
			lab3.setBounds(20,120,40,20);
			frm2.add(lab3);

			jpf.setBounds(60,120,140,20);
			frm2.add(jpf);
			JPanel pan2=new JPanel();
			pan2.setBounds(100,180,40,40);
			pan2.add(btn3);
			frm2.add(pan2);
			frm2.setVisible(true);
			}
		});
		btn2.addActionListener(new ActionListener(){
			//单击按钮执行的方法
			public void actionPerformed(ActionEvent e) {
			closeThis();
			JFrame frm2 = new JFrame("管理员登陆");
			 frm2.setLayout(null);
			frm2.setSize(300,300);
			frm2.setResizable(false);
			//frm2.setLocationRelativeTo(null);
			JLabel lab2 = new JLabel("账号：");
			lab2.setBounds(20,80,40,20);
			frm2.add(lab2);
			JTextField jtf1 = new JTextField();
			jtf1.setBounds(60,80,140,20);
			frm2.add(jtf1);
			JLabel lab3= new JLabel("密码：");
			lab3.setBounds(20,120,40,20);
			frm2.add(lab3);
			JPasswordField jpf = new JPasswordField();
			jpf.setBounds(60,120,140,20);
			frm2.add(jpf);
			JPanel pan2=new JPanel();
			pan2.setBounds(100,180,40,40);
			pan2.add(btn4);
			frm2.add(pan2);
			frm2.setVisible(true);
			}
		});

		
			
			btn3.addActionListener(new ActionListener() {		
				public void actionPerformed(ActionEvent paramActionEvent) {
					// TODO Auto-generated method stub
					String username = jtf1.getText();
					String passwd = new String(jpf.getPassword());
					UserDao userDao = new UserDao();						
					try {		   
						    List<User> userList = userDao.query();
					        for (User user : userList) {	
					        	if (user.getUser().equals(username) && user.getPasswd().equals(passwd)) {
					        		closeThis();
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
	new BBB();	
	new AAA();
}

		
	
public static  void closeThis()
{
	frm.dispose();
}
	
}
