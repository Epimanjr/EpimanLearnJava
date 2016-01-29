package file;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Objectif : utiliser nos méthodes d'écriture et de lecture de fichier dans une interface graphique !
 *
 * @class LireEcrireFichier
 * @author Maxime BLAISE
 */
public class LireEcrireFichier {

    /**
     * Méthode principale.
     *
     * @args Arguments.
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Savoir lire et écrire dans un fichier");
        JPanel panel = new JPanel();

        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}
