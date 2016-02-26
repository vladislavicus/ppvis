package com.example.helloworld;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;




/**
 * Created by Влад on 09.02.2016.
 */
class Class4 implements ActionListener {
    JCheckBox jch1;
    JCheckBox jch2;
    JCheckBox jch3;
    JTextField jtf;
    JButton but;

    Class4() {
        JFrame jfrm = new JFrame("HELLO");
        JFrame.setDefaultLookAndFeelDecorated(true);
        jfrm.setLayout(new GridLayout(5,1));
        jfrm.setSize(200, 200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setVisible(true);
        jfrm.setLocationRelativeTo(null);

        //ImageIcon icon = new ImageIcon("images/jj.gif");????????????????

        jtf=new JTextField();

        jch1=new JCheckBox("football");
        jch2=new JCheckBox("tenis");
        jch3=new JCheckBox("pool");
        but=new JButton("push me");

        jfrm.add(jtf);
        jfrm.add(but);
        jfrm.add(jch1);
        jfrm.add(jch2);
        jfrm.add(jch3);

        but.addActionListener(this);
        jtf.addActionListener(this);
    }


    public void actionPerformed (ActionEvent ae) {

        //JCheckBox jch=(JCheckBox) ie.getItem();
        if (ae.getActionCommand().equals("push me")) {
            if (jtf.getText().equals(jch1.getText()))
                jch1.setSelected(true);
            else
            if (jtf.getText().equals(jch2.getText()))
                jch2.setSelected(true);
            else
            if (jtf.getText().equals(jch3.getText()))
                jch3.setSelected(true);
            else JOptionPane.showMessageDialog(null, "Cant search such word");
        }




    }
}