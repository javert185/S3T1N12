package repository;

import javax.swing.JOptionPane;

import definicioEntitats.Flor;

public class AfegirFlor {
	
	public static void afegirFlor(CrearFloristeria floristeria){
		
		//Preguntem pel nom de la flor, el color i el preu
		String nom = JOptionPane.showInputDialog("Introdueix el nom de la flor");
		String color = JOptionPane.showInputDialog("Introdueix el color de la flor");
		Double preu = Double.parseDouble(JOptionPane.showInputDialog("Introdueix el preu (si cal, separat per un punt)"));
		int quantitat = Integer.parseInt(JOptionPane.showInputDialog("Introdueix la quantitat (si cal, separat per un punt)"));
		
		//Afegim la flor a l'array de la floristeria
		floristeria.flors.put(new Flor(nom, color, preu), quantitat);
		
		System.out.println("S'ha afegit la flor amb èxit");
	}
}