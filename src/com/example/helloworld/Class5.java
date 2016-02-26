package com.example.helloworld;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Class5  extends JPanel{
    static int i=0;

    public Class5(){
        super();

        JButton adds = new JButton("push me");
        adds.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("push me")) adds.setText("hello");
            }
        });
        add(adds);
    }

}