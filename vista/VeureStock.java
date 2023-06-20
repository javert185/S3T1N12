package vista;

import repository.CrearFloristeria;

public class VeureStock {

    public static String captureOutput(CrearFloristeria floristeria) {
        StringBuilder outputBuilder = new StringBuilder();

        // Imprimim per pantalla dels arbres, flors i decoracions
        outputBuilder.append("Arbres:\n");
        floristeria.arbres.keySet().forEach(arbre -> {
            outputBuilder.append("  -").append(arbre.getNom()).append("\n");
        });

        outputBuilder.append("Flors:\n");
        floristeria.flors.keySet().forEach(flor -> {
            outputBuilder.append("  -").append(flor.getNom()).append("\n");
        });

        outputBuilder.append("Decoracions:\n");
        floristeria.decoracions.keySet().forEach(decoracio -> {
            outputBuilder.append("  -").append(decoracio.getNom()).append("\n");
        });

        return outputBuilder.toString();
    }

    public static void veureStock(CrearFloristeria floristeria) {
        String capturedOutput = captureOutput(floristeria);
        //Ho gestionem des d'un fitxer TXT
        System.out.println("S'ha mostrat l'stock en un fitxer TXT");
        FitxerTXT.FitxerTXT(capturedOutput);
    }
}