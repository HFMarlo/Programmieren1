
public class Cube {
int Seitenl�nge=0;
	public int getSide(){
		return Seitenl�nge;
	}
	public void setSide(int _side){
		Seitenl�nge=_side;
	}
	
	public int getCubeVolume(){
		return Seitenl�nge*Seitenl�nge*Seitenl�nge;
	}
	public static void main(String[] args) {
		Cube test= new Cube();
		test.setSide(5);
		System.out.println(test.getCubeVolume());

	}

}