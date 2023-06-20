package repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.List;

import definicioEntitats.Arbre;
import definicioEntitats.Decoracio;
import definicioEntitats.Flor;
import definicioEntitats.Ticket;

public class CrearTickets {
	
	public static List<Ticket> tickets = new ArrayList<Ticket>();
	
	@SuppressWarnings("unchecked")
	public void crearTickets(CrearFloristeria floristeria) {
		//Afegim els tickets
		//Ticket1
		HashMap<Object,Integer> ticket1Hash = new HashMap<Object,Integer>();
		ticket1Hash.put(trobarArbre("Bonsai", floristeria), 1);
		ticket1Hash.put(trobarFlor("Lliri", floristeria), 1);
		ticket1Hash.put(trobarFlor("Girasol", floristeria), 2);
		Ticket ticket1 = new Ticket();
		ticket1.setNum(1);
		ticket1.setCompra(ticket1Hash);
		tickets.add(ticket1);
		
		//Ticket 2
		HashMap<Object,Integer> ticket2Hash = new HashMap<Object,Integer>();
		ticket2Hash.put(trobarDecoracio("Fusta", floristeria), 2);
		ticket2Hash.put(trobarFlor("Lavanda", floristeria), 1);
		ticket2Hash.put(trobarFlor("Peònia", floristeria), 2);
		Ticket ticket2 = new Ticket();
		ticket2.setNum(2);
		ticket2.setCompra(ticket2Hash);
		tickets.add(ticket2);
		
		//Ticket 3
		HashMap<Object,Integer> ticket3Hash = new HashMap<Object,Integer>();
		ticket3Hash.put(trobarArbre("Taronger", floristeria), 2);
		Ticket ticket3 = new Ticket();
		ticket3.setNum(3);
		ticket3.setCompra(ticket3Hash);
		tickets.add(ticket3);
		
		//Ticket 4
		HashMap<Object,Integer> ticket4Hash = new HashMap<Object,Integer>();
		ticket4Hash.put(trobarDecoracio("Plàstic", floristeria), 3);
		ticket4Hash.put(trobarFlor("Gerani", floristeria), 1);
		ticket4Hash.put(trobarFlor("Tulipà", floristeria), 2);
		ticket4Hash.put(trobarArbre("Cactus", floristeria), 3);
		ticket4Hash.put(trobarArbre("Palmera", floristeria), 1);
		Ticket ticket4 = new Ticket();
		ticket4.setNum(4);
		ticket4.setCompra(ticket4Hash);
		tickets.add(ticket4);
	
		//Ticket 5		
		HashMap<Object,Integer> ticket5Hash = new HashMap<Object,Integer>();
		ticket5Hash.put(trobarFlor("Jacint", floristeria), 5);
		ticket5Hash.put(trobarFlor("Orquídea", floristeria), 4);
		ticket5Hash.put(trobarFlor("Camèlia", floristeria), 8);
		Ticket ticket5 = new Ticket();
		ticket5.setNum(5);
		ticket5.setCompra(ticket5Hash);
		tickets.add(ticket5);
	}
	
	public static CrearTickets nousTickets(CrearFloristeria floristeria) {
		
		CrearTickets compres = new CrearTickets();
		compres.crearTickets(floristeria);
		
		System.out.println("S'han creat els tickets amb èxit");
		
		return compres;
	}
	
	public static Arbre trobarArbre(String nom, CrearFloristeria floristeria) {
		for(Arbre arbre: floristeria.arbres.keySet()) {
			if(arbre.getNom().equalsIgnoreCase(nom)) {
				return arbre;
			}
		} 
		return null;
	}
	
	public static Flor trobarFlor(String nom, CrearFloristeria floristeria) {
		for(Flor flor: floristeria.flors.keySet()) {
			if(flor.getNom().equalsIgnoreCase(nom)) {
				return flor;
			}
		} 
		return null;
	}
	
	public static Decoracio trobarDecoracio(String nom, CrearFloristeria floristeria) {
		for(Decoracio decoracio: floristeria.decoracions.keySet()) {
			if(decoracio.getNom().equalsIgnoreCase(nom)) {
				return decoracio;
			}
		} 
		return null;
	}
}