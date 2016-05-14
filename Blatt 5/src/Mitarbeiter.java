
public class Mitarbeiter {
	// Konstruktor
	public Mitarbeiter(int _abteilung, String _vorname, String _nachname, String _wohnort, int _gehalt) {
Name=_nachname;
Vorname=_vorname;
Abteilung= _abteilung;
Wohnort=_wohnort;
Gehalt=_gehalt;
	}

	// Variablen
	private String Name;
	private String Vorname;
	private String Wohnort;
	private int Abteilung;
	private int Gehalt;

	// getter
	public String getName() {
		return Name;
	}

	public String getVorname() {
		return Vorname;
	}

	public String getWohnort() {
		return Wohnort;
	}

	public int getAbteilung() {
		return Abteilung;
	}

	public int getGehalt() {
		return Gehalt;
	}
//StringtoString D:
	public String mitarbeiterToString(){
		return (Vorname+" "+Name+":\t "+Wohnort+", "+Gehalt+"€");
	}
	//Abteilungen
	public void generiereAbteilung(){
		if (Abteilung>3||Abteilung<1){
			System.out.println("Abteilungslos");}
		else if (Abteilung==1){
		System.out.println("Management");
			}
		else if (Abteilung==2){
			System.out.println("Produktion");
				}
		else if (Abteilung==3){
			System.out.println("Verpackung");
				}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mitarbeiter m1= new Mitarbeiter(5, "Arno", "H", "Emden", 2500);
	System.out.println(m1.mitarbeiterToString());
	m1.generiereAbteilung();//System.out.println("Abteilung: "+m1.getAbteilung());
	Mitarbeiter m2= new Mitarbeiter(2, "Holger", "B", "Emden", 2500);
	System.out.println(m2.mitarbeiterToString());}

}

