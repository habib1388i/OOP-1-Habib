package Parkir;

public class Parkiran {
//	atribut
	String mall;
	int mobil ;
	int motor ;
	boolean parkir ;
	int base;
//	mobil
	void Mobil() {
		if (mobil == 1) {
			System.out.println("mobil baru datang");
			Parkir();
		} else if (mobil == 2) {
			System.out.println("mobil sudah agak lama");
			Parkir();
		}else{
			System.out.println("mobil sudah lama");
			Parkir();
		}
	}
//	motor
	void Motor() {
		if (motor == 1) {
			System.out.println("motor baru datang");
			Parkir();
		}else if (motor == 2){
			System.out.println("motor sudah agak lama");
			Parkir();
		}else{
			System.out.println("motor sudah lama");
			Parkir();
		}
	}
//	parkir
	void Parkir() {
		mall = rtString();
		if (parkir) {
			System.out.println("PARKIR."+mall+".sudah penuh");
	    mall = rtString();
		}else{
			System.out.println("PARKIR."+mall+".blm penuh");
			
		}
	}
//	base

		public static void main(String[] args) {
			int P = 5;
			do {
				System.out.println(P);
				P--;
			}while(P > 1);
		}
	
	
//	mall
	String rtString() {
		return "SUMARECON MALL BEKASI";
	}
}
