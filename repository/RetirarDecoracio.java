package repository;

import javax.swing.JOptionPane;
import definicioEntitats.Decoracio;

public class RetirarDecoracio {
	
	public static CrearFloristeria retirarDecoracio(CrearFloristeria floristeria) {
		
		//Preguntem pel nom de l'arbre que es vol retirar
		String nom = JOptionPane.showInputDialog("Quin de les següents decoracions vols retirar?\n" + mostrarDecoracions(floristeria));
		
		//Mirem si l'arbre existeix
		boolean trobat = false;
		Decoracio retirar_decoracio = null;
		
		for(Decoracio decoracio: floristeria.decoracions.keySet()) {
			if(decoracio.getNom().equalsIgnoreCase(nom)) {
				retirar_decoracio = decoracio;
				System.out.println("S'ha retirat la decoracio " + nom + " del catàleg");
				trobat = true;
			}
		}
		
		floristeria.decoracions.remove(retirar_decoracio);
		
		if(!trobat){
			System.out.println("No s'ha trobat la decoracio " + nom + " al catàleg");
		}
		return floristeria;
	}
	
	public static String mostrarDecoracions(CrearFloristeria floristeria) {
		
		String llista = "";
		
		for (Decoracio decoracio : floristeria.decoracions.keySet()) {
			llista = llista + decoracio.getNom() + "\n";
		}
		return llista;
	}
}