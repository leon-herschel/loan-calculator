

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;

public class LoanCalculator extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoanCalculator frame = new LoanCalculator();
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
	public LoanCalculator() {
		setResizable(false);
		setTitle("Loan Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("Enter loan amount (PHP 1000 - PHP 100000):");
		label.setFont(new Font("Dialog", Font.PLAIN, 12));
		label.setBounds(10, 10, 256, 22);
		contentPane.add(label);
		
		Label label_1 = new Label("Enter interest rate per month (1% - 20%):");
		label_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		label_1.setBounds(10, 38, 256, 22);
		contentPane.add(label_1);
		
		Label label_1_1 = new Label("Enter loan term in months (6, 12, 18, 24, 30, or 36):");
		label_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		label_1_1.setBounds(10, 67, 281, 22);
		contentPane.add(label_1_1);
		
		TextField enterAmount = new TextField();
		enterAmount.setBounds(300, 10, 100, 22);
		contentPane.add(enterAmount);
		
		TextField enterInterest = new TextField();	
		enterInterest.setBounds(300, 38, 100, 22);
		contentPane.add(enterInterest);
		
		TextField enterTerm = new TextField();
		enterTerm.setBounds(300, 67, 100, 22);
		contentPane.add(enterTerm);
		
		Label label_1_1_1 = new Label("Principal Amount (Loan Amount):");
		label_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		label_1_1_1.setBounds(10, 126, 187, 22);
		contentPane.add(label_1_1_1);
		
		Label label_1_1_1_1 = new Label("Interest Rate per month:");
		label_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		label_1_1_1_1.setBounds(10, 154, 146, 22);
		contentPane.add(label_1_1_1_1);
		
		Label label_1_1_1_2 = new Label("Interest Amount per month:");
		label_1_1_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		label_1_1_1_2.setBounds(10, 182, 187, 22);
		contentPane.add(label_1_1_1_2);
		
		Label label_1_1_1_3 = new Label("Loan Terms (in months):");
		label_1_1_1_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		label_1_1_1_3.setBounds(10, 210, 187, 22);
		contentPane.add(label_1_1_1_3);
		
		Label label_1_1_1_4 = new Label("Total Interest Amount:");
		label_1_1_1_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		label_1_1_1_4.setBounds(10, 238, 187, 22);
		contentPane.add(label_1_1_1_4);
		
		Label label_1_1_1_4_1 = new Label("Total Loan Amount:");
		label_1_1_1_4_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		label_1_1_1_4_1.setBounds(10, 266, 120, 22);
		contentPane.add(label_1_1_1_4_1);
		
		Label label_1_1_1_4_1_1 = new Label("Payment per month:");
		label_1_1_1_4_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		label_1_1_1_4_1_1.setBounds(10, 294, 120, 22);
		contentPane.add(label_1_1_1_4_1_1);
		
		TextField resLoanAmount = new TextField();
		resLoanAmount.setEditable(false);
		resLoanAmount.setBounds(254, 126, 146, 22);
		contentPane.add(resLoanAmount);
		
		TextField resInterestRate = new TextField();
		resInterestRate.setEditable(false);
		resInterestRate.setBounds(254, 154, 146, 22);
		contentPane.add(resInterestRate);
		
		TextField resInterestAmount = new TextField();
		resInterestAmount.setEditable(false);
		resInterestAmount.setBounds(254, 182, 146, 22);
		contentPane.add(resInterestAmount);
		
		TextField resLoanTerms = new TextField();
		resLoanTerms.setEditable(false);
		resLoanTerms.setBounds(254, 210, 146, 22);
		contentPane.add(resLoanTerms);
		
		TextField resTotalInterest = new TextField();
		resTotalInterest.setEditable(false);
		resTotalInterest.setBounds(254, 238, 146, 22);
		contentPane.add(resTotalInterest);
		
		TextField resTotalLoan = new TextField();
		resTotalLoan.setEditable(false);
		resTotalLoan.setBounds(254, 266, 146, 22);
		contentPane.add(resTotalLoan);
		
		TextField resPayment = new TextField();
		resPayment.setEditable(false);
		resPayment.setBounds(254, 294, 146, 22);
		contentPane.add(resPayment);
		
		Button calculateButton = new Button("Calculate");
		calculateButton.setFont(new Font("Dialog", Font.BOLD, 12));
		calculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float loanAmount = Float.parseFloat(enterAmount.getText());
				if (loanAmount < 1000 || loanAmount > 100000) {
		 	        JOptionPane.showMessageDialog(null , "Loan amount must be between PHP 1000 and PHP 100000.", "Invalid Loan Amount", JOptionPane.ERROR_MESSAGE);
		 	        return;
		 	    }
				
				float interestRate = Float.parseFloat(enterInterest.getText());
				if (interestRate < 1 || interestRate > 20) {
		    	      JOptionPane.showMessageDialog(null , "Interest rate must be between 1% and 20%.", "Invalid Interest Rate", JOptionPane.ERROR_MESSAGE);
		    	      return;
				}
				interestRate /= 100;
				
				float loanTerm = Float.parseFloat(enterTerm.getText());
				if (loanTerm != 6 && loanTerm != 12 && loanTerm != 18 && loanTerm != 24 && loanTerm != 30 && loanTerm != 36) {
					 JOptionPane.showMessageDialog(null, "Loan term must be 6, 12, 18, 24, 30, or 36 months.", "Invalid Loan Term", JOptionPane.ERROR_MESSAGE);
					 return;
	    	    }
				
				float interestAmountPerMonth = loanAmount * interestRate;
	    	    float totalInterestAmount = interestAmountPerMonth * loanTerm;
	    	    float totalLoanAmount = loanAmount + totalInterestAmount;
	    	    float paymentPerMonth = totalLoanAmount / loanTerm;
	    	    
	    	    resLoanAmount.setText(String.format("PHP %.2f", (float)loanAmount));
	    	    resInterestRate.setText(String.format("%.2f%%", interestRate*100));
	    	    resInterestAmount.setText(String.format("PHP %.2f", interestAmountPerMonth));
	    	    resLoanTerms.setText(Integer.toString((int)loanTerm));
	    	    resTotalInterest.setText(String.format("PHP %.2f", totalInterestAmount));
	    	    resTotalLoan.setText(String.format("PHP %.2f", totalLoanAmount));
	    	    resPayment.setText(String.format("PHP %.2f", paymentPerMonth));
			}
		});
		calculateButton.setBounds(110, 95, 220, 22);
		contentPane.add(calculateButton);
		
		Button clearButton = new Button("Clear");
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterAmount.setText("");
				enterInterest.setText("");
				enterTerm.setText("");
				resLoanAmount.setText("");
	    	    resInterestRate.setText("");
	    	    resInterestAmount.setText("");
	    	    resLoanTerms.setText("");
	    	    resTotalInterest.setText("");
	    	    resTotalLoan.setText("");
	    	    resPayment.setText("");
			}
		});
		clearButton.setFont(new Font("Dialog", Font.BOLD, 12));
		clearButton.setBounds(110, 322, 220, 22);
		contentPane.add(clearButton);
		
	}
}
