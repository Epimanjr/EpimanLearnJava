package file;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
        panel.setLayout(new BorderLayout());

        // Ajout des deux boutons pour lire et écrire
        JPanel panelBouton = new JPanel();
        panelBouton.setLayout(new BoxLayout(panelBouton, BoxLayout.LINE_AXIS));
        JButton boutonLireFichier = new JButton("Lire fichier");
        
        JButton boutonEcrireFichier = new JButton("Ecrire dans fichier");
        panelBouton.add(boutonLireFichier);
        panelBouton.add(boutonEcrireFichier);

        // Ajout du champ de texte
        final JTextArea champDeTexte = new JTextArea();
        champDeTexte.setPreferredSize(new Dimension(600,300));

        boutonLireFichier.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    champDeTexte.setText(LireFichier.stockerLeContenu("file/FileForReadWrite.txt"));
                }
            });

        
        boutonEcrireFichier.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    EcrireFichier.ecrireDansFichier("file/FileForReadWrite.txt", champDeTexte.getText());
                }
            });
        
        panel.add(panelBouton, BorderLayout.NORTH);
        panel.add(champDeTexte, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
