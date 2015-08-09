package AvgustZadaci;

import java.util.Date;
import java.util.Scanner;

public class Account {                       // kreiramo klasu racun u koju upisujemo poterbne podatke
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;

	public Date getDateCreated() {            // kreiramo metodu za vrijeme iz javine klase
		return dateCreated;
	}

	Account() {                             // kreiramo prazan ili defolt konstruktor

	}

	Account(int id, double balance, double annualInterestRate) { // kreiramo konstruktor sa potrebnim podatcima

		this.id = id;                                     // korisnicki id
		this.balance = balance;                          // stanje na racunu
		this.annualInterestRate = annualInterestRate;   // kamatna stopa
		

	}

	public int getId() {           // kreiramo metod za dobijanje prvog podatka
		return id;
	}

	public void setId(int id) {    // metod za promjenu prvog podatka
		this.id = id;
	}

	public double getBalance() {   // kreiramo metod za dobijanje drugog podatka
		return balance;
	}

	public void setBalance(double balance) {  // metod za promjenu drugog podatka
		this.balance = balance;
	}

	public double getAnnualInterestRate() {    // kreiramo metod za dobijanje treceg podatka
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {  // metod za promjenu treceg podatka
		this.annualInterestRate = annualInterestRate;
	}

	public double getMonthlyInterest() {                          // kreiramo metod za dobijanje cetvrtog podatka
		double monthlyInterestRate = annualInterestRate / 1200;   // mjesecna kamatna stopa se dobija kada godisnju podijelimo sa 12 mjeseci
		double monthlyInterest = balance * monthlyInterestRate;   // a formula za dobijanje mjesecne je ukupan iznos * iznos za mjesec
		return monthlyInterest;                                   // kroz metod vratimo taj rezultat za mjesecnu kamatnu stopu
	}

	public void withdraw(double withDrowAmount) {                     // kreiramo metodu za podizanje novca sa racuna
		if (balance > withDrowAmount) {                              // ukoliko korisnik ima vise novca od iznosa koji dize
			balance -= withDrowAmount;                              // taj iznos mu oduzimamo od ukupnog iznosa
		} else {                                                   // ukoliko zeli da podigne vise nego sto ima na racunu
			System.out.println("You dont have anaf money");       // ispisujemo mu poruku upozorenja
		}

	}

	public void deposit(double depositAmount) {                   //  kreiramo metodu za polaganje novca na racun
		balance += depositAmount;
	}

}

class TestAccount {                                // kreiramo sledecu klasu u kojoj cemo da testiramo klasu racun

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double amountWithdraw;                    // strvaramo memoriski prostor za unos od korisnika podataka
		double amountDeposit;

		Account provjeri = new Account(1122, 20000, 4.5);  // kreiramo objektnu instancu klase racun te joj prosledjujemo podatke
		
		System.out.print("\nEnter how much money do you want withdraw : ");
		amountWithdraw = input.nextDouble();                                 // smjestamo unos od korisnika za podizanje novca

		provjeri.withdraw(amountWithdraw);                                   // pozivamo se na metodu koja ce vratiti podizanje novca 
											
		System.out
				.print("\nEnter how much money zou want to deposit on your account: ");
		amountDeposit = input.nextDouble();                                            // smjestamo unos od korisnika za podizanje novca
										
		provjeri.deposit(amountDeposit);                                              // pozivamo se na metodu koja ce vratiti polaganje novca 
											
											
		System.out.println(" Your balance: " + provjeri.getBalance()    // preko instace pozivamo metode za stanje na racunu
				+ "\nYour monthly interest is: "
				+ provjeri.getMonthlyInterest() + "\nAccount is created: "   // pozivamo mjesecnu kamatu
				+ provjeri.getDateCreated());                               // pozivamo datum kreiranja racuna

	}
}
