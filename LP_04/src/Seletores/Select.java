package Seletores;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Select extends JFrame {

	private JPanel contentPane;
	private JTextField textID;
	private JTextField textCLASSE;
	private JTextField textTAG;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Select frame = new Select();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Select() {
		setForeground(Color.WHITE);
		setFont(new Font("Eras Demi ITC", Font.ITALIC, 13));
		setTitle("CALCULADORA DE CSS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		textID = new JTextField();
		textID.setColumns(10);
		
		textCLASSE = new JTextField();
		textCLASSE.setColumns(10);
		
		textTAG = new JTextField();
		textTAG.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Qtd. Seletores ID");
		
		JLabel lblNewLabel_1 = new JLabel("Qtd. Seletores Classes");
		
		JLabel lblNewLabel_2 = new JLabel("Qtd. Seletores Tags");
		
		JButton CALCULAR = new JButton("CALCULAR");
		CALCULAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ID = Integer.parseInt(textID.getText());
				
				int CLASSE = Integer.parseInt(textCLASSE.getText());
				int TAG = Integer.parseInt(textTAG.getText());
				int Total = 0;
				
				Total = ID*100+CLASSE*10+TAG*1;
				JOptionPane.showMessageDialog(null, "A quantidade total de pontos é: "+Total+ " \n IDs: "+ID+ " \n Classes: "+CLASSE+ " \n TAGs: "+TAG, null,JOptionPane.INFORMATION_MESSAGE);
			}
		});
		CALCULAR.setForeground(Color.WHITE);
		CALCULAR.setBackground(Color.BLUE);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(35)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2))
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(textTAG, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
						.addComponent(textCLASSE)
						.addComponent(textID, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(64, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(129)
					.addComponent(CALCULAR, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(118, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textCLASSE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(textTAG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(45)
					.addComponent(CALCULAR)
					.addContainerGap(37, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
