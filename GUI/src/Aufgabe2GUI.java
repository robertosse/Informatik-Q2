import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class Aufgabe2GUI extends JFrame {
	

	/**
	 * 
	 */
	private JPanel contentPane= new JPanel();
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Aufgabe2GUI aufgabe2 = new Aufgabe2GUI();
		aufgabe2.setVisible(true);
	}
	public Aufgabe2GUI(){
		setBounds(100,100,200,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane.setLayout( new BorderLayout());
		JButton btnMeinButton = new JButton();
		JProgressBar pgbMeinProgressbar = new JProgressBar();
		JTextField tfdMeinTextField = new JTextField();
		contentPane.add(tfdMeinTextField, BorderLayout.CENTER);
		contentPane.add(btnMeinButton, BorderLayout.NORTH);
		contentPane.add(pgbMeinProgressbar, BorderLayout.SOUTH);
		setContentPane(contentPane);
		
	}
	
}
