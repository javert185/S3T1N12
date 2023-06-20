package repository;

import javax.swing.JOptionPane;
import definicioEntitats.Flor;

public class RetirarFlor {
	
	public static CrearFloristeria retirarFlor(CrearFloristeria floristeria) {
		
		//Preguntem pel nom de l'arbre que es vol retirar
		String nom = JOptionPane.showInputDialog("Quin de les següents flors vols retirar?\n" + mostrarFlors(floristeria));
		
		//Mirem si l'arbre existeix
		boolean trobat = false;
		Flor retirar_flor = null;
		
		for(Flor flor: floristeria.flors.keySet()) {
			if(flor.getNom().equalsIgnoreCase(nom)) {
				retirar_flor = flor;
				System.out.println("S'ha retirat la flor " + nom + " del catàleg");
				trobat = true;
			}
		}
		
		floristeria.flors.remove(retirar_flor);
		
		if(!trobat){
			System.out.println("No s'ha trobat la flor " + nom + " al catàleg");
		}
		return floristeria;
	}
	
	public static String mostrarFlors(CrearFloristeria floristeria) {
		
		String llista = "";
		
		for (Flor flor : floristeria.flors.keySet()) {
			llista = llista + flor.getNom() + "\n";
		}
		return llista;
	}
}