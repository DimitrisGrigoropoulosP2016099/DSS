import javax.swing.JFileChooser;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Button;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;


public class Gialo {
	String pathToFile;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gialo window = new Gialo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gialo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 531, 549);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		Button create_file_button = new Button("Load File ");
		create_file_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				try {
					fileChooser.setCurrentDirectory(new java.io.File("."));
					fileChooser.setDialogTitle("File Chooser");
					fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
					if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
						System.out.println("getCurrentDirectory(): " + fileChooser.getCurrentDirectory());
						System.out.println("getSelectedFile(): " + fileChooser.getSelectedFile());
						File testFile = fileChooser.getSelectedFile();
						System.out.println("________________________");
						LoadData.loader(testFile.getAbsolutePath());
					} else {
						System.out.println("No selection");
					}

					
				} catch (Exception e2Exception) {
					e2Exception.printStackTrace();
				}
				

			}
		});
		create_file_button.setBounds(55, 393, 133, 50);
		frame.getContentPane().add(create_file_button);

		Button Load_File_button = new Button("Create File");
		create_file_button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
			}
			
		});
		Load_File_button.setBounds(327, 393, 133, 50);
		frame.getContentPane().add(Load_File_button);

		JLabel Create_file_explain = new JLabel("Load your File ");
		Create_file_explain.setVerticalAlignment(SwingConstants.BOTTOM);
		Create_file_explain.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		Create_file_explain.setBounds(28, 322, 226, 50);
		frame.getContentPane().add(Create_file_explain);

		JLabel Load_file_explain = new JLabel("Create your File");
		Load_file_explain.setVerticalAlignment(SwingConstants.BOTTOM);
		Load_file_explain.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		Load_file_explain.setBounds(300, 271, 171, 101);
		frame.getContentPane().add(Load_file_explain);
	}
}
