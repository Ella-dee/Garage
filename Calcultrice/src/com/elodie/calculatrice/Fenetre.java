package com.elodie.calculatrice;

import com.elodie.calculatrice.model.Calcultatrice;
import com.elodie.calculatrice.oberserver.Observateur;
import com.elodie.calculatrice.vue.Bouton;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import static java.awt.Color.red;
/**
 * <b>Fenetre est la classe pour l'affichage de la calculatrice.</b>
 * <p>
 * Les initialisations d'affichage:
 * <ul>
 * <li>le JFrame</li>
 * <li>le corps principal externe de la calculatrice, puis le corps interne:
 * <ol>
 *     <li>l'écran d'affichage</li>
 *     <li>les chiffres</li>
 *     <li>les opérateurs</li>
 *  </li>
 * </ol></li>
 * </ul>
 * <p>
 *     On lie ensuite tout ces différents morceaux d'affichage densemble, regroupé dans le corps principal de la calculatrice.
 * <p>
 *     On initialise ensuilte l'objet calculatrice depuis lequel seront effectué les calculs
 * <p>
 *     On place un écouteur sur notre objet calculatrice, afin de gérer l'affichage en temps réel.
 * </p>
 * @author elojito
 */

public class Fenetre extends JFrame {
    private Calcultatrice calculatrice;

    // Les Panels
    private JPanel wrapper = new JPanel();           // conteneur Fenetre
    private JPanel container = new JPanel();         // conteneur calculatrice
    private JPanel screen = new JPanel();            // conteneur écran d'affichage
    private JPanel operators = new JPanel();         // conteneur colonne des opérateurs
    private JPanel operatorsInside = new JPanel();   // conteneur des opérateurs contenu dans operators
    private JPanel numbers = new JPanel();           // conteneur des boutons chiffres

    //Les Layouts
    GridLayout gridWest = new GridLayout(4, 3, 5, 5); // pour le conteneur numbers
    GridLayout gridEast = new GridLayout(5, 1, 5, 5); // pour le conteneur operators

    // l'écran d'affichage
    private JTextField screened = new JTextField( 18 );
    //Les boutons numbers
    private Bouton b0 = new Bouton("0");
    private Bouton b1 = new Bouton("1");
    private Bouton b2 = new Bouton("2");
    private Bouton b3 = new Bouton("3");
    private Bouton b4 = new Bouton("4");
    private Bouton b5 = new Bouton("5");
    private Bouton b6 = new Bouton("6");
    private Bouton b7 = new Bouton("7");
    private Bouton b8 = new Bouton("8");
    private Bouton b9 = new Bouton("9");
    private Bouton bDot = new Bouton(".");
    private Bouton bEqual = new Bouton("=");
    // Les boutons operators
    private Bouton bCancel = new Bouton("C");
    private Bouton bPlus = new Bouton("+");
    private Bouton bMinus = new Bouton("-");
    private Bouton bMultiply = new Bouton("*");
    private Bouton bDivide = new Bouton("/");

    public Fenetre() {
        //On initialise la JFrame
        this.setTitle("Calculatrice");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setSize(300, 320);
        wrapper.setBackground( Color.white );

        //Init la calculatrice
        Dimension calcSize = new Dimension(270,270);
        container.setPreferredSize(calcSize);
        container.setMaximumSize(calcSize);
        container.setPreferredSize(calcSize);
        container.setMaximumSize(calcSize);
        container.setBackground(Color.white);
        container.setBorder(BorderFactory.createLineBorder(Color.gray, 1, true));
        Border border = container.getBorder();
        Border margin = new EmptyBorder(10,10,10,10);
        container.setBorder(new CompoundBorder(border, margin));
        container.setLayout(new BorderLayout());

        //Ecran d'affichage
        Font police = new Font("Arial", Font.PLAIN, 16);
        Dimension textFieldSize = new Dimension(270, 30);
        screened.setPreferredSize( textFieldSize );
        screened.setFont(police);
        screened.setForeground( Color.black );
        screen.setBackground(Color.white );
        screened.setHorizontalAlignment(JTextField.RIGHT);
        screen.add( screened );
        container.add(screen, BorderLayout.NORTH);

        //Affichage des chiffres
        numbers.setLayout(gridWest);
        numbers.add(b1);
        numbers.add(b2);
        numbers.add(b3);
        numbers.add(b4);
        numbers.add(b5);
        numbers.add(b6);
        numbers.add(b7);
        numbers.add(b8);
        numbers.add(b9);
        numbers.add(b0);
        numbers.add(bDot);
        numbers.add(bEqual);
        container.add(numbers);

        //Affichage des opérateurs sur la droite
        operatorsInside.setLayout(gridEast);
        bCancel.setForeground( red );
        Dimension opSize = new Dimension( 60, 35 );
        bCancel.setPreferredSize( opSize );
        operatorsInside.add(bCancel);
        operatorsInside.add(bPlus);
        operatorsInside.add(bMinus);
        operatorsInside.add(bMultiply);
        operatorsInside.add(bDivide);
        operators.add(operatorsInside);

        container.add(operators, BorderLayout.EAST);
        wrapper.add( container );
        this.setContentPane(wrapper);
        this.setVisible(true);

        //On initialise la calculatrice
        //this.calculatrice = new Calcultatrice();

        //On place un écouteur sur la calculatrice
        /*this.calculatrice.addObservateur(new Observateur() {
                public void update(String screenNumber) {
                    label.setText(screenNumber);
                }
        }
        );*/

//    //On initialise le JLabel
//    Font police = new Font("Arial", Font.TYPE1_FONT, 16);
//        this.label.setFont(police);
//        this.label.setHorizontalAlignment(JLabel.NORTH);
//    //On ajoute le JLabel à la JFrame
//        this.getContentPane().add(this.label, BorderLayout.NORTH);
//        this.setVisible(true);
//       // this.calculatrice.run();
    }
    public static void main(String[] args) {
        Fenetre fen = new Fenetre();
    }
}
