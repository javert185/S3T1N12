package repository;

import javax.swing.JOptionPane;
import definicioEntitats.Arbre;

public class AfegirArbre {
	
	public static void afegirArbre(CrearFloristeria floristeria){
		
		//Preguntem pel nom de l'arbre, l'alçada, el preu i la quantitat
		String nom = JOptionPane.showInputDialog("Introdueix el nom de l'arbre");
		double alçada = Double.parseDouble(JOptionPane.showInputDialog("Introdueix alçada (en metres separat per un punt)"));
		double preu = Double.parseDouble(JOptionPane.showInputDialog("Introdueix el preu (si cal, separat per un punt)"));
		int quantitat = Integer.parseInt(JOptionPane.showInputDialog("Introdueix la quantitat (si cal, separat per un punt)"));
		
		//Afegim l'arbre a l'array de la floristeria
		floristeria.arbres.put(new Arbre(nom, alçada, preu), quantitat);
		
		System.out.println("S'ha afegit l'arbre amb èxit");
	}
}
