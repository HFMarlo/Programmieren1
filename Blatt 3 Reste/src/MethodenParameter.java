
public class MethodenParameter {
public static void sum10to100 (){
	int a=0;
	for (int i = 10; i < 101; i++) {
		a=a+i;
	}
	System.out.println("Summe(10-100 ist: "+a);
}
public static void sumRange(int start, int stop){
	int a=0;
	for(int i=start; i<(stop+1);i++){
		a=a+i;
	}
	System.out.println("Die Summe ("+start+"-"+stop+") ist: "+a);
}
	public static void main(String[] args) {
		
sumRange(2,3);
	}

}
