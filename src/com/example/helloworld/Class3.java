package com.example.helloworld;//package com.example.helloworld;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;


/**
 * Created by Влад on 09.02.2016.
 */
class Class3 implements ActionListener   {
    JTextField jtf;
    JFrame jfrm;

    JLabel j;
    JButton but1;
    JRadioButton rbut1;
    JRadioButton rbut2;
    JRadioButton rbut3;


    Class3() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        jfrm = new JFrame(" A Simply program");
        jfrm.setLayout(new GridLayout(5,1));
        jfrm.setSize(250, 250);
        jfrm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jtf = new JTextField(10);

        rbut1=new JRadioButton("button1");
        rbut2=new JRadioButton("button2");
        rbut3=new JRadioButton("button3");

        but1=new JButton("push me");

        ButtonGroup group=new ButtonGroup();
        group.add(rbut1);
        group.add(rbut2);
        group.add(rbut3);

        jfrm.add(jtf);
        jfrm.add(but1);
        jfrm.add(rbut1);
        jfrm.add(rbut2);
        jfrm.add(rbut3);

        but1.addActionListener(this);
        rbut1.addActionListener(this);
        rbut2.addActionListener(this);
        rbut3.addActionListener(this);

        jfrm.setVisible(true);
        jfrm.setLocationRelativeTo(null);

    }
    public void actionPerformed(ActionEvent ae){
        if (jtf.getText().equals(rbut1.getText()))
            rbut1.setSelected(true);
        else
        if (jtf.getText().equals(rbut2.getText()))
            rbut2.setSelected(true);
        else
        if (jtf.getText().equals(rbut3.getText()))
            rbut3.setSelected(true);
        else JOptionPane.showMessageDialog(null, "Cant search such word");
    }

}