package MyCalculator;

public class Calculator1 {
//	function
	static int Atu(int bilsatu, int bildua) {
		return bilsatu + bildua;
	}
	static int Ua(int bilsatu, int bildua, int biltiga) {
		return bilsatu * bildua / biltiga;
	}
	static int Iga(int bilsatu, int bildua, int biltiga, int bilempat) {
		return bilsatu * bildua / biltiga + bilempat;
	}
	static int Pat(int bilsatu, int bildua, int biltiga, int bilempat, int billima) {
		return bilsatu * bildua / biltiga + bilempat - billima;
	}
	static int Ma(int bilsatu, int bildua, int biltiga, int bilempat, int billima, int bilenam) {
		return bilsatu * bildua / biltiga + bilempat - billima % bilenam;
	}
	public static void main (String[] args) {
		System.out.println(Atu(7,2));
		System.out.println(Ua(7,1,1));
		System.out.println(Iga(7,1,1,1));
		System.out.println(Pat(7,1,1,1,1));
		System.out.println(Ma(7,1,1,1,1,1));
	}
}
