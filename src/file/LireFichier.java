package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

/**
 * Objectif : être capable de lire le contenu d'un fichier, le stocker ou bien l'afficher à l'écran !
 *
 * @class LireFichier
 * @author Maxime BLAISE
 */
public class LireFichier {

    /**
     * Méthode principale.
     * Démonstration: Lecture d'un fichier !
     * 
     * @param args Arguments.
     */
    public static void main(String[] args) {
        // Affiche le contenu de notre fichier FileForRead.txt
        afficherLeContenu("file/FileForRead.txt");
    }

    /**
     * Affiche le contenu d'un fichier.
     *
     * @param cheminVersFichier Le chemin vers le fichier.
     */
    public static void afficherLeContenu(String cheminVersFichier) {
        try {
            // Ouverture d'un Buffer de lecture
            BufferedReader br = new BufferedReader(new FileReader(cheminVersFichier));
            // On parcourt chaque ligne, et on affiche !
            while(br.ready()) {
                System.out.println(br.readLine());
            }
            // Fermeture du Buffer
            br.close();
        } catch(FileNotFoundException file) {
            System.err.println("Erreur: le fichier n'a pas été trouvé.");
        } catch(IOException io) {
            System.err.println("Erreur: java n'arrive pas à lire le fichier.");
        }
    }
}
