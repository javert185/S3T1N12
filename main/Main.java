package main;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import java.util.*;
import definicioEntitats.Ticket;
import repository.AfegirArbre;
import repository.AfegirDecoracio;
import repository.AfegirFlor;
import repository.CrearFloristeria;
import repository.CrearTickets;
import repository.RetirarArbre;
import repository.RetirarFlor;
import repository.RetirarDecoracio;
import vista.DinersGuanyats;
import vista.MostrarCompres;
import vista.ValorTotal;
import vista.VeureStock;
import vista.VeureStockQuantitats;

public class Main {

	public static void main(String[] args) {

		//Creem una floristeria i els tickets
		CrearFloristeria floristeria = null;
		CrearTickets tickets = null;
		
		//Mirem que l'usuari introdueixi bé els inputs
		boolean crearFloristeria = false;
		boolean crearTickets = false;
		
		//Creem el fitxer

		//Fem gestions sempre i quan l'usuari ho vulgui
		while (gestionar()) {

			//Mostrem el menu
			String gestio = JOptionPane.showInputDialog(menu());

			//Mirem si s'ha introduit un número vàlid
			Integer numero = null;

			try {
				numero = Integer.parseInt(gestio);											
			} catch(Exception e) {
				System.out.println("No s'ha introduit un número");
				continue;
			}

			if (numero < 1 || numero > 13) {
				System.out.println("El número introduit no és vàlid");	
				continue;
			}
			
			//Mirem que l'usuari introdueixi bé el número
			if (numero == 1) {
				crearFloristeria = true;
			}
			
			if (crearFloristeria == false) {
				System.out.println("Recorda que per fer alguna gestió, primer has de crear la Floristeria (tecla 1)");	
				continue;
			}
			
			if (numero == 11) {
				crearTickets = true;
			}
			
			if ((numero == 12 || numero == 13) && crearTickets == false ) {
				System.out.println("Per fer aquesta gestió, primer cal crear els tickets (tecla 10)");	
				continue;
			}			

			//Assignem les gestions
			switch(numero) {
			case 1:
				floristeria = CrearFloristeria.novaFloristeria();
				break;
			case 2:
				AfegirArbre.afegirArbre(floristeria);
				break;
			case 3:
				AfegirFlor.afegirFlor(floristeria);
				break;
			case 4:
				AfegirDecoracio.afegirDecoracio(floristeria);
				break;
			case 5:
				VeureStock.veureStock(floristeria);
				break;
			case 6:
				RetirarArbre.retirarArbre(floristeria);
				break;
			case 7:
				RetirarFlor.retirarFlor(floristeria);
				break;
			case 8:
				RetirarDecoracio.retirarDecoracio(floristeria);
				break;
			case 9:
				VeureStockQuantitats.veureStockQuantitats(floristeria);
				break;
			case 10:
				ValorTotal.valorTotal(floristeria);
				break;
			case 11:
				tickets = CrearTickets.nousTickets(floristeria);
				break;
			case 12:
				MostrarCompres.mostrarCompres(tickets);
				break;
			case 13:
				DinersGuanyats.dinersGuanyats(tickets);
				break;
			}	
		}	
		
		System.out.println("Fins la propera!");
	}

	public static boolean gestionar() {

		String gestionar = JOptionPane.showInputDialog("Si vols gestionar la floristeria, introdueix \"si\" ");
		
		if (gestionar == null) {
			System.out.println("Programa finalitzat. Fins la propera!");
			System.exit(0);
		}
		if (gestionar.equalsIgnoreCase("si")) {
			return true;
		} else {
			return false;
		}
	}

	public static String menu() {

		//Dissenyem el menú
		String menu = "Escull entre les següents opcions introduint el número:\n"
				+ "1.Crear floristeria\n"
				+ "2.Afegir arbre\n"
				+ "3.Afegir flor\n"
				+ "4.Afegir decoració\n"
				+ "5.Veure l'stock\n"
				+ "6.Retirar arbre\n"
				+ "7.Retirar flor\n"
				+ "8.Retirar decoració\n"
				+ "9.Veure stock amb quantitats\n"
				+ "10.Veure el valor total\n"
				+ "11.Crear tickets de compra\n"
				+ "12.Mostrar una llista de compres antigues\n"
				+ "13.Visualitzar els diners guanyats per les vendes\n";
		return menu;
	}
}