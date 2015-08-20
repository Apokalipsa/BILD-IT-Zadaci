package ZadaciAvgust;

import java.sql.Date;

public class Person {
	
	public String name;
	public String address;           // kreiramo data fields
	public String phone;
    public String email;
	
	public Person(){               // kreiramo default konstruktor
	}
	
	public Person(String name, String address, String phone, String email) { // kreiramo konstruktor koji prima data fieldse
		this.phone = phone;
		this.name = name;
		this.address = address;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {          // kreiramo gerer i seter metode za odredjene data fieldse
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString(){                         // kreiramo metodu koja ispisuje rezultat
		return " name --> " + getName() ;       // pozivajuci se na metodu koja vraca ime koju prosirujemo
	}
}


class Student extends Person {         // kreiramo klasu student koja koristi podatke iz klase person
	
	 final static String[] STATUS = { "fresman","sophomore","junior","senior" };
     public String status = STATUS[0];         // kreiramo konstantu za ststus pa pravimo niz sa data fields

 public Student() {                             // kreiramo prazan konstruktor

}
 
public Student(String name, String address, String phoneNumber,  // kreiramo konstruktor sa parametrima
		String emailAddress, int status) {
	super(name, address, phoneNumber, emailAddress);        // pristupamo metodi iz klase person i pozivamo data fields iz nje
	this.status = STATUS[status];                          // pozivamo stsus konstatnu da vrati redni broj stringa u njoj tj index 
}

public String getStatus() {                             // kreiramo geter metodu za vracanje statusa
	return status;
}

public void setStatus(String status) {               // kreiramo seter metodu za promjenu status data fieldsa
	this.status = status;
}
@Override
public String toString() {                         // kreiramo metodu koja vraca ime studenta
	return "Student " + super.getName();          // pristupamo imenu preko supera
}
}

class Employee extends Person {                // kreiramo klasu Employee koja koristi data fields iz klase person takodje
	
	public String office;
	public double salary;                      // kreiramo data fields
	public Date dateHired;
	
	
	Employee() {                               // kreiramo prazan konstruktor
	}
	
	Employee(String name, String address, String phone, String email) {      // konstruktor sa parametrima
		super(name, address, phone, email);                                 // pozivamo se na metodu iz maticne klase preko supera
	}
	
	Employee(String office, double salary, Date dateHired) {           // kreiramo konstruktor sa data fields ove klase
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}
	
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public double getSalary() {
		return salary;
	}                                                             // postavljamo getere i setere za data fields ove klase
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getDateCreated() {
		return dateHired;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateHired = dateCreated;
	}
	@Override
	public String toString(){                                       // metoda koja ispisuje poruku
		return " name --> " + super.getName();                     // preko supera pristupamo metodi za ime iz prve klase
	}
}

class Faculty extends Employee {                                // kreiramo klasu faculty koja koristi data fields iz prethodne klase
	
	public String officeHours;
	public String rank;
	
	Faculty() {
	}
	
	Faculty(String name, String address, String phone, String email) {
		super(name, address, phone, email);
	}
	
	Faculty(String officeHours, String rank) {
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public String getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	@Override
	
	public String toString(){
		return  "name --> " + super.getName();
	}
}

class Staff extends Employee {                            // kreiramo klasu staff koja koristi data fields iz klase faculty
	
	private String title;
	
	
	Staff() {	
	}
	
	Staff(String name, String address, String phone, String email) {
		super(name, address, phone, email);
	}
	
	Staff(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	
	public String toString(){
		return " name--> " + super.getName();
	}
	
	public static void main(String[] args) {          // main metoda u kojoj kreiramo objekte nasih klasa te pozivamo sve toString metode
		Person klasa1 = new Person(" Java ", " Niko Neznanovic ", "0000", "java@gmail.com");
		System.out.println(klasa1.toString() + " ");
		
		Student klasa2= new Student("Joj Boze", "Nema Ulice", "3545","kobajagi@gmail.com", 0);		
		System.out.println(klasa2);
		
		Employee  klasa3= new Employee("Naucit Javu", "Moram", "0111", "podhitno@gmail.com");
		System.out.println(klasa3.toString() + " ");
		
		Faculty klasa4 = new Faculty("Treba", "Vise Ucit", "0555", "dijana@gmail.com");
		System.out.println(klasa4.toString() + " ");
		
		Staff staff = new Staff("Java je cool", "Samo Je Teska", "5788", "dijana@gmail.com");
		System.out.println(staff.toString() + " ");
		
	}

	}



