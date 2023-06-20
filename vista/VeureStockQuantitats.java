package vista;

import definicioEntitats.Arbre;
import definicioEntitats.Decoracio;
import definicioEntitats.Flor;
import repository.CrearFloristeria;

public class VeureStockQuantitats {

    public static String captureOutput(CrearFloristeria floristeria) {
        StringBuilder outputBuilder = new StringBuilder();

        // Imprimim per pantalla dels arbres, flors i decoracions
        outputBuilder.append("Arbres:\n");
        for (Arbre arbre : floristeria.arbres.keySet()) {
            outputBuilder.append("  -").append(arbre.getNom()).append(". Stock: ").append(floristeria.arbres.get(arbre)).append("\n");
        }

        outputBuilder.append("Flors:\n");
        for (Flor flor : floristeria.flors.keySet()) {
            outputBuilder.append("  -").append(flor.getNom()).append(". Stock: ").append(floristeria.flors.get(flor)).append("\n");
        }

        outputBuilder.append("Decoracions:\n");
        for (Decoracio decoracio : floristeria.decoracions.keySet()) {
            outputBuilder.append("  -").append(decoracio.getNom()).append(". Stock: ").append(floristeria.decoracions.get(decoracio)).append("\n");
        }

        return outputBuilder.toString();
    }

    public static void veureStockQuantitats(CrearFloristeria floristeria) {
        String capturedOutput = captureOutput(floristeria);
        // Ho gestionem des d'un fitxer TXT
        System.out.println("S'ha mostrat l'stock amb quantitats en un fitxer TXT");
        FitxerTXT.FitxerTXT(capturedOutput);
    }
}