
public class BoxStorage {
//int B[]= new B[] ;
public void printData(Box[] _arr){
	for (int i = 0; i < _arr.length; i++) {
		System.out.print("Box "+(i+1)+" : ");
		System.out.print("Länge: "+ _arr[i].getLength());
		System.out.print("\tWeite: "+_arr[i].getWidth());
		System.out.print("\tHöhe: "+_arr[i].getHeight());
		System.out.print("      "+"Volumen: "+ _arr[i].getVolume()+"\n");
	}
}

	// Box
	public Box[] fillBoxArray(int _size) {
		//Die Box[](Boxenstapel) "B" wird deklariert mit der Größe _size
		Box[] Stapel = new Box[_size];
		//im Array wird pro slot eine Box erstellt und zufällig gefüllt
		for (int i = 0; i < Stapel.length; i++) {
			Stapel[i] = new Box();
			Stapel[i].setLength(getRandom());
			Stapel[i].setWidth(getRandom());
			Stapel[i].setHeight(getRandom());
			//System.out.println("Test "+i);
		}
		
		return Stapel ;
	}
	
	// addiert auf a immer das Volumen des einzelnen Würfels drauf
	public int getTotalVolume(Box[] _arr){
		int a=0;
		for (int i = 0; i < _arr.length; i++) {
			a=a+_arr[i].getVolume();
		}
		return a;
	}

	public int getRandom() {
		return ((int) (Math.random() * 10)+1);
	}

	public static void main(String[] args) {
		BoxStorage test=new BoxStorage();
		int q=test.getRandom();
		Box[] B =test.fillBoxArray(q);
		test.printData(B);
		System.out.println("Das gesamte Volumen der Boxen 1-"+q+" beträgt: "+test.getTotalVolume(B)+" Volumeneinheiten.");
	}

}