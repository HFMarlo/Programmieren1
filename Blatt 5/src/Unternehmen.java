
public class Unternehmen {
	// Variablen
	private String firmenname;
	private String firmenstandort;
	private double Kapital;
	private Mitarbeiter[] mitarbeiter;

	// getter und setter automatisch
	public void setFirmenname(String firmenname) {
		this.firmenname = firmenname;
	}

	public String getFirmenname() {
		return firmenname;
	}

	public void setFirenstandort(String firenstandort) {
		this.firmenstandort = firenstandort;
	}

	public double getKapital() {//Ist es notwendig, die Zuschläge der Azubis
		//einzurechnen? bzw deren Gehalt anzupassen
		int gehaelter = 0;
		for (int i = 0; i < mitarbeiter.length; i++) {
			gehaelter += mitarbeiter[i].getGehalt();
		}
		return Kapital - gehaelter;
	}

	public void setMitarbeiter(Mitarbeiter[] mitarbeiter) {
		this.mitarbeiter = mitarbeiter;
	}

	public Mitarbeiter[] getMitarbeiter() {
		return mitarbeiter;
	}

	public int getMitarbeiteranzahl() {
		return mitarbeiter.length;
	}

	public String getUnternehmensdaten() {
		return (firmenname + " in " + firmenstandort);
	}

	public String getFirenstandort() {
		return firmenstandort;
	}

	// Andere setter und getter
	public void setKapital(double kapital) {
		Kapital = kapital;
	}

	public static void main(String[] args) {
		// Unternehmen
		Unternehmen Pizzaservice = new Unternehmen();
		Pizzaservice.setKapital(10000.);
		Pizzaservice.setFirenstandort("Emden");
		Pizzaservice.setFirmenname("Thorsten's Pizzas");

		// Mitarbeiter kann ich auch mit Ausbildern(Zuschlag?!)Testen? ist das notwendig?
		Mitarbeiter m1 = new Mitarbeiter(1, "Arno", "H", "Emden", 800);
		Mitarbeiter m2 = new Mitarbeiter(2, "Holger", "B", "Emden", 1200);
		Mitarbeiter[] Sklaven = new Mitarbeiter[] { m1, m2 };

		// Test
		Pizzaservice.setMitarbeiter(Sklaven);
		System.out.println("Kapital: " + Pizzaservice.getKapital());
		System.out.println(Pizzaservice.getUnternehmensdaten());

	}

}
