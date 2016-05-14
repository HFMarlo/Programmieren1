
public class Parameter implements IParameter {
	public int[] arr;

	// konstruktor
	public Parameter(int[] _numbers) {
		if (arr == null || arr.length == 0) {
			System.out.println("Error : Kein befülltes Array übergeben!");
		}
		else{arr = _numbers;}
	}

	// Min und Max 
	public void minimalwert() {
		if (arr == null || arr.length == 0) {
			System.out.println("No argument passed");
		} else {
			int verg = arr[0];
			for (int i = 0; i < arr.length; i++) {

				if (arr[i] < verg) {
					verg = arr[i];
				} else
					continue;
			}
			System.out.println("Der kleinste eingegebene Wert ist:" + verg);
		}
	}

	public void maximalwert() {
		if (arr == null || arr.length == 0) {
			System.out.println("No argument passed");
		} else {
			int verg = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > verg) {
					verg = arr[i];
				} else
					continue;
			}
			System.out.println("Der hoechste eingegebene Wert ist:" + verg);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = null; // new int[]{ 0, 1, 2, 34532, 2, 4, 1, -3 };
		Parameter Tescht = new Parameter(test);
		Tescht.minimalwert();
		Tescht.maximalwert();
	}

}
