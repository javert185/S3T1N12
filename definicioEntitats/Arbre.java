package definicioEntitats;

public class Arbre {
	
	private String nom;
	private double alçada;
	private double preu;
	
	public Arbre(String nom, double alçada, double preu) {
		this.nom = nom;
		this.alçada = alçada;
		this.preu = preu;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setAlçada(int alçada) {
		this.alçada = alçada;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}
		
	public String getNom() {
		return nom;
	}

	public double getAlçada() {
		return alçada;
	}
	
	public double getPreu() {
		return preu;
	}	
}
