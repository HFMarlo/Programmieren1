
public class SphereStorage {
	public Sphere[] Eistuete;

	// Konstruktor!!
	public SphereStorage(int _size) {
		Eistuete = new Sphere[_size];
	}

	public boolean sphere1FitsInSphere2(Sphere _sph1, Sphere _sph2) {
		if (_sph1 == null || _sph2 == null) {
			System.out.println("eine der Spheren ist nicht deklariert, deshalb FALSE");
			return false;
		}
		if (_sph1.getRadius() < _sph2.getRadius()) {
			return true;
		}
		return false;
	}

	public boolean addSphere(Sphere _sph) {
		for (int i = 0; i < Eistuete.length; i++) {
			// wenn der slot noch nicht befüllt ist, füllt er die Sphere da rein
			if (Eistuete[i] == null) {
				Eistuete[i] = _sph;
				return true;
			}
		}
		return false;

	}

	public double getTotalVolume() {
		double a = 0;
		for (int i = 0; i < Eistuete.length; i++) {
			if (Eistuete[i] == null) {
				continue;
			}
			a = a + (int) Eistuete[i].getVolume(); // wenn nicht alles
													// zugewiesen, dann kommt
													// nicht 0 sondern Error.
													// Null ist kein Integer
		}
		return a;
	}

	public Sphere[] getAllSpheres() {
		return Eistuete;
	}

	public Sphere getSphere(int _pos) {
		if(_pos>=Eistuete.length){return null;}
		
		return Eistuete[_pos];
	}

	// MAIN
	public static void main(String[] args) {
		Sphere sp1 = new Sphere(2);
		Sphere sp2 = new Sphere(3);
		Sphere sp3 = new Sphere(4);
		Sphere sp4 = new Sphere(5);
		SphereStorage test = new SphereStorage(3);
		System.out.println("Fits?: " + test.sphere1FitsInSphere2(sp1, sp2));// reicht
																			// ein
																			// Test
																			// auf
																			// Spheren
																			// oder
																			// Arrayelemente
																			// benötigt?
		System.out.println("Check 1 auf unbefüllte:" + test.getSphere(2));
		System.out.println(test.addSphere(sp1));
		System.out.println(test.addSphere(sp2));
		System.out.println(test.addSphere(sp3));
		System.out.println(test.addSphere(sp4));
		System.out.println("Gettotalvolumetest: " + test.getTotalVolume());
		System.out.println("Check2 auf unbefülltle: " + test.getSphere(3));
		System.out.println("Fits?: " + test.sphere1FitsInSphere2(test.getSphere(0), test.getSphere(2)));// Immernoch
																										// null.pointer
																										// error,
																										// wenn
																										// eine
																										// der
																										// abgefragten
																										// Spheren
																										// Null
																										// ist, FIXED!!

	}
}