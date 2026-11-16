package Atividade;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
public class Calculadora {

 System.out.printf("Wilgner Mateus silfer - 0025265");
	private JFrame frmWilgnerMateusSilfer;
	private JTextField JTextfieldR;

	/**
	* Launch the application.
	*/
	public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	public void run() {
	try {
	Calculadora window = new Calculadora();
	window.frmWilgnerMateusSilfer.setVisible(true);
	} catch (Exception e) {
	e.printStackTrace();
	}
	}
	});
	}

	/**
	* Create the application.
	*/
	public Calculadora() {
	initialize();
	}

	double v1, v2, v3, v4, v5, v6, v7, v8, v9;
	double Ra = 0;
	String Op;

	/**
	* Initialize the contents of the frame.
	*/
	private void initialize() {
	frmWilgnerMateusSilfer = new JFrame();
	frmWilgnerMateusSilfer.setTitle("Wilgner Mateus Silfer 0025265");
	frmWilgnerMateusSilfer.getContentPane().setBackground(new Color(108, 102, 207));
	frmWilgnerMateusSilfer.getContentPane().setLayout(null);

	JTextfieldR = new JTextField();
	JTextfieldR.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
	JTextfieldR.setBackground(new Color(192, 192, 192));
	JTextfieldR.setBounds(10, 52, 274, 111);
	frmWilgnerMateusSilfer.getContentPane().add(JTextfieldR);
	JTextfieldR.setColumns(10);

	JButton btnNewButton_4 = new JButton("0");
	btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
	btnNewButton_4.setBackground(new Color(192, 192, 192));
	btnNewButton_4.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	JTextfieldR.setText("0");
	}
	});
	btnNewButton_4.setBounds(110, 381, 41, 44);
	frmWilgnerMateusSilfer.getContentPane().add(btnNewButton_4);

	JButton btnNewButton_4_1 = new JButton("1");
	btnNewButton_4_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	JTextfieldR.setText("1");
	}
	});
	btnNewButton_4_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
	btnNewButton_4_1.setBackground(Color.LIGHT_GRAY);
	btnNewButton_4_1.setBounds(64, 326, 41, 44);
	frmWilgnerMateusSilfer.getContentPane().add(btnNewButton_4_1);

	JButton btnNewButton_4_1_1 = new JButton("2");
	btnNewButton_4_1_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	JTextfieldR.setText("2");
	}
	});
	btnNewButton_4_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
	btnNewButton_4_1_1.setBackground(Color.LIGHT_GRAY);
	btnNewButton_4_1_1.setBounds(110, 326, 41, 44);
	frmWilgnerMateusSilfer.getContentPane().add(btnNewButton_4_1_1);

	JButton btnNewButton_4_1_1_1 = new JButton("3");
	btnNewButton_4_1_1_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	JTextfieldR.setText("3");
	}
	});
	btnNewButton_4_1_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
	btnNewButton_4_1_1_1.setBackground(Color.LIGHT_GRAY);
	btnNewButton_4_1_1_1.setBounds(161, 326, 41, 44);
	frmWilgnerMateusSilfer.getContentPane().add(btnNewButton_4_1_1_1);

	JButton btnNewButton_4_1_2 = new JButton("4");
	btnNewButton_4_1_2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	JTextfieldR.setText("4");
	}
	});
	btnNewButton_4_1_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
	btnNewButton_4_1_2.setBackground(Color.LIGHT_GRAY);
	btnNewButton_4_1_2.setBounds(64, 275, 41, 44);
	frmWilgnerMateusSilfer.getContentPane().add(btnNewButton_4_1_2);

	JButton btnNewButton_4_1_2_1 = new JButton("5");
	btnNewButton_4_1_2_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	JTextfieldR.setText("5");
	}
	});
	btnNewButton_4_1_2_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
	btnNewButton_4_1_2_1.setBackground(Color.LIGHT_GRAY);
	btnNewButton_4_1_2_1.setBounds(110, 275, 41, 44);
	frmWilgnerMateusSilfer.getContentPane().add(btnNewButton_4_1_2_1);

	JButton btnNewButton_4_1_2_1_1 = new JButton("6");
	btnNewButton_4_1_2_1_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	JTextfieldR.setText("6");
	}
	});
	btnNewButton_4_1_2_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
	btnNewButton_4_1_2_1_1.setBackground(Color.LIGHT_GRAY);
	btnNewButton_4_1_2_1_1.setBounds(161, 275, 41, 44);
	frmWilgnerMateusSilfer.getContentPane().add(btnNewButton_4_1_2_1_1);

	JButton btnNewButton_4_1_2_2 = new JButton("7");
	btnNewButton_4_1_2_2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	JTextfieldR.setText("7");
	}
	});
	btnNewButton_4_1_2_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
	btnNewButton_4_1_2_2.setBackground(Color.LIGHT_GRAY);
	btnNewButton_4_1_2_2.setBounds(64, 220, 41, 44);
	frmWilgnerMateusSilfer.getContentPane().add(btnNewButton_4_1_2_2);

	JButton btnNewButton_4_1_2_2_1 = new JButton("8");
	btnNewButton_4_1_2_2_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	JTextfieldR.setText("8");
	}
	});
	btnNewButton_4_1_2_2_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
	btnNewButton_4_1_2_2_1.setBackground(Color.LIGHT_GRAY);
	btnNewButton_4_1_2_2_1.setBounds(110, 220, 41, 44);
	frmWilgnerMateusSilfer.getContentPane().add(btnNewButton_4_1_2_2_1);

	JButton btnNewButton_4_1_2_2_1_1 = new JButton("9");
	btnNewButton_4_1_2_2_1_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	JTextfieldR.setText("9");
	}
	});
	btnNewButton_4_1_2_2_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
	btnNewButton_4_1_2_2_1_1.setBackground(Color.LIGHT_GRAY);
	btnNewButton_4_1_2_2_1_1.setBounds(160, 220, 41, 44);
	frmWilgnerMateusSilfer.getContentPane().add(btnNewButton_4_1_2_2_1_1);

	JButton JtextC = new JButton("c");
	JtextC.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	JTextfieldR.setText("0");
	}
	});
	JtextC.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
	JtextC.setBackground(new Color(255, 255, 255));
	JtextC.setBounds(10, 179, 41, 44);
	frmWilgnerMateusSilfer.getContentPane().add(JtextC);

	JButton JtextMe = new JButton("-");
	JtextMe.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	    v1 = Double.parseDouble(JTextfieldR.getText());
	    Ra += Double.parseDouble(JTextfieldR.getText());
	    Op = "Menos";
	}
	});
	JtextMe.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
	JtextMe.setBackground(Color.LIGHT_GRAY);
	JtextMe.setBounds(230, 289, 41, 44);
	frmWilgnerMateusSilfer.getContentPane().add(JtextMe);

	JButton JtextMu = new JButton("x");
	JtextMu.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	    v1 = Double.parseDouble(JTextfieldR.getText());
	    Ra += Double.parseDouble(JTextfieldR.getText());
	    Op = "Vezes";
	}
	});
	JtextMu.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
	JtextMu.setBackground(Color.LIGHT_GRAY);
	JtextMu.setBounds(230, 344, 41, 44);
	frmWilgnerMateusSilfer.getContentPane().add(JtextMu);

	JButton JtextDi = new JButton("/");
	JtextDi.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	        v1 = Double.parseDouble(JTextfieldR.getText());
	        Ra += Double.parseDouble(JTextfieldR.getText());
	        Op = "Divisao";
	    }
	});
	JtextDi.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
	JtextDi.setBackground(Color.LIGHT_GRAY);
	JtextDi.setBounds(230, 399, 41, 44);
	frmWilgnerMateusSilfer.getContentPane().add(JtextDi);

	JButton JtextMa = new JButton("+");
	JtextMa.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {

	v1 = Double.parseDouble(JTextfieldR.getText());
	Ra += Double.parseDouble(JTextfieldR.getText());
	Op = "soma";
	}
	});
	JtextMa.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
	JtextMa.setBackground(Color.LIGHT_GRAY);
	JtextMa.setBounds(228, 234, 43, 44);
	frmWilgnerMateusSilfer.getContentPane().add(JtextMa);

	JButton JtextRes = new JButton("=");
	JtextRes.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {

	if (!JTextfieldR.getText().isEmpty()) {

	    v2 = Double.parseDouble(JTextfieldR.getText());
	if ("soma".equals(Op)) {
	Ra += v2;
	JTextfieldR.setText(String.valueOf(Ra));
	}
	}if (Op == "Menos") {
	    JTextfieldR.setText(String.valueOf(v1-v2));

	}if (Op == "Vezes") {
	    JTextfieldR.setText(String.valueOf(v1*v2));

	}if (Op == "Divisao") {
	    JTextfieldR.setText(String.valueOf(v1/v2));
	}if ("Potencia".equals(Op)) {
	    JTextfieldR.setText(String.valueOf(Math.pow(v1, v2)));
	}
	}
	});
	JtextRes.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
	JtextRes.setBackground(new Color(255, 255, 255));
	JtextRes.setBounds(10, 234, 41, 44);
	frmWilgnerMateusSilfer.getContentPane().add(JtextRes);

	JButton JtextVir = new JButton("^");
	JtextVir.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	        v1 = Double.parseDouble(JTextfieldR.getText());
	        Op = "Potencia";
	}
	});
	JtextVir.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
	JtextVir.setBackground(Color.LIGHT_GRAY);
	JtextVir.setBounds(230, 179, 41, 44);
	frmWilgnerMateusSilfer.getContentPane().add(JtextVir);

	frmWilgnerMateusSilfer.setBackground(new Color(255, 0, 128));
	frmWilgnerMateusSilfer.setBounds(100, 100, 310, 505);
	frmWilgnerMateusSilfer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
