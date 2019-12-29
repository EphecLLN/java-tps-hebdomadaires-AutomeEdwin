
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class gui extends JFrame implements ActionListener {
    private JButton swap, fermer;

    public gui(){
        super("GUI TP8");

        JPanel pan = new JPanel();
        pan.setLayout(new BorderLayout());

        swap = new JButton("SWAP");//Bouton SWAP
        swap.addActionListener(this);
        pan.add(swap, BorderLayout.NORTH);

        fermer = new JButton("FERMER"); //Bouton FERMER
        fermer.addActionListener(this);
        pan.add(fermer, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pan);
        pack();
        setVisible(true);
    }

    public static void main(String[] args){
        new gui();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == swap){
            if(swap.getText() == "swap" && fermer.getText() == "fermer"){
                swap.setText("fermer");
                fermer.setText("swap");
            } else {
                swap.setText("swap");
                fermer.setText("fermer");
            }
        } else if (e.getSource() == fermer){
            System.exit(0);
        }
    }

}