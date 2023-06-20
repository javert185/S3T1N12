package vista;
import java.util.HashMap;
import java.util.Map;

import definicioEntitats.Arbre;
import definicioEntitats.Decoracio;
import definicioEntitats.Flor;
import repository.CrearTickets;

public class MostrarCompres {

    public static String captureOutput(CrearTickets compres) {
        StringBuilder outputBuilder = new StringBuilder();

        // Mostrem les compres
        for (int i = 0; i < compres.tickets.size(); i++) {
            outputBuilder.append("Ticket de compra nº").append(compres.tickets.get(i).getNum()).append("\n");
            HashMap<Object, Integer> hash = new HashMap<>();
            hash = (HashMap<Object, Integer>) ((Object) compres.tickets.get(i).getCompra());

            for (Map.Entry<Object, Integer> entry : hash.entrySet()) {
                Object objecte = entry.getKey();
                if (objecte instanceof Arbre) {
                    Arbre key = (Arbre) entry.getKey();
                    int value = entry.getValue();
                    outputBuilder.append("  -").append(key.getNom()).append(":").append(value).append("\n");
                } else if (objecte instanceof Flor) {
                    Flor key = (Flor) entry.getKey();
                    int value = entry.getValue();
                    outputBuilder.append("  -").append(key.getNom()).append(":").append(value).append("\n");
                } else if (objecte instanceof Decoracio) {
                    Decoracio key = (Decoracio) entry.getKey();
                    int value = entry.getValue();
                    outputBuilder.append("  -").append(key.getNom()).append(":").append(value).append("\n");
                }
            }
        }

        return outputBuilder.toString();
    }

    public static void mostrarCompres(CrearTickets compres) {
        String capturedOutput = captureOutput(compres);
      //Ho gestionem des d'un fitxer TXT
      System.out.println("S'han mostrat les compres en un fitxer TXT");
      FitxerTXT.FitxerTXT(capturedOutput);
    }
}