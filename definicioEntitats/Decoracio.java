package definicioEntitats;

public class Decoracio {

	private String nom;
	private double preu;
	
	public Decoracio(String nom, double preu) {
		this.nom = nom;
		this.preu = preu;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}
			
	public String getNom() {
		return nom;
	}
	
	public double getPreu() {
		return preu;
	}	
}