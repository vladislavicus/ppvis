package com.example.helloworld;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;




/**
 * Created by Влад on 09.02.2016.
 */
public class Class1 implements ActionListener {

    JTextField jtf;
    JButton but;
    JFrame jfrm;
    JComboBox cbox;
    String[] items = {" ",
    };
    int i = 0;
    Class1() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        jfrm = new JFrame("Simply program");
        jfrm.setLayout(new GridLayout(3, 1));
        jfrm.setSize(200, 200);
        jfrm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        cbox = new JComboBox(items);
        jtf = new JTextField();
        but = new JButton("push me");
        but.setActionCommand("push me");
        jfrm.add(jtf);
        jfrm.add(but);
        jfrm.add(cbox);

        but.addActionListener(this);
        cbox.removeItemAt(0);

        jfrm.setLocationRelativeTo(null);
        jfrm.setVisible(true);


    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getActionCommand().equals("push me")) {
            String asd;
            String newItem = jtf.getText();
            for(int i=0;i<cbox.getItemCount();i++){
                asd=(String)cbox.getItemAt(i);
                if(asd.equals(newItem)){
                    JOptionPane.showMessageDialog(null, "Cant add repeat word");;
                    return;
                }
            }
            cbox.addItem(newItem);
        }
    }
}