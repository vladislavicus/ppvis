package com.example.helloworld;//package com.example.helloworld;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.util.*;


/**
 * Created by Влад on 09.02.2016.
 */
class Class2  implements ActionListener {
    JTextField jtf;
    JFrame jfrm;

    JLabel j;
    JButton but1;
    JButton but2;


    Class2() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        jfrm = new JFrame(" A Simply program");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(250, 250);
        jfrm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        but1 = new JButton("button1");
        but2 = new JButton("button2");



        jtf = new JTextField(10);
        //jtf.setActionCommand("button");

        but1.addActionListener(this);
        but2.addActionListener(this);

        jfrm.add(jtf);
        jfrm.add(but1);
        jfrm.add(but2);

        jfrm.setVisible(true);
        jfrm.setLocationRelativeTo(null);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals(but1.getText())) {
            but2.setText(jtf.getText());
        }
        else if(ae.getActionCommand().equals(but2.getText())){
            String s=new String("");
            s=but2.getText();
            but2.setText(but1.getText());
            but1.setText(s);
        }

    }
}
