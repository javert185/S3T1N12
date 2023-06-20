package repository;


import definicioEntitats.Arbre;
import definicioEntitats.Flor;
import definicioEntitats.Ticket;
import definicioEntitats.Decoracio;
import java.util.HashMap;

public class CrearFloristeria {
	
	public HashMap<Arbre, Integer> arbres = new HashMap<Arbre, Integer>();
	public HashMap<Flor, Integer> flors = new HashMap<Flor, Integer>();
	public HashMap<Decoracio, Integer> decoracions = new HashMap<Decoracio, Integer>();	
	
		public void afegirStock() {
		
		//Afegim els arbres
		
		arbres.put(new Arbre("Bonsai", 0.8,35), 7);
		arbres.put(new Arbre("Cactus", 0.6, 33.8), 3);
		arbres.put(new Arbre("Olivera", 0.5, 38.7), 14);
		arbres.put(new Arbre("Ficus", 1.3, 86.3), 8);
		arbres.put(new Arbre("Taronger", 1, 43.9), 2);
		arbres.put(new Arbre("Palmera", 1.4, 56.12), 5);
		
		//Afegim les flors
		
		flors.put(new Flor("Lavanda", "Lila", 21.9), 4);
		flors.put(new Flor("Rosa", "Vermella", 17.99), 9);
		flors.put(new Flor("Camèlia", "Rosa", 19.67), 12);
		flors.put(new Flor("Gardènia", "Blanca", 13.4), 11);
		flors.put(new Flor("Gerani", "Rosa", 9.56), 10);
		flors.put(new Flor("Jacint", "Blau", 16.8), 5);
		flors.put(new Flor("Lliri", "Blanc", 12.31), 7);
		flors.put(new Flor("Orquídea", "Rosa", 22.1), 7);
		flors.put(new Flor("Peònia", "Rosa", 26.5), 21);
		flors.put(new Flor("Petúnia", "Multicolor", 25.2), 20);
		flors.put(new Flor("Tulipà", "Multicolor", 32.1), 4);
		flors.put(new Flor("Girasol", "Groc", 8.5), 8);
	
		//Afegim la decoració
		
		decoracions.put(new Decoracio("Fusta", 34), 59);
		decoracions.put(new Decoracio("Plàstic", 18), 31);
	}
	
	public static CrearFloristeria novaFloristeria() {
		
		CrearFloristeria floristeria = new CrearFloristeria();
		floristeria.afegirStock();
		
		System.out.println("S'ha creat la floristeria amb èxit");
		
		return floristeria;
	}
}