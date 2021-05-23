import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreatePopup extends JPanel {
	private JFrame frame;
	private JTextField A1textField;
	private JTextField A2textField;
	private JTextField A3textField;
	private JTextField A4textField;
	private JTextField A5textField;
	private JTextField A6textField;
	private JTextField A7textField;
	private JTextField A8textField;
	private JTextField A9textField;
	private JTextField A10textField;
	private JTextField A11textField;
	private JTextField A12textField;
	private JTextField A13textField;
	private JTextField A14textField;
	private JTextField A15textField;
	private String a1Val = null;
	private String a2Val;
	private String a3Val;
	private String a4Val = null;
	private String a5Val = null;
	private String a6Val = null;
	private String a7Val = null;
	private String a8Val;
	private String a9Val = null;
	private String a10Val = null;
	private String a11Val;
	private String a12Val = null;
	private String a13Val = null;
	private String a14Val;
	private String a15Val;

	/**
	 * Create the panel.
	 */
	public CreatePopup() {

		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 319, 565);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setLayout(null);

		JLabel A2 = new JLabel("A2");
		A2.setBounds(10, 46, 46, 14);
		frame.add(A2);

		JLabel A3 = new JLabel("A3");
		A3.setBounds(10, 74, 46, 14);
		frame.add(A3);

		JLabel A1 = new JLabel("A1");
		A1.setBounds(10, 21, 46, 14);
		frame.add(A1);

		JLabel A4 = new JLabel("A4");
		A4.setBounds(10, 99, 46, 14);
		frame.add(A4);

		JLabel A5 = new JLabel("A5");
		A5.setBounds(10, 124, 46, 14);
		frame.add(A5);

		JLabel A6 = new JLabel("A6");
		A6.setBounds(10, 148, 46, 14);
		frame.add(A6);

		JLabel A7 = new JLabel("A7");
		A7.setBounds(10, 173, 46, 14);
		frame.add(A7);

		JLabel A8 = new JLabel("A8");
		A8.setBounds(10, 198, 46, 14);
		frame.add(A8);

		JLabel A9 = new JLabel("A9");
		A9.setBounds(10, 223, 46, 14);
		frame.add(A9);

		JLabel A10 = new JLabel("A10");
		A10.setBounds(10, 248, 46, 14);
		frame.add(A10);

		JLabel A11 = new JLabel("A11");
		A11.setBounds(10, 273, 46, 14);
		frame.add(A11);

		JLabel A12 = new JLabel("A12");
		A12.setBounds(10, 298, 46, 14);
		frame.add(A12);

		JLabel A13 = new JLabel("A13");
		A13.setBounds(10, 321, 46, 14);
		frame.add(A13);

		JLabel A14 = new JLabel("A14");
		A14.setBounds(10, 346, 46, 14);
		frame.add(A14);

		JLabel A15 = new JLabel("A15");
		A15.setBounds(10, 371, 46, 14);
		frame.add(A15);

		A1textField = new JTextField();
		A1textField.setBounds(33, 18, 170, 20);
		frame.add(A1textField);
		A1textField.setColumns(10);

		A2textField = new JTextField();
		A2textField.setBounds(33, 43, 170, 20);
		frame.add(A2textField);
		A2textField.setColumns(10);

		A3textField = new JTextField();
		A3textField.setBounds(33, 71, 170, 20);
		frame.add(A3textField);
		A3textField.setColumns(10);

		A4textField = new JTextField();
		A4textField.setBounds(33, 99, 169, 20);
		frame.add(A4textField);
		A4textField.setColumns(10);

		A5textField = new JTextField();
		A5textField.setBounds(33, 124, 169, 20);
		frame.add(A5textField);
		A5textField.setColumns(10);

		A6textField = new JTextField();
		A6textField.setBounds(33, 149, 170, 20);
		frame.add(A6textField);
		A6textField.setColumns(10);

		A7textField = new JTextField();
		A7textField.setBounds(33, 173, 170, 20);
		frame.add(A7textField);
		A7textField.setColumns(10);

		A8textField = new JTextField();
		A8textField.setBounds(33, 198, 170, 20);
		frame.add(A8textField);
		A8textField.setColumns(10);

		A9textField = new JTextField();
		A9textField.setBounds(33, 223, 170, 20);
		frame.add(A9textField);
		A9textField.setColumns(10);

		A10textField = new JTextField();
		A10textField.setBounds(33, 248, 170, 20);
		frame.add(A10textField);
		A10textField.setColumns(10);

		A11textField = new JTextField();
		A11textField.setBounds(33, 273, 170, 20);
		frame.add(A11textField);
		A11textField.setColumns(10);

		A12textField = new JTextField();
		A12textField.setBounds(33, 295, 170, 20);
		frame.add(A12textField);
		A12textField.setColumns(10);

		A13textField = new JTextField();
		A13textField.setBounds(33, 323, 170, 20);
		frame.add(A13textField);
		A13textField.setColumns(10);

		A14textField = new JTextField();
		A14textField.setBounds(33, 346, 169, 20);
		frame.add(A14textField);
		A14textField.setColumns(10);

		A15textField = new JTextField();
		A15textField.setBounds(33, 368, 170, 20);
		frame.add(A15textField);
		A15textField.setColumns(10);

		JButton Submit = new JButton("Submit");
		Submit.setBounds(57, 401, 89, 23);
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent s) {
				if (s.getSource() == Submit) {
					a1Val = A1textField.getText();
					a2Val = A2textField.getText();
					a3Val = A3textField.getText();
					a4Val = A4textField.getText();
					a5Val = A5textField.getText();
					a6Val = A6textField.getText();
					a7Val = A7textField.getText();
					a8Val = A8textField.getText();
					a9Val = A9textField.getText();
					a10Val = A10textField.getText();
					a11Val = A11textField.getText();
					a12Val = A12textField.getText();
					a13Val = A13textField.getText();
					a14Val = A14textField.getText();
					a15Val = A15textField.getText();
					try {
						kaloWriteFile.main(a1Val, a2Val, a3Val, a4Val, a5Val, a6Val, a7Val, a8Val, a9Val, a10Val,
								a11Val, a12Val, a13Val, a14Val, a15Val);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}

			}
		});
		this.frame.add(Submit);
	}

	public static void bob(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreatePopup window = new CreatePopup();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
