package definicioEntitats;

public class Flor {
	
	private String nom;
	private String color;
	private double preu;
	
	public Flor(String nom, String color, double preu) {
		this.nom = nom;
		this.color = color;
		this.preu = preu;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}
		
	public String getNom() {
		return nom;
	}

	public String getColor() {
		return color;
	}
	
	public double getPreu() {
		return preu;
	}	
}