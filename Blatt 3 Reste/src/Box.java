
public class Box {
//Variablendeklaration
 int l=0;
 int w=0;
 int h=0;
 //Methodendeklaration getters
 public int getLength(){
	 return l;
 }
 public int getWidth(){
	 return w;
 }
 public int getHeight(){
	 return h;
 }
 public int getVolume(){
	 return w*h*l;
 }
 //Methodendeklaration Setters
 public void setLength (int _length){
	 l=_length;
 }
 public void setWidth (int _width){
	 w=_width;
 }
 public void setHeight (int _height){
	 h=_height;
 }
	public static void main(String[] args) {
		//Test der setters und Getters
		Box test= new Box();
		test.setHeight(2);
		test.setLength(4);
		test.setWidth(5);
		System.out.println("Höhe der Test-Box: "+test.getHeight());
		System.out.println("Breite der Test-Box: "+test.getWidth());
		System.out.println("Länge der Test-Box: "+test.getLength());
		System.out.println(test.getVolume());
	}

}