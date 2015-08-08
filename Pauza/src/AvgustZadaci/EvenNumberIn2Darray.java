package AvgustZadaci;

public class EvenNumberIn2Darray {

public static int[][] getRandomMatrix() {                             // metod koji ce upisati random brojeve u  matrix

	int[][] matrica = new int[6][6];

	for (int i = 0; i < matrica.length; i++) {
		for (int j = 0; j < matrica[i].length; j++) {
			matrica[i][j] = (int) (Math.random() * 2);            // popunjavamo matricu random brojevima od 0 do 1 radi preglednosti
		}
	}

	return matrica;
}

public static void printMatricu(int[][] matrix) {                         // metod koji ce ispisati matrix
	for (int row = 0; row < matrix.length; row++) {
		for (int column = 0; column < matrix[row].length; column++) {
			System.out.print(matrix[row][column] + " ");
		}
		System.out.println();
	}
}
public static void parniBrojevi(int[][] matrix){
	int red = 0;                             //memoriski prostore za zbir svih brojeva u redu
	int kolona = 0;                         //memoriski prostore za zbir svih brojeva u kolonama
	boolean even = true;
	for (int row = 0; row < matrix.length; row++) { //petljom prolazimo kroz sve brojeve u matrici
		
		
		for (int column = 0; column < matrix[row].length; column++) { // petljom ponovo prolazimo kroz sve brojeve u redu
			red+= matrix[row][column];            // sabiramo brojeve u redovima
			kolona += matrix[column][row];        // sabiramo brojeve u kolonama
		}
		
		
		if(red % 2!=0 || kolona % 2!=0){   // ukoliko nije zbir djeljiv sa sa 2 dolazimo do zakljucka da nema parnih brojeva
			even = false;
			break;
		}
		//red = 0;
		//kolona = 0;
		
	}
	if(even){                       // ukoliko su pronadjeni brojevi u matrici onda je uslov ispunjen i printamo rezultat
		System.out.println("Number of 1s in rows and columns is even");
		parniBrojevi(matrix);     // pozivajuci se na prethodno kreiranu metodu
	}
	else {
		System.out.println("Number of 1s in rows and columns is not even");
	}
}




public static void main(String[] args) {
	int[][] matrica = getRandomMatrix();             //kreiramo instancu matrica od prethodno kreirane metode za popunjavanje matrice
	printMatricu(matrica);                           //pozivamo prethodno kreiranu metodu za printanje matrice u konzolu
	parniBrojevi(matrica);                           // pozivamo prethodno kreiranu metodu koja ce vratiti da li su brojevi parni u matrici
}
}