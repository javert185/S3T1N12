package repository;

import javax.swing.JOptionPane;

import definicioEntitats.Arbre;

public class RetirarArbre {
	
	public static CrearFloristeria retirarArbre(CrearFloristeria floristeria) {
		
		//Preguntem pel nom de l'arbre que es vol retirar
		String nom = JOptionPane.showInputDialog("Quin dels següents arbres vols retirar?\n" + mostrarArbres(floristeria));
		
		//Mirem si l'arbre existeix i si existeix guardem el valor
		boolean trobat = false;
		Arbre arbre_retirat = null;
		
		for(Arbre arbre: floristeria.arbres.keySet()) {
			if(arbre.getNom().equalsIgnoreCase(nom)) {
				arbre_retirat = arbre;
				System.out.println("S'ha retirat l'arbre " + nom + " del catàleg");
				trobat = true;
			}
		}
		
		//Retirem el valor del HashMap
		floristeria.arbres.remove(arbre_retirat);
		
		if(!trobat){
			System.out.println("No s'ha trobat l'arbre " + nom + " al catàleg");
		}
		
		return floristeria;
	}
	
	public static String mostrarArbres(CrearFloristeria floristeria) {
		
		String llista = "";
		
		for (Arbre arbre : floristeria.arbres.keySet()) {
			llista = llista + arbre.getNom() + "\n";
		}
		return llista;
	}
}