package pr2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class D extends B {
	public D() {
               		frm2.setSize(300, 300);
               		pan2.add(btn5);
            		//pan2.add(btn6);	
            		pan2.add(btn7);
            		//pan2.add(btn8);
            		frm2.setLayout(null);
            		pan2.setLayout(new GridLayout(4,1));
            		frm2.setResizable(false);
               		frm2.setLayout(null);
               		pan2.setBounds(50,90,160,80);
               		frm2.add(pan2);
               		frm2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            		frm2.setVisible(true);
}
}