
public class Sphere {
	//Instanzvar.
	double r;
	//Konstruktor
public Sphere (double _radius){
	r=_radius;
}
//GETTERS
public double getRadius(){
	return r;
}
public double getVolume(){
	return (4/3)*Math.PI*Math.pow(r, 3);
}
	public static void main(String[] args) {
		

	}

}