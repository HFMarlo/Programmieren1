
public class Azubi extends Mitarbeiter{
	//Konstruktor
public Azubi(int _abteilung, String _vorname, String _nachname, String _wohnort, int _gehalt, int _ausbildungsjahr){
	super( _abteilung,_vorname,_nachname, _wohnort,_gehalt);
this.ausbildungsjahr=_ausbildungsjahr;
}

//Variablen
private int ausbildungsjahr;

// Methoden
public String  mitarbeiterToString(){
	return(getVorname()+" "+getName()+":\t "+getWohnort()+", "+getGehalt()+" in Ausbildungsjahr "+ausbildungsjahr+".");
	
}

public String azubidatenToString()	{
	return (getName()+" in Jahr "+ausbildungsjahr+""
			+ " bei einem Gehalt von "+getGehalt()+ 
			"€ in Abteilung "+getAbteilung()); 
}
	public static void main(String[] args) {
		Azubi x1= new Azubi(2, "Martha", "Muster", "Bremen", 210, 2);

				System.out.println(x1.mitarbeiterToString());
				System.out.println(x1.azubidatenToString());
				x1.generiereAbteilung();
	}

}
