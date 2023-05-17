import javax.swing.*;
import java.awt.*;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.*;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.JTextComponent;

class BackgroundImage extends JPanel{
    Image img;

    public BackgroundImage() {
        try {
            img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("back.jpg"));
        }catch(Exception e) {
            e.printStackTrace();
        }
    }


    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(img, 0, 0, 1600, 800, this);
        super.paintChildren(g);
    }
}

public class GUI extends JFrame{
    BackgroundImage bgi = null;
    JButton jbStartUp = null,jbStop = null;
    Font font=new Font("宋体",Font.BOLD,36);
    Font font1=new Font("宋体",Font.BOLD,54);
    JLabel jt = new JLabel("play game");
    int begin = 0;
    private int num = 0;
    public void begin() {
        ImageIcon titltIcon = new ImageIcon("movement2.png");
        this.setIconImage(titltIcon.getImage());
        bgi = new BackgroundImage();
        bgi.setLayout(null);
        jbStartUp = new JButton("启动");
        jbStop = new JButton("退出");
        jbStartUp.setContentAreaFilled(false);
        jbStop.setContentAreaFilled(false);
        jbStop.setFont(font);
        jbStartUp.setFont(font);
        jt.setFont(font1);

        jbStartUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                test t1 = new test();t1.begin();
                GUI.super.dispose();
            }
        });
        jbStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.super.dispose();
            }
        });
        bgi.add(jt);
        bgi.add(jbStartUp);
        bgi.add(jbStop);
        jt.setBounds(650,110,570,160);
        jbStartUp.setBounds(610,310,370,60);
        jbStop.setBounds(610,390,370,60);
        this.add(bgi);
        this.setTitle("游戏");
        this.setSize(1600,800);
        this.setLocation(100,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
}

