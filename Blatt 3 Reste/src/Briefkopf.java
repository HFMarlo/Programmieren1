
public class Briefkopf {
public static String generiereAnrede(String vorname, String nachname, String titel, int geschlecht){
	if (geschlecht==1){return "Sehr geehrter Herr  "+ titel+" "+vorname+" "+ nachname+ ","; }
	if ( geschlecht ==2){return "Sehr geehrte Frau "+ titel+" "+vorname+" "+ nachname+ ",";}
	if ( geschlecht ==0){return "Sehr geehrte/r  "+ titel+" "+vorname+" "+ nachname+ ",";}
	return "Geschlecht nicht innerhalb der Parameter.";
}
public static void printAnrede(String vorname, String nachname, String titel, int geschlecht){
	if (geschlecht==1){System.out.println( "Sehr geehrter Herr  "+ titel+" "+vorname+" "+ nachname+ ","); }
	if ( geschlecht ==2){System.out.println("Sehr geehrte Frau "+ titel+" "+vorname+" "+ nachname+ ",");}
	if ( geschlecht ==0){System.out.println("Sehr geehrte/r  "+ titel+" "+vorname+" "+ nachname+ ",");}
	if( geschlecht<0||geschlecht >2){System.out.println("Geschlechtsparamerter auﬂerhalb der Grenzen");}}
	
	public static void main(String[] args) {		
		System.out.println(generiereAnrede("Marlo", "Bareth", "Doktomasterofall", 4));
		printAnrede("Ma","Ba","decoole",4);

	}

}
