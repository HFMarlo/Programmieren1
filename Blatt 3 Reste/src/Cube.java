
public class Cube {
int Seitenlšnge=0;
	public int getSide(){
		return Seitenlšnge;
	}
	public void setSide(int _side){
		Seitenlšnge=_side;
	}
	
	public int getCubeVolume(){
		return Seitenlšnge*Seitenlšnge*Seitenlšnge;
	}
	public static void main(String[] args) {
		Cube test= new Cube();
		test.setSide(5);
		System.out.println(test.getCubeVolume());

	}

}