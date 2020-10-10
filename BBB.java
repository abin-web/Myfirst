package pr2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class BBB extends B {

	public BBB() {
		 btn5.addActionListener(new ActionListener(){
				//单击按钮执行的方法
				public void actionPerformed(ActionEvent e) {
		frame = new JFrame("个人信息");
		frame.setBounds(100, 100,415, 318);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel label = new JLabel("\u5B66\u53F7\uFF1A");
		label.setBounds(86, 40, 40, 27);
		frame.add(label);
		
		JLabel lblNewLabel = new JLabel("账号：");
		lblNewLabel.setBounds(86, 80, 40, 27);
		frame.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("密码：");
		lblNewLabel_1.setBounds(86, 120, 40, 27);
		frame.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("学院：");
		lblNewLabel_2.setBounds(86, 160, 40, 27);
		frame.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("专业班级：");
		lblNewLabel_3.setBounds(60, 200, 66, 27);
		frame.add(lblNewLabel_3);
		
		textField = new JTextField("111");
		textField.setBounds(132, 43, 88, 21);
		frame.add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		
		textField_1 = new JTextField("root");
		textField_1.setColumns(10);
		textField_1.setBounds(132, 83, 88, 21);
		frame.add(textField_1);
		textField_1.setEditable(false);
		
		textField_2 = new JTextField("");
		textField_2.setColumns(10);
		textField_2.setBounds(132, 123, 88, 21);
		frame.add(textField_2);
		textField_2.setEditable(false);
		
		textField_3 = new JTextField("应用数学");
		textField_3.setColumns(10);
		textField_3.setBounds(132, 163, 88, 21);
		frame.add(textField_3);
		textField_3.setEditable(false);
		
		textField_4 = new JTextField("17数学1");
		textField_4.setColumns(10);
		textField_4.setBounds(132, 203, 88, 21);
		frame.add(textField_4);
		textField_4.setEditable(false);
		
		lblNewLabel_4 = new JLabel("姓名：");
		lblNewLabel_4.setBounds(86, 240, 40, 27);
		frame.add(lblNewLabel_4);
		
		textField_5 = new JTextField("张三");
		textField_5.setBounds(132, 243, 88, 21);
		frame.add(textField_5);
		textField_5.setColumns(10);
		textField_5.setEditable(false);
		frame.setVisible(true);
				}
			});
		
	}
		 }
