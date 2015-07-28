package Zadaci;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class FutureInvestment {

	public static void main(String[] args) {
		//Enter investment amount
		String investmentAmountString = JOptionPane.showInputDialog(null,
				"Enter investment amount" + "Input", JOptionPane.QUESTION_MESSAGE);
				
		//convert string to double
		double investmentAmount = Double.parseDouble(investmentAmountString) ;
		        
		//Enter annual interest rate
		String annualInterestRateString = JOptionPane.showInputDialog(null , "Enter annual interest rate", "Input" , JOptionPane.QUESTION_MESSAGE);
		//convert string to double devide by 100 for percentage
		double annualInterestRate = Double.parseDouble(annualInterestRateString) / 100;
		// get the Interest Rate per month
		double monthlyInterestRate = annualInterestRate / 12 ;
		        
		//Enter number of years
		String numberOfYearsString = JOptionPane.showInputDialog(null , "Enter number of years", "Input" , JOptionPane.QUESTION_MESSAGE);
		//convert string to double
		double numberOfYears = Double.parseDouble(numberOfYearsString);
		        
		//compute future investment value
		double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate),(numberOfYears * 12) );
		        
		//display result
		JOptionPane.showMessageDialog(null , " when \n Invesment amount =  " + investmentAmount + "\n Annual interest rate = " + annualInterestRate +
		"\n Number of year = " + numberOfYears + " \n The Future Investment Value will be " + futureInvestmentValue , "Output" , JOptionPane.INFORMATION_MESSAGE);
		        
		        
		    }
		    
		}