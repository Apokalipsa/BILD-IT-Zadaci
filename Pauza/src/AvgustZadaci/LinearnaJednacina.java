package AvgustZadaci;

import java.util.Scanner;

public class LinearnaJednacina {
	public static double[] linearEquation(double[][] a, double[] b){
        
        if((a[0][0]*a[1][1])-(a[0][1]*a[1][0]) == 0) return null;         // ukoliko je skup brojeva jednak nuli vracamo null
       
        double x = ((a[0][2]*a[1][1])-(a[1][2]*a[0][1])) / ((a[0][0]*a[1][1])-(a[0][1]*a[1][0]));  // formula za dobijanje  x nepoznate u jednacini
        double y  = ((a[1][2]*a[0][0])-(a[0][2]*a[1][0])) / ((a[0][0]*a[1][1])-(a[0][1]*a[1][0])); // formula za dobijanje  y nepoznate u jednacini
       
        b[0] = x;    // smjestamo dobijene nepoznate u jednodimenyionalni niz 
        b[1] = y;   // vracamo taj niz koji sada ima ponate clanove 
       
        return b;
}

public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
       
        double[][] linearEquation = new double[2][3];                       // kreiramo 2D niz 2*3
        double[] solution = new double[2];                                 // kreiramo jednodimenzionalni niz sa 2 clana
       
        for(int i = 0; i < linearEquation.length; i++){
                for(int j = 0; j < linearEquation[i].length; j++){
                	System.out.println("Enter linearEquation[" + i + "]" + "[" + j + "]"); 
                        linearEquation[i][j] = input.nextDouble();            // punimo 2D niz  unosom od korisnika
                }
        }
       
        if(linearEquation(linearEquation, solution) == null){     // pozivamo metodu za provjeru jednacina te joj prosledjujemo unos ka argument
                System.out.println("The equation has no solution"); // ukoliko su njeni brojevi jednaki onda jednacina nema resenje
        }else{
                solution = linearEquation(linearEquation, solution); 
                System.out.printf("Result: (X, Y) = (%.2f,%.2f)",solution[0],solution[1]);             
        }  // resenje dobijamo pozivanjem metode i prosledjivanjem parametara ponovo 
       
}

}