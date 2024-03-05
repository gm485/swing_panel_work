//create two JPanels and add them to the content pane

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanelDemo {

    JLabel jlab;
    JButton jbtnAlpha;
    JButton jbtnBeta;

    PanelDemo() {

        //create a new container use border layout
        JFrame jfrm = new JFrame("Use Two JPanels");

        //specify flowlayout manager
        jfrm.getContentPane().setLayout(new FlowLayout());

        jfrm.setSize(210, 210);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create first panel
        JPanel jpnl = new JPanel();
        //set size of first panel
        jpnl.setPreferredSize(new Dimension(100, 100));
        //make the panel opaque
        jpnl.setOpaque(true);

        //add a blue border to the panel
        jpnl.setBorder(
                BorderFactory.createLineBorder(Color.BLUE));

        //create the seconod panel
        JPanel jpnl2 = new JPanel();

        //size of second panel
        jpnl.setPreferredSize(new Dimension(100, 100));

        jpnl2.setOpaque(true);

        jpnl2.setBorder(
                BorderFactory.createLineBorder(Color.RED));

        //create a label
        jlab = new JLabel("Press a button.");

        //two buttons
        jbtnAlpha = new JButton("Alpha");
        jbtnBeta = new JButton("Beta");

        //action listeners for the buttons
        jbtnAlpha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Alpha is pressed");
            }
        });

        jbtnBeta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Beta is pressed");
            }
        });

        //add buttons to the panel
        jpnl.add(jbtnAlpha);
        jpnl.add(jbtnBeta);
        jpnl.add(jlab);

        //add labels to the second JPanel
        jpnl2.add(new JLabel("One"));
        jpnl2.add(new JLabel("Two"));
        jpnl2.add(new JLabel("Three"));

        //add the panels to the frame
        jfrm.getContentPane().add(jpnl);
        jfrm.getContentPane().add(jpnl2);

        //display the frame
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PanelDemo();
            }
        });
    }
}
