package AvgustZadaci;

public class Pravougaonik2D {
	private double x;
    private double y;             //kreiramo memoriski prostor za data fields
    private double height;
    private double width;
    
   
    public double getX() {                // kreiramo getere i setere za odredjene data fields
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    
    public Pravougaonik2D() {                                                   // kreiramo prazan konstruktor nase klase
        this.x = 0;
        this.y = 0;
        this.height = 1;
        this.width = 1;
    }
    
    public Pravougaonik2D(double x, double y, double width, double height) { // kreiramo konstruktor koji prima odredjena data fields
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    public double getArea() {                                     // dobijamo povrsinu pravougaonika
    	double povrsina = width*height;
        return povrsina;
    }
    
    public double getPerimeter() {                             // dobijamo obim pravougaonika
    	double obim = 2*(width + height);
        return obim;
    }
    
    public boolean contains(double x, double y) {          // provjeravamo da li se tacke nalaze u provougaoniku
    	if((Math.abs(2*(x-this.x)) > height || Math.abs(2*(y - this.y)) > width)) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public boolean contains(MyRectangle2D r) {             // provjeravamo da li se pravougaonik nalazi u pravougaoniku
    	if((Math.abs(2*(r.getX()-this.x)) > height || Math.abs(2*(r.getY() - this.y)) > width)) {
    		
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public boolean overlaps(MyRectangle2D r) {            // provjeravam da li se sijeku
    	if((Math.abs(2*(r.getX()-this.x)) >= height || Math.abs(2*(r.getY() - this.y)) >= width)) {       
    		return true;
    	} else {
    		return false;
    	}
    }
    public static void main(String[] args) {
    	
    	MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);                         // kreiramo objektnu instancu
		 
    	System.out.println(r1.getArea());                                          
    	System.out.println( r1.getPerimeter());                                     
    	System.out.println(r1.contains(3, 3));                                     
    	System.out.println(r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));       // pozivamo se na prethodno kreirane metode
    	System.out.println(r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));        
	}


	}


