package pr2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Label;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JButton;

public class AAA extends B {




	/**
	 * Launch the application.
	 */
	public AAA() {
		 btn7.addActionListener(new ActionListener(){
				//单击按钮执行的方法
				public void actionPerformed(ActionEvent e) {
		frame1 = new JFrame("图书查询");
		frame1.setBounds(100, 100, 627, 504);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		
		table1 = new JTable();
		table1.setBounds(37, 36, 83, 18);
		frame1.getContentPane().add(table1);
		
		table_2 = new JTable();
		table_2.setBounds(119, 36, 83, 18);
		frame1.getContentPane().add(table_2);
		
		table_1 = new JTable();
		table_1.setBounds(201, 36, 83, 18);
		frame1.getContentPane().add(table_1);
		
		table_3 = new JTable();
		table_3.setBounds(283, 36, 83, 18);
		frame1.getContentPane().add(table_3);
		
		table_4 = new JTable();
		table_4.setBounds(364, 36, 83, 18);
		frame1.getContentPane().add(table_4);
		
		table_5 = new JTable();
		table_5.setBounds(445, 36, 83, 18);
		frame1.getContentPane().add(table_5);
		
		scrollBar = new JScrollBar();
		scrollBar.setBounds(527, 36, 22, 282);
		frame1.getContentPane().add(scrollBar);
		
		textField1 = new JTextField("ID");
		textField1.setBounds(37, 18, 83, 18);
		frame1.getContentPane().add(textField1);
		textField1.setColumns(10);
		textField1.setEditable(false);
		
		textField_11 = new JTextField("图书名称");
		textField_11.setBounds(119, 18, 83, 18);
		frame1.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		textField_11.setEditable(false);
		
		textField_21 = new JTextField("图书作者");
		textField_21.setBounds(201, 18, 83, 18);
		frame1.getContentPane().add(textField_21);
		textField_21.setColumns(10);
		textField_21.setEditable(false);
		
		textField_31 = new JTextField("图书价格");
		textField_31.setBounds(283, 18, 83, 18);
		frame1.getContentPane().add(textField_31);
		textField_31.setColumns(10);
		textField_31.setEditable(false);
		
		textField_41 = new JTextField("出版社");
		textField_41.setBounds(364, 18, 83, 18);
		frame1.getContentPane().add(textField_41);
		textField_41.setColumns(10);
		textField_41.setEditable(false);
		
		textField_51 = new JTextField("分类号");
		textField_51.setBounds(445, 18, 83, 18);
		frame1.getContentPane().add(textField_51);
		textField_51.setColumns(10);
		textField_51.setEditable(false);
		
		textField_61 = new JTextField("");
		textField_61.setColumns(10);
		textField_61.setBounds(119, 350, 83, 18);
		frame1.getContentPane().add(textField_61);
		
		textField_71 = new JTextField("");
		textField_71.setColumns(10);
		textField_71.setBounds(283, 349, 83, 18);
		frame1.getContentPane().add(textField_71);
		
		textField_81 = new JTextField("");
		textField_81.setColumns(10);
		textField_81.setBounds(445, 349, 83, 18);
		frame1.getContentPane().add(textField_81);
		
		textField_91 = new JTextField("");
		textField_91.setColumns(10);
		textField_91.setBounds(119, 396, 83, 18);
		frame1.getContentPane().add(textField_91);
		
		textField_101 = new JTextField("");
		textField_101.setColumns(10);
		textField_101.setBounds(283, 395, 83, 18);
		frame1.getContentPane().add(textField_101);
		
		textField_111 = new JTextField("");
		textField_111.setColumns(10);
		textField_111.setBounds(445, 395, 83, 18);
		frame1.getContentPane().add(textField_111);
		
		lblId = new JLabel("ID：");
		lblId.setBounds(61, 352, 58, 15);
		frame1.getContentPane().add(lblId);
		
		label1 = new JLabel("图书名称：");
		label1.setBounds(212, 350, 72, 15);
		frame1.getContentPane().add(label1);
		
		label_11 = new JLabel("图书作者：");
		label_11.setBounds(376, 352, 69, 15);
		frame1.getContentPane().add(label_11);
		
		label_21 = new JLabel("图书价格：");
		label_21.setBounds(47, 398, 72, 15);
		frame1.getContentPane().add(label_21);
		
		label_31 = new JLabel("出版社：");
		label_31.setBounds(226, 398, 58, 15);
		frame1.getContentPane().add(label_31);
		
		label_41 = new JLabel("分类号：");
		label_41.setBounds(389, 398, 58, 15);
		frame1.getContentPane().add(label_41);
		
		JButton button = new JButton("\u67E5\u8BE2");
		button.setBounds(226, 423, 97, 23);
		frame1.getContentPane().add(button);
		frame1.setVisible(true);
				}
			});
	}

}