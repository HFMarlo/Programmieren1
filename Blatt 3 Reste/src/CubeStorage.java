
public class CubeStorage {
	public void printData(Cube _c) {

		System.out.println("Wenn der Würfel die Seitenlänge " + _c.getSide() + " hat, \ndann beträgt sein Volumen "
				+ _c.getCubeVolume() + " Volumeneinheiten.");
	}

	public static void main(String[] args) {
		CubeStorage abfrage = new CubeStorage();
		Cube gib = new Cube();
		gib.setSide(24);
		abfrage.printData(gib);
	}

}