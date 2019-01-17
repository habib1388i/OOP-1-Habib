package Bobot1;

public class pengukur {

	//atribut
		int beNsin;
		int jaRak;
		int kapaSitas;
		boolean atteNtion;
		String meRk;
		
		void Bensin() {
			if (beNsin == 0) {
				System.out.println("bensin anda habis." + beNsin+ "L.maaf motor tidak bisa hidup! ");
			}else if (beNsin <= 3){
				System.out.println("bensin anda hampir habis." + beNsin + "L.isi bensin anda!");
			}else{
				System.out.println("bensin penuh . siap lanjut");
				Jarak();
			
			}
		}
		
		void Jarak() {
			if (jaRak >= 175) {
				System.out.println("perjalanan anda terlalu jauh");
			}else if (jaRak <= 3) {
				System.out.println("mari berjalan lebih jauh lagi!");
				Kapasitas();
			}else{
				Kapasitas();
			}
		}

		void Kapasitas() {
			if (kapaSitas >= 4) {
				System.out.println("muatan kapasitas anda melebihi batas maximal");
				Attention();
			}else if (kapaSitas <= 1){
				System.out.println("yakin sendiri aja ? jomblo ya!");
				Attention();
			}
		}

		void Attention() {
			if (!atteNtion) {
				System.out.println("motor anda butuh di service");
			}else{
				System.out.println("motor anda dengan keadaan baik . mari berpetualangan");
			
			}
		}

		String rtSring() {
			return "astrea";
			
		}
}
