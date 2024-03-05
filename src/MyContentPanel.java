//create two JPanels and add them to the content pane

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyContentPanel extends JPanel {

    JLabel jlab;
    JButton jbtnRed;
    JButton jbtnBlue;

    MyContentPanel() {
        //make sure the panel is opaque
        setOpaque(true);

        setBorder(BorderFactory.createLineBorder(Color.GREEN));

        jlab = new JLabel("Select Border Color");

        //make two buttons
        jbtnRed = new JButton("Red");
        jbtnBlue = new JButton("Blue");

        //add action listeners
        jbtnRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBorder(BorderFactory.createLineBorder(Color.RED));
            }
        });

        jbtnBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBorder(BorderFactory.createLineBorder(Color.BLUE));
            }
        });

        //add the buttons and lablel to the panel
        add(jbtnRed);
        add(jbtnBlue);
        add(jlab);
    }
}

//create a top-level container and use the panel
//created by MyContentPanel as the content pane
class CustomCPDemo {
    CustomCPDemo()  {
        //Create a new JFrame container. Use the defaulst border layout
        JFrame jfrm = new JFrame("Set the Content Pane");
        //give the frame an initial size
        jfrm.setSize(240, 150);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create an instance of the custom content pane.
        MyContentPanel mcp = new MyContentPanel();

        //make mcp the content pane
        jfrm.setContentPane(mcp);

        //display the frame
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CustomCPDemo();
            }
        });
    }
}
