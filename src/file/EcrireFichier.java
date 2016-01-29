package file;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Objectif : être capable d'écrire du contenu dans un fichier.
 *
 * @class EcrireFichier
 * @author Maxime BLAISE
 */
public class EcrireFichier {

    /**
     * Méthode principale.
     *
     * @param args Arguments.
     */
    public static void main(String[] args) {
        // Lire du texte au clavier (mode console)
        String texte = demanderTexteAuClavier();
        // System.out.println(texte);
        // Ecrire ce texte dans le fichier
        ecrireDansFichier("file/FileForWrite.txt", texte);
    }

    /**
     * Demande à l'utilisateur d'entrer du texte dans la console.
     *
     * @return Le texte saisi
     */
    public static String demanderTexteAuClavier() {
        // Ouverture du Scanner pour la lecture au clavier
        Scanner sc = new Scanner(System.in);
        // Saisi du texte
        System.out.println("Veuillez saisir le texte que vous souhaitez écrire dans le fichier.\n=>");
        return sc.nextLine();
    }

    /**
     * Méthode qui permet d'écrire dans un fichier.
     *
     * @param cheminVersFichier Chemin vers le fichier dans lequel on va écrire.
     * @param texte Texte que l'on va écrire dedans.
     */
    public static void ecrireDansFichier(String cheminVersFichier, String texte) {
        try {
            // Création d'un Buffer qui permet d'écrire dans un fichier
            PrintWriter pw = new PrintWriter(new FileWriter(cheminVersFichier));
            // Ecriture de notre texte
            pw.print(texte);
            // Fermeture du Buffer
            pw.close();
        } catch(IOException io) {
            System.err.println("Erreur: java n'arrive pas à écrire dans le fichier.");
        }
    }
}
