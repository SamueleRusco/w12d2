package src;

public class Runnable{
	
	//public perché deve essere avviato da jre (runtime), quindi accessibile da fuori
	//static perché non voglio instanziarla (solo metodi statici)
	//void perché non c'è nessun return 
	
	public static void main(String[] args) {
		
	Rettangolo r1 = new Rettangolo(15, 33);
	Rettangolo r2 = new Rettangolo(22, 18);
   stampaRettangolo(r1);
   stampaRettangolo(r2);
   stampaDueRettangoli(r1, r2);
    
	}
	
	
	public static void stampaRettangolo(Rettangolo r) {
		System.out.println("base: "+ r.base);
		System.out.println("altezza: "+ r.altezza);
		
	}
	public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
		System.out.println("perimetro rettangolo 1:"+ r1.Perimetro());
		System.out.println("perimetro rettangolo 2:"+ r2.Perimetro());

		System.out.println("area rettangolo 1:"+ r1.Area());
		System.out.println("area rettangolo 2:"+ r2.Area());

		
	}
	
}