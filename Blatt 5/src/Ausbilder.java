
public class Ausbilder extends Mitarbeiter{
	//Konstruktorwahnsinn
public Ausbilder(	int _abteilung, String _vorname, String _nachname, String _wohnort, int _gehalt, String _karrierestatus, int _zuschlag){
	super(_abteilung,  _vorname,  _nachname,  _wohnort,  _gehalt);
Karrierestatus=_karrierestatus;
Zuschlag=_zuschlag;
}
//neue Variablen
private String Karrierestatus;
private int Zuschlag;
private Azubi[] Sklavenliste;
//Methoden
public String getKarrierestatus() {
	return Karrierestatus;
}
public void setGehaltszuschlag(int _zuschlag){
	Zuschlag=_zuschlag;
}
@Override
public int getGehalt(){//soll das so????
	return super.getGehalt()+Zuschlag;
}
//Azubi-schizzel
public void setAzubidaten(Azubi[] _az){
	Sklavenliste=_az;
}
public Azubi[] getAzubidaten(){
	return Sklavenliste;
}
@Override
public String mitarbeiterToString(){
return(getVorname()+" "+getName()+":\t "+getWohnort()+", "+getGehalt()+
		"€ bei einem Zuschlag von "+ Zuschlag+ "€.\n" + Karrierestatus+ " in Abteilung Nummer "+getAbteilung()+".");	
}
public static void main(String[] args) {
		
	Ausbilder m = new Ausbilder(1,"Hans","Mustermann","Jena",5000,"Instructor",500);

	System.out.println(m.mitarbeiterToString()); 
	System.out.println(m.getGehalt());
	System.out.println(m.getGehalt());
	}

	
}
