
public class Cube {
int Seitenlänge=0;
	public int getSide(){
		return Seitenlänge;
	}
	public void setSide(int _side){
		Seitenlänge=_side;
	}
	
	public int getCubeVolume(){
		return Seitenlänge*Seitenlänge*Seitenlänge;
	}
	public static void main(String[] args) {
		Cube test= new Cube();
		test.setSide(5);
		System.out.println(test.getCubeVolume());

	}

}