
public class LoopsConditions {

	public static void main(String[] args) {
for (int i = 0; i < 100; i++) {
	if(i%2==0){
		System.out.println("Der angegebene Index "+i+" ist gerade.");
	}
	else{
		System.out.println("Der angegebene Index "+ i+" ist ungerade.");
	}
	i=i+2;
}
	}

}
