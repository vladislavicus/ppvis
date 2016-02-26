package com.example.helloworld;
import javax.swing.*;

import java.awt.*;
import java.net.SocketPermission;
import java.util.Scanner;

/**
 * Created by Влад on 27.12.2015.
 */

public class MainFrame extends JFrame{

    public MainFrame() {

        super("Main frame");
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(200,200);
        Font font = new Font("Verdana", Font.PLAIN, 10);
        JTabbedPane jtp=new JTabbedPane();
        jtp.setFont(font);

        jtp.addTab("1 ",new com.example.helloworld.Class5());
        jtp.addTab("2 ",new com.example.helloworld.Class5());

        add(jtp);
        add(jtp);

        //add(new MainTabbedPane());
        setVisible(true);



    }
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                new MainFrame();

            }
        });


    }
}

