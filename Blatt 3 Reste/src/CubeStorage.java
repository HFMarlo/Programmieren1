
public class CubeStorage {
	public void printData(Cube _c) {

		System.out.println("Wenn der W�rfel die Seitenl�nge " + _c.getSide() + " hat, \ndann betr�gt sein Volumen "
				+ _c.getCubeVolume() + " Volumeneinheiten.");
	}

	public static void main(String[] args) {
		CubeStorage abfrage = new CubeStorage();
		Cube gib = new Cube();
		gib.setSide(24);
		abfrage.printData(gib);
	}

}