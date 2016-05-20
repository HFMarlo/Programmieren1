

public class Ueberladung {
	// Variablen
	public int Wert1;
	public int Wert2;
	public double DWert1;
	public double DWert2;

	// Konstruktoren
	public Ueberladung(int _x1, int _x2) {
		Wert1 = _x1;
		Wert2 = _x2;
	}

	public Ueberladung(double _x1, double _x2) {
		DWert1 = _x1;
		DWert2 = _x2;
	}

	// Methoden, die kein sicherung brauchen?
	public int maxInt() {
		return (java.lang.Math.max(Wert1, Wert2));
	}

	public double logplusminDouble() {
		return (Math.log(java.lang.Math.max(DWert1, DWert2)));
	}

	public static void main(String[] args) {
		Ueberladung test = new Ueberladung(-4.3, 333.5);
		System.out.println(test.logplusminDouble());
		System.out.println(test.maxInt());

	}

}
