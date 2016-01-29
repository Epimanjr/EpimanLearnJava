package file;

import java.util.Scanner;

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
        System.out.println(texte);
        // Ecrire ce texte dans le fichier
        
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
}
