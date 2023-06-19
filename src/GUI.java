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
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
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
    JButton jbStartUp = null,jbStop = null,jbPlay = null,jbDuo1 = null,jbDuo2 = null;
    Font font=new Font("宋体",Font.BOLD,36);
    Font font1=new Font("宋体",Font.BOLD,100);
    JLabel jt = new JLabel("play game");
    JLabel jt1 = new JLabel("匹配中");
    int begin = 0;
    private int num = 0;
    String s = "1";
    int num1 = 0;
    int num2 = 0;
    int begin1 = 0;
    int begin2 = 0;
    private static Thread ts;
    private static Thread ts1;
    public void plays() throws IOException{
        DatagramSocket ds = new DatagramSocket();
        byte[] bys = s.getBytes();
        int length = bys.length;
        InetAddress address = InetAddress.getByName("10.120.69.168");
        int port = 12000;
        DatagramPacket dp = new DatagramPacket(bys,length,address,port);
        ds.send(dp);
        ds.close();
    }
    public void reserve() throws IOException{
        DatagramSocket ds = new DatagramSocket(12300);
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys,bys.length);
        ds.receive(dp);
        InetAddress address = dp.getAddress();
        byte[] data = dp.getData();
        int length = dp.getLength();
        String ss = new String(bys,0,length);
        num1 = ss.charAt(0) - '0';
        ds.close();
    }
    public void plays1() throws IOException{
        DatagramSocket ds = new DatagramSocket();
        byte[] bys = s.getBytes();
        int length = bys.length;
        InetAddress address = InetAddress.getByName("10.120.69.168");
        int port = 12300;
        DatagramPacket dp = new DatagramPacket(bys,length,address,port);
        ds.send(dp);
        ds.close();
    }
    public void reserve1() throws IOException{
        DatagramSocket ds = new DatagramSocket(12000);
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys,bys.length);
        ds.receive(dp);
        InetAddress address = dp.getAddress();
        byte[] data = dp.getData();
        int length = dp.getLength();
        String ss = new String(bys,0,length);
        num2 = ss.charAt(0) - '0';
        ds.close();
    }
    CardLayout cardLayout=new CardLayout();
    public void beg1(){
        while(true){
            try{
                Thread.sleep(10);
            }catch(Exception e){
                e.printStackTrace();
            }
            if(begin1==1){
                try {
                    reserve();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if(num1==1&&num2==1){
                duoren d1 = null;
                d1 = new duoren();
                d1.people_sizes = 1;
                d1.begin();
                GUI.super.dispose();
                break;
            }
        }
    }
    public void beg2(){
        while(true){
            try{
                Thread.sleep(10);
            }catch(Exception e){
                e.printStackTrace();
            }
            if(begin2==1){
                try {
                    reserve1();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if(num1==1&&num2==1){
                duoren d1 = null;
                d1 = new duoren();
                d1.people_sizes = 2;
                d1.begin();
                GUI.super.dispose();
                break;
            }
        }
    }
    public void begin() {
        ImageIcon titltIcon = new ImageIcon("movement2.png");
        this.setIconImage(titltIcon.getImage());
        bgi = new BackgroundImage();
        bgi.setLayout(null);
        jbStartUp = new JButton("启动");
        jbDuo1 = new JButton("以P1进行多人游戏");
        jbDuo2 = new JButton("以P2进行多人游戏");
        jbPlay = new JButton("写关卡");
        jbStop = new JButton("退出");
        jbStartUp.setContentAreaFilled(false);
        jbDuo1.setContentAreaFilled(false);
        jbDuo2.setContentAreaFilled(false);
        jbPlay.setContentAreaFilled(false);
        jbStop.setContentAreaFilled(false);
        jbStop.setFont(font);
        jbDuo1.setFont(font);
        jbDuo2.setFont(font);
        jbPlay.setFont(font);
        jbStartUp.setFont(font);
        jt.setFont(font1);
        jbStartUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                test t1 = new test();t1.begin();
                GUI.super.dispose();
            }
        });
        jbDuo1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2 = 1;
                begin1 = 1;
                try {
                    plays();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                for(int i=0;i<5;i++){
                    bgi.remove(0);
                }
                jt1.setFont(font1);
                bgi.add(jt1);
                jt1.setBounds(630,200,570,160);
                bgi.repaint();
            }
        });
        jbDuo2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = 1;
                begin2 = 1;
                try {
                    plays1();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                for(int i=0;i<5;i++){
                    bgi.remove(0);
                }
                jt1.setFont(font1);
                bgi.add(jt1);
                jt1.setBounds(630,200,570,160);
                bgi.repaint();
            }
        });
        jbPlay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play p1 = new play();
                p1.begin();
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
        bgi.add(jbDuo1);
        bgi.add(jbDuo2);
        bgi.add(jbPlay);
        bgi.add(jbStop);
        jt.setBounds(550,110,570,160);
        jbStartUp.setBounds(610,310,370,60);
        jbDuo1.setBounds(610,390,370,60);
        jbDuo2.setBounds(610,470,370,60);
        jbPlay.setBounds(610,550,370,60);
        jbStop.setBounds(610,630,370,60);
        ts=new Thread(new Runnable(){
            public void run(){
                beg1();
            }
        });
        ts1=new Thread(new Runnable(){
            public void run(){
                beg2();
            }
        });
        ts.start();
        ts1.start();
        this.add(bgi);
        this.setTitle("游戏");
        this.setSize(1600,800);
        this.setLocation(100,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
}

