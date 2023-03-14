package src;
// una classe è una struttura, gli stiamo dicendo come è strutturato
// un rettangolo
public class Rettangolo{
		int base;
		int altezza;
		
		public Rettangolo(int a, int b) {
			
		this.base= a;
		this.altezza=b;
		
		}
		
		public int Perimetro() {
			int perimetro =(this.base+this.altezza)*2;
			return perimetro;
		}
		
		public int Area() {
			int area =(this.base*this.altezza);
			return area;
		}

}