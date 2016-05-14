
public class EinheitsMatrix {
	public static int groesse = -3;
	public static void main(String[] args) {
		if (groesse < 1) {
			System.out.println("Error: Die Größe der EinheitsMatrix darf nicht kleiner 1 sein.");
		} else {
			int[][] Matrix = new int[groesse][groesse];
			for (int i = 0; i < Matrix.length; i++) {
				for (int j = 0; j < Matrix[i].length; j++) {
					if (i == j) {
						System.out.print(1);
					} else {
						System.out.print(0);
					}
				}
				System.out.println();
			}

		}

	}
}
