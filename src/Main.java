import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.util.Vector;

import javax.swing.JFrame;

import javax.swing.text.MaskFormatter;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;

import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JTextArea;


public class Main {

	private JFrame frmNumbersToWords;
	private JTextField txtName;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JFormattedTextField textField_2;
	private JFormattedTextField textField_3;
	private JPanel panel_1;
	private JPanel panel_2;
	private GroupLayout gl_panel;
	private JPanel panel_2_2;
	private JTextPane textPane;
	private JLabel lblTheStudentIs;
	private GroupLayout gl_panel_2_2;
	private JPanel panel_2_1;
	private JLabel lblNewLabel;
	private JLabel lblHighestAchievement;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnUndergraduate;
	private JRadioButton rdbtnGraduate;
	private JLabel lblSeniorHighSchool;
	private JSeparator separator;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxGraduateFromRtu;
	private JCheckBox chckbxGraduatedFromClass;
	private JCheckBox chckbxGraduateFromRtu_1_1;
	private JSeparator separator_1;
	private JLabel lblUndergraduate;
	private JLabel lblUndergraduate_1;
	private JSeparator separator_1_1;
	private JLabel lblGraduate;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	private JCheckBox chckbxNewCheckBox_1_1;
	private JLabel lblUndergraduate_1_1;
	private GroupLayout gl_panel_2_1;
	private GroupLayout gl_panel_2;
	private DefaultListModel editableList;
	private JList list;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private GroupLayout gl_panel_1;
	private JTextArea txtrDescription;
	private JTextArea txtrScholar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmNumbersToWords.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNumbersToWords = new JFrame();
		frmNumbersToWords.setFont(new Font("Dialog", Font.PLAIN, 30));
		frmNumbersToWords.setLocation(new Point(960, 540));
		frmNumbersToWords.setTitle("RTU Scholars");
		frmNumbersToWords.setBounds(0, 0, 1680, 1050);
		frmNumbersToWords.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNumbersToWords.setLocationRelativeTo(null);
		frmNumbersToWords.getContentPane().setLayout(new BorderLayout(0, 0));
		frmNumbersToWords.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		final Background panel = new Background();
		frmNumbersToWords.getContentPane().add(panel);
		
		Font font = new Font("Arial", Font.PLAIN, 17);
		
		panel_1 = new JPanel() {
			protected void paintComponent(Graphics g) {
		    	super.paintComponent(g);
		        final Graphics2D g2 = (Graphics2D) g.create();
		        Color color1 = new Color(3, 194, 146, 50).brighter();
		        g2.setPaint(color1);
		        g2.fillRect(0, 0, getWidth(), getHeight());
		        g2.dispose();
		    }
		};
		panel_1.setPreferredSize(new Dimension(0, 0));
		panel_1.setOpaque(false);
		
		panel_2 = new JPanel() {
			protected void paintComponent(Graphics g) {
		    	super.paintComponent(g);
		        final Graphics2D g2 = (Graphics2D) g.create();
		        Color color1 = new Color(3, 194, 146, 50).brighter();
		        g2.setPaint(color1);
		        g2.fillRect(0, 0, getWidth(), getHeight());
		        g2.dispose();
		    }
		};
		panel_2.setOpaque(false);
		
		gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 1076, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		panel_2_2 = new JPanel() {
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
		        final Graphics2D g2 = (Graphics2D) g.create();
		        Color color1 = new Color(3, 194, 146, 50).brighter();
		        g2.setPaint(color1);
		        g2.fillRect(0, 0, getWidth(), getHeight());
		        g2.dispose();
			}
		};
		panel_2_2.setOpaque(false);
		
		textPane = new JTextPane();
		textPane.setOpaque(false);
		
		lblTheStudentIs = new JLabel("The student is qualified for:");
		lblTheStudentIs.setForeground(Color.WHITE);
		lblTheStudentIs.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		txtrDescription = new JTextArea();
		txtrDescription.setEditable(false);
		txtrDescription.setLineWrap(true);
		txtrDescription.setForeground(Color.WHITE);
		txtrDescription.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtrDescription.setText("Description");
		txtrDescription.setOpaque(false);
		
		txtrScholar = new JTextArea();
		txtrScholar.setEditable(false);
		txtrScholar.setText("None");
		txtrScholar.setOpaque(false);
		txtrScholar.setLineWrap(true);
		txtrScholar.setForeground(Color.WHITE);
		txtrScholar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		gl_panel_2_2 = new GroupLayout(panel_2_2);
		gl_panel_2_2.setHorizontalGroup(
			gl_panel_2_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTheStudentIs, GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_2_2.createSequentialGroup()
							.addGap(88)
							.addGroup(gl_panel_2_2.createParallelGroup(Alignment.TRAILING)
								.addComponent(txtrScholar, GroupLayout.PREFERRED_SIZE, 1036, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtrDescription, GroupLayout.PREFERRED_SIZE, 1036, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textPane, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panel_2_2.setVerticalGroup(
			gl_panel_2_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTheStudentIs, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_2_2.createParallelGroup(Alignment.LEADING)
						.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_2_2.createSequentialGroup()
							.addComponent(txtrScholar, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtrDescription, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		panel_2_2.setLayout(gl_panel_2_2);
		
		panel_2_1 = new JPanel() {
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
		        final Graphics2D g2 = (Graphics2D) g.create();
		        Color color1 = new Color(3, 194, 146, 50).brighter();
		        g2.setPaint(color1);
		        g2.fillRect(0, 0, getWidth(), getHeight());
		        g2.dispose();
			}
		};
		panel_2_1.setOpaque(false);
		
		lblNewLabel = new JLabel("Full Name:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		
		txtName = new JTextField();
		txtName.setFont(new Font("Dialog", Font.PLAIN, 23));
		txtName.setRequestFocusEnabled(true);
		txtName.setOpaque(true);
		txtName.setColumns(10);

		txtName.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				detailsToStudent((Student) list.getSelectedValue());
				evaluateStudent((Student) list.getSelectedValue());
			}
			public void keyReleased(KeyEvent e) {
				detailsToStudent((Student) list.getSelectedValue());
				evaluateStudent((Student) list.getSelectedValue());
			}
			
		});
		
		lblHighestAchievement = new JLabel("Highest Academic Achievement:");
		lblHighestAchievement.setHorizontalAlignment(SwingConstants.TRAILING);
		lblHighestAchievement.setForeground(Color.WHITE);
		lblHighestAchievement.setFont(new Font("Tahoma", Font.PLAIN, 23));
		
		rdbtnNewRadioButton = new JRadioButton("Senior High School");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enableFreshman();
				
				textField_2.setText("1.00");
				
				chckbxNewCheckBox_1.setSelected(false);
				chckbxNewCheckBox_1_1.setSelected(false);
				chckbxNewCheckBox_2.setSelected(false);
				textField_3.setText("1.00");
				
				detailsToStudent((Student) list.getSelectedValue());
				evaluateStudent((Student) list.getSelectedValue());
			}
		});
		
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setForeground(Color.WHITE);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		rdbtnNewRadioButton.setOpaque(false);
		
		rdbtnUndergraduate = new JRadioButton("Undergraduate");
		rdbtnUndergraduate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enableUndergrad();
				
				chckbxNewCheckBox.setSelected(false);
				chckbxGraduateFromRtu.setSelected(false);
				chckbxGraduatedFromClass.setSelected(false);
				chckbxGraduateFromRtu_1_1.setSelected(false);
				
				chckbxNewCheckBox_1.setSelected(false);
				chckbxNewCheckBox_1_1.setSelected(false);
				chckbxNewCheckBox_2.setSelected(false);
				textField_3.setText("1.00");
				
				detailsToStudent((Student) list.getSelectedValue());
				evaluateStudent((Student) list.getSelectedValue());
			}
		});
		buttonGroup.add(rdbtnUndergraduate);
		rdbtnUndergraduate.setOpaque(false);
		rdbtnUndergraduate.setForeground(Color.WHITE);
		rdbtnUndergraduate.setFont(new Font("Tahoma", Font.PLAIN, 23));
		
		rdbtnGraduate = new JRadioButton("Graduate");
		rdbtnGraduate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enableGrad();
				
				textField_2.setText("1.00");
				
				chckbxNewCheckBox.setSelected(false);
				chckbxGraduateFromRtu.setSelected(false);
				chckbxGraduatedFromClass.setSelected(false);
				chckbxGraduateFromRtu_1_1.setSelected(false);
				
				detailsToStudent((Student) list.getSelectedValue());
				evaluateStudent((Student) list.getSelectedValue());
			}
		});
		buttonGroup.add(rdbtnGraduate);
		rdbtnGraduate.setOpaque(false);
		rdbtnGraduate.setForeground(Color.WHITE);
		rdbtnGraduate.setFont(new Font("Tahoma", Font.PLAIN, 23));
		
		lblSeniorHighSchool = new JLabel("Senior High School");
		lblSeniorHighSchool.setForeground(Color.WHITE);
		lblSeniorHighSchool.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		separator = new JSeparator();
		
		chckbxNewCheckBox = new JCheckBox("Valedictorian / Salutatorian");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				detailsToStudent((Student) list.getSelectedValue());
				evaluateStudent((Student) list.getSelectedValue());
			}
		});
		chckbxNewCheckBox.setEnabled(false);
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxNewCheckBox.setForeground(Color.WHITE);
		chckbxNewCheckBox.setOpaque(false);
		
		chckbxGraduateFromRtu = new JCheckBox("Graduate from RTU LHS");
		chckbxGraduateFromRtu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				toggleFreshmanOptions();
				detailsToStudent((Student) list.getSelectedValue());
				evaluateStudent((Student) list.getSelectedValue());
			}
		});
		chckbxGraduateFromRtu.setEnabled(false);
		chckbxGraduateFromRtu.setOpaque(false);
		chckbxGraduateFromRtu.setForeground(Color.WHITE);
		chckbxGraduateFromRtu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		chckbxGraduatedFromClass = new JCheckBox("Graduated from class of 100 graduates");
		chckbxGraduatedFromClass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				detailsToStudent((Student) list.getSelectedValue());
				evaluateStudent((Student) list.getSelectedValue());
			}
		});
		chckbxGraduatedFromClass.setEnabled(false);
		chckbxGraduatedFromClass.setOpaque(false);
		chckbxGraduatedFromClass.setForeground(Color.WHITE);
		chckbxGraduatedFromClass.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		chckbxGraduateFromRtu_1_1 = new JCheckBox("Certified by the Head of previous school");
		chckbxGraduateFromRtu_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				detailsToStudent((Student) list.getSelectedValue());
				evaluateStudent((Student) list.getSelectedValue());
			}
			
		});
		chckbxGraduateFromRtu_1_1.setEnabled(false);
		chckbxGraduateFromRtu_1_1.setOpaque(false);
		chckbxGraduateFromRtu_1_1.setForeground(Color.WHITE);
		chckbxGraduateFromRtu_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		separator_1 = new JSeparator();
		
		lblUndergraduate = new JLabel("Undergraduate");
		lblUndergraduate.setForeground(Color.WHITE);
		lblUndergraduate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblUndergraduate_1 = new JLabel("GWA from previous semester:");
		lblUndergraduate_1.setEnabled(false);
		lblUndergraduate_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblUndergraduate_1.setForeground(Color.WHITE);
		lblUndergraduate_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		separator_1_1 = new JSeparator();
		
		lblGraduate = new JLabel("Graduate");
		lblGraduate.setForeground(Color.WHITE);
		lblGraduate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		chckbxNewCheckBox_1 = new JCheckBox("Graduate from RTU");
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				detailsToStudent((Student) list.getSelectedValue());
				evaluateStudent((Student) list.getSelectedValue());
			}
		});
		chckbxNewCheckBox_1.setEnabled(false);
		chckbxNewCheckBox_1.setOpaque(false);
		chckbxNewCheckBox_1.setForeground(Color.WHITE);
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		chckbxNewCheckBox_2 = new JCheckBox("With Honors");
		chckbxNewCheckBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				detailsToStudent((Student) list.getSelectedValue());
				evaluateStudent((Student) list.getSelectedValue());
			}
		});
		chckbxNewCheckBox_2.setEnabled(false);
		chckbxNewCheckBox_2.setOpaque(false);
		chckbxNewCheckBox_2.setForeground(Color.WHITE);
		chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		chckbxNewCheckBox_1_1 = new JCheckBox("Meets the units and subjects grade requirements, doesn't have INC or Dropped,\r\n");
		chckbxNewCheckBox_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				detailsToStudent((Student) list.getSelectedValue());
				evaluateStudent((Student) list.getSelectedValue());
			}
		});
		chckbxNewCheckBox_1_1.setEnabled(false);
		chckbxNewCheckBox_1_1.setOpaque(false);
		chckbxNewCheckBox_1_1.setForeground(Color.WHITE);
		chckbxNewCheckBox_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblUndergraduate_1_1 = new JLabel("Average Grade:");
		lblUndergraduate_1_1.setEnabled(false);
		lblUndergraduate_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblUndergraduate_1_1.setForeground(Color.WHITE);
		lblUndergraduate_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		MaskFormatter gwaFormat1 = null;
        try {
        	gwaFormat1 = new MaskFormatter("#.##");
        	gwaFormat1.setPlaceholderCharacter('0');
        } catch (ParseException e) {
            e.printStackTrace();
        }
		
		textField_3 = new JFormattedTextField(gwaFormat1);
		textField_3.setEnabled(false);
		textField_3.setText("1.00");
		textField_3.setColumns(10);
		
		textField_3.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
			        e.consume();
			    } 
				if (Double.parseDouble(textField_3.getText()) > 5.00) {
					textField_3.setText(new String("5.00"));
					
				} 
				if (Double.parseDouble(textField_3.getText()) < 1.00) {
					textField_3.setText(new String("1.00"));
					
				}
				
			}
			@Override
			public void keyReleased(KeyEvent e) {
				detailsToStudent((Student) list.getSelectedValue());
				evaluateStudent((Student) list.getSelectedValue());
			}
		});
		
		MaskFormatter gwaFormat2 = null;
        try {
        	gwaFormat2 = new MaskFormatter("#.##");
        	gwaFormat2.setPlaceholderCharacter('0');
        } catch (ParseException e) {
            e.printStackTrace();
        }
		
		textField_2 = new JFormattedTextField(gwaFormat2);
		textField_2.setEnabled(false);
		textField_2.setText("1.00");
		textField_2.setColumns(10);
		
		textField_2.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
			        e.consume();
			    } 
				if (Double.parseDouble(textField_3.getText()) > 5.00) {
					textField_3.setText(new String("5.00"));
					
				} 
				if (Double.parseDouble(textField_3.getText()) < 1.00) {
					textField_3.setText(new String("1.00"));
					
				}
				detailsToStudent((Student) list.getSelectedValue());
				evaluateStudent((Student) list.getSelectedValue());
			}
			
			public void keyReleased(KeyEvent e) {
				detailsToStudent((Student) list.getSelectedValue());
				evaluateStudent((Student) list.getSelectedValue());
			}
		});
		
		gl_panel_2_1 = new GroupLayout(panel_2_1);
		gl_panel_2_1.setHorizontalGroup(
			gl_panel_2_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblSeniorHighSchool, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(chckbxNewCheckBox, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(chckbxGraduateFromRtu, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2_1.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxGraduateFromRtu_1_1, GroupLayout.PREFERRED_SIZE, 365, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbxGraduatedFromClass, GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE))
					.addContainerGap())
				.addGroup(gl_panel_2_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblUndergraduate, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(lblUndergraduate_1, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(621, Short.MAX_VALUE))
				.addGroup(gl_panel_2_1.createSequentialGroup()
					.addGroup(gl_panel_2_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(separator_1_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1184, Short.MAX_VALUE)
						.addComponent(separator_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1184, Short.MAX_VALUE)
						.addComponent(separator, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1184, Short.MAX_VALUE)
						.addGroup(gl_panel_2_1.createSequentialGroup()
							.addGap(35)
							.addGroup(gl_panel_2_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_2_1.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(txtName, GroupLayout.PREFERRED_SIZE, 983, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_2_1.createSequentialGroup()
									.addGap(17)
									.addComponent(lblHighestAchievement)
									.addGap(36)
									.addComponent(rdbtnNewRadioButton, GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
									.addGap(17)
									.addComponent(rdbtnUndergraduate, GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(rdbtnGraduate, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(0))
				.addGroup(gl_panel_2_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblGraduate, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel_2_1.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxNewCheckBox_1_1, GroupLayout.PREFERRED_SIZE, 622, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_2_1.createSequentialGroup()
							.addComponent(chckbxNewCheckBox_1, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE)
							.addGap(267)
							.addComponent(lblUndergraduate_1_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
						.addComponent(chckbxNewCheckBox_2, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE))
					.addGap(278))
		);
		gl_panel_2_1.setVerticalGroup(
			gl_panel_2_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(19)
					.addGroup(gl_panel_2_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHighestAchievement, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnNewRadioButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnGraduate, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnUndergraduate, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSeniorHighSchool, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbxNewCheckBox, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbxGraduateFromRtu, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbxGraduatedFromClass, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxGraduateFromRtu_1_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_2_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblUndergraduate, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
						.addGroup(gl_panel_2_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblUndergraduate_1, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addComponent(separator_1_1, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_2_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblGraduate, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_2_1.createSequentialGroup()
							.addGroup(gl_panel_2_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(chckbxNewCheckBox_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblUndergraduate_1_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(chckbxNewCheckBox_2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(chckbxNewCheckBox_1_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
					.addGap(238))
		);
		panel_2_1.setLayout(gl_panel_2_1);
		gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_2_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1072, Short.MAX_VALUE)
						.addComponent(panel_2_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1056, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_2_1, GroupLayout.PREFERRED_SIZE, 667, GroupLayout.PREFERRED_SIZE)
					.addGap(18, 18, Short.MAX_VALUE)
					.addComponent(panel_2_2, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_2.setLayout(gl_panel_2);
		
		editableList = new DefaultListModel();

		editableList.addElement(new Student("Moscosa, Arjhi P."));
		editableList.addElement(new Student("Socias, Melvic C."));

		list = new JList(editableList)  {
			protected void paintComponent(Graphics g) {
		    	super.paintComponent(g);
		        final Graphics2D g2 = (Graphics2D) g.create();
		        Color color1 = new Color(3, 194, 146, 50).brighter();
		        g2.setPaint(color1);
		        g2.fillRect(0, 0, getWidth(), getHeight());
		        g2.dispose();
		    }
		};
		
		list.setCellRenderer(new DefaultListCellRenderer() {
		    public Component getListCellRendererComponent(JList<?> list,
                    Object value,
                    int index,
                    boolean isSelected,
                    boolean cellHasFocus) {
				super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
				if (value instanceof Student) {
					Student ingredient = (Student)value;
					setText(ingredient.name);
				}
				return this;
			}
		});
		
		list.setSelectionModel(new DefaultListSelectionModel() {
		    private int maxCount = 1;
		    @Override
		    public void setSelectionInterval(int index0, int index1) {
		        if (index1 - index0 >= maxCount) {
		            index1 = index0 + maxCount - 1;
		        }
		        super.setSelectionInterval(index0, index1);
		    }
		    @Override
		    public void addSelectionInterval(int index0, int index1) {
		        int selectionLength = list.getSelectedIndices().length;
		        if (selectionLength >= maxCount) return;
		        if (index1 - index0 >= maxCount - selectionLength) index1 = index0 + maxCount - 1 - selectionLength;
		        if (index1 < index0) return;
		        super.addSelectionInterval(index0, index1);
		    }
		});
		
		list.setSelectedIndex(0);
		studentToDetails((Student) list.getSelectedValue());
		
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent listSelectionEvent) {
				
				if (!listSelectionEvent.getValueIsAdjusting()) {
					clearSelect();
					
					rdbtnUndergraduate.setSelected(((Student) list.getSelectedValue()).undergraduate);
					rdbtnNewRadioButton.setSelected(((Student) list.getSelectedValue()).freshman);
					
					rdbtnGraduate.setSelected(((Student) list.getSelectedValue()).graduate);
					studentToDetails((Student) list.getSelectedValue());
					evaluateStudent((Student) list.getSelectedValue());
	            }

			}
		});
		
		list.setOpaque(false);

		btnNewButton = new JButton("Add Student");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editableList.addElement(new Student("[Enter name]"));
				list.setSelectedIndex(list.getLastVisibleIndex());

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 23));
		
		btnNewButton_1 = new JButton("Remove Selected");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					editableList.remove(list.getSelectedIndex());
				} catch (Exception ee) {}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(list, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(list, GroupLayout.PREFERRED_SIZE, 874, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(gl_panel);
		frmNumbersToWords.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{panel, frmNumbersToWords.getContentPane()}));
		panel.addMouseMotionListener(new MouseAdapter() {
			public void mouseMoved(MouseEvent e) {
				panel.mouseX = e.getX();
				panel.mouseY = e.getY();
			}
		});
	}
	
	private void detailsToStudent(Student student) {
		boolean tol1 = true;
		if (tol1) {
			student.name = txtName.getText();
			
			student.freshman = rdbtnNewRadioButton.isSelected();
			student.freshValedictorianOrSalutatorian = chckbxNewCheckBox.isSelected();
			student.fromRTULHS = chckbxGraduateFromRtu.isSelected();
			student.fresh100Graduates = chckbxGraduatedFromClass.isSelected();
			student.freshCertified = chckbxGraduateFromRtu_1_1.isSelected();
			
			student.undergraduate = rdbtnUndergraduate.isSelected();
			student.undergradGWA = textField_2.getText();
			
			student.graduate = rdbtnGraduate.isSelected();
			student.gradFromRTU = chckbxNewCheckBox_1.isSelected();
			student.gradWithHonors = chckbxNewCheckBox_2.isSelected();
			student.gradMeetUnitsRequirements = chckbxNewCheckBox_1_1.isSelected();
			student.gradAverageGWA = textField_3.getText();
			
			System.out.println("detailstostudent");
		}
		tol1 = false;
	}
	
	private void studentToDetails(Student student) {
		txtName.setText(student.name);
		
		rdbtnNewRadioButton.setSelected(student.freshman);
		chckbxNewCheckBox.setSelected(student.freshValedictorianOrSalutatorian);
		chckbxGraduateFromRtu.setSelected(student.fromRTULHS);
		chckbxGraduatedFromClass.setSelected(student.fresh100Graduates);
		chckbxGraduateFromRtu_1_1.setSelected(student.freshCertified);
		
		rdbtnUndergraduate.setSelected(student.undergraduate);
		textField_2.setText(student.undergradGWA);
		
		rdbtnGraduate.setSelected(student.graduate);
		chckbxNewCheckBox_1.setSelected(student.gradFromRTU);
		chckbxNewCheckBox_2.setSelected(student.gradWithHonors);
		chckbxNewCheckBox_1_1.setSelected(student.gradMeetUnitsRequirements);
		textField_3.setText(student.gradAverageGWA);
		
		System.out.println("studenttodetails");
		
		if (student.freshman) {
			enableFreshman();
			if (student.fromRTULHS) {
				chckbxGraduatedFromClass.setEnabled(false);
				chckbxGraduateFromRtu_1_1.setEnabled(false);
			} else {
				chckbxGraduatedFromClass.setEnabled(true);
				chckbxGraduateFromRtu_1_1.setEnabled(true);
			}
			System.out.println("F");
		} 
		if (student.undergraduate) {
			enableUndergrad();
			System.out.println("U");
		} 
		if (student.graduate) {
			enableGrad();
			System.out.println("G");
		}
	}
	
	private void enableFreshman() {
		chckbxNewCheckBox.setEnabled(true);
		chckbxGraduateFromRtu.setEnabled(true);
		chckbxGraduatedFromClass.setEnabled(true);
		chckbxGraduateFromRtu_1_1.setEnabled(true);
		
		lblUndergraduate_1.setEnabled(false);
		textField_2.setEnabled(false);
		
		chckbxNewCheckBox_1.setEnabled(false);
		chckbxNewCheckBox_1_1.setEnabled(false);
		chckbxNewCheckBox_2.setEnabled(false);
		lblUndergraduate_1_1.setEnabled(false);
		textField_3.setEnabled(false);
		
	}
	
	private void enableUndergrad() {
		chckbxNewCheckBox.setEnabled(false);
		chckbxGraduateFromRtu.setEnabled(false);
		chckbxGraduatedFromClass.setEnabled(false);
		chckbxGraduateFromRtu_1_1.setEnabled(false);
		
		lblUndergraduate_1.setEnabled(true);
		textField_2.setEnabled(true);
		
		chckbxNewCheckBox_1.setEnabled(false);
		chckbxNewCheckBox_1_1.setEnabled(false);
		chckbxNewCheckBox_2.setEnabled(false);
		lblUndergraduate_1_1.setEnabled(false);
		textField_3.setEnabled(false);
		
	}
	
	private void enableGrad() {
		chckbxNewCheckBox.setEnabled(false);
		chckbxGraduateFromRtu.setEnabled(false);
		chckbxGraduatedFromClass.setEnabled(false);
		chckbxGraduateFromRtu_1_1.setEnabled(false);
		
		
		lblUndergraduate_1.setEnabled(false);
		textField_2.setEnabled(false);
		
		chckbxNewCheckBox_1.setEnabled(true);
		chckbxNewCheckBox_1_1.setEnabled(true);
		chckbxNewCheckBox_2.setEnabled(true);
		lblUndergraduate_1_1.setEnabled(true);
		textField_3.setEnabled(true);
	}
	
	private void toggleFreshmanOptions() {
		if (chckbxGraduateFromRtu.isSelected()) {
			chckbxGraduatedFromClass.setEnabled(false);
			chckbxGraduateFromRtu_1_1.setEnabled(false);
			chckbxGraduatedFromClass.setSelected(false);
			chckbxGraduateFromRtu_1_1.setSelected(false);
		} else {
			chckbxGraduatedFromClass.setEnabled(true);
			chckbxGraduateFromRtu_1_1.setEnabled(true);
		}
		
	}
	
	private void clearSelect() {

		buttonGroup.clearSelection();
		
		chckbxNewCheckBox.setEnabled(false);
		chckbxGraduateFromRtu.setEnabled(false);
		chckbxGraduatedFromClass.setEnabled(false);
		chckbxGraduateFromRtu_1_1.setEnabled(false);
		chckbxNewCheckBox.setSelected(false);
		chckbxGraduateFromRtu.setSelected(false);
		chckbxGraduatedFromClass.setSelected(false);
		chckbxGraduateFromRtu_1_1.setSelected(false);
		
		lblUndergraduate_1.setEnabled(false);
		textField_2.setEnabled(false);
		
		chckbxNewCheckBox_1.setEnabled(false);
		chckbxNewCheckBox_1_1.setEnabled(false);
		chckbxNewCheckBox_2.setEnabled(false);
		lblUndergraduate_1_1.setEnabled(false);
		textField_3.setEnabled(false);
		chckbxNewCheckBox_1.setSelected(false);
		chckbxNewCheckBox_1_1.setSelected(false);
		chckbxNewCheckBox_2.setSelected(false);
		
	}
	
	private void evaluateStudent(Student student) {
		if (student.freshman || student.graduate) {
			if ((student.freshValedictorianOrSalutatorian && (student.fromRTULHS || (student.fresh100Graduates && student.freshCertified))) || student.gradWithHonors) {
				student.entranceScholarship = true;
				student.collegeScholarship = false;
				student.universityScholarship = false;
				student.graduateScholarship = false;
			}
		} 
		if (student.undergraduate) {
			if (Double.parseDouble(student.undergradGWA) <= 1.75 && Double.parseDouble(student.undergradGWA) >= 1.46) {
				student.entranceScholarship = false;
				student.collegeScholarship = true;
				student.universityScholarship = false;
				student.graduateScholarship = false;
			} else if (Double.parseDouble(student.undergradGWA) <= 1.45 && Double.parseDouble(student.undergradGWA) >= 1.00) {
				student.entranceScholarship = false;
				student.collegeScholarship = false;
				student.universityScholarship = true;
				student.graduateScholarship = false;
			}
		}
		if (student.graduate) {
			if (student.gradFromRTU && student.gradWithHonors && student.gradMeetUnitsRequirements && 
					(Double.parseDouble(student.gradAverageGWA) <= 1.20 && Double.parseDouble(student.gradAverageGWA) >= 1.00)) {
				if (!student.gradWithHonors) {
					student.entranceScholarship = false;
				}
				student.collegeScholarship = false;
				student.universityScholarship = false;
				student.graduateScholarship = true;
			}
		}
		
		String str = "";
		String desc = "";
		if (student.entranceScholarship) {
			str += "Entrance Scholarship\r\n";
			desc += "Entrance Scholarship shall be free of tuition fee for one semester\r\n\r\n";
		}
		if (student.collegeScholarship) {
			str += "College Scholarship\r\n";
			desc += "College Scholarship consisting of 50% reduction in tuition fee shall be enjoyed by any undergraduate students "
					+ "who obtains a General Weighted Average of 1.75 but not higher than 1.46 at the end of a semester.\r\n\r\n";
		}
		if (student.universityScholarship) {
			str += "University Scholarship\r\n";
			desc += "University Scholarship consisting of free tuition and other fees shall be enjoyed by any undergraduate student"
					+ " who obtains a General Weighted Average of 1.45 or better at the end of a semester.\r\n\r\n";
		}
		if (student.graduateScholarship) {
			str += "Graduate Scholarship\r\n";
			desc += "Graduate Scholarship consisting of free tuition fee shall be enjoyed by any graduate student who obtains an average grade of 1.20 or better."
					+ " Such scholarship could be availed of after completing at least 18 units of the course works in the graduate program. "
					+ "The student must carry a study load of at least 9 units per semestral term  and 6 units during summer term. "
					+ "The students must have no grade lower than 1.25 and must have not obtained an incomplete (INC) or DROPPED remark in any of the subjects"
					+ " taken in the previous term(s) and /or in the first 18 units taken. Transferees are not eligible for any form of scholarship benefits.\r\n\r\n";
		}
		if ((student.entranceScholarship || student.collegeScholarship || student.universityScholarship || student.graduateScholarship) == false) {
			str = "None";
		}
		
		txtrScholar.setText(str);
		txtrDescription.setText(desc);
	}
}


