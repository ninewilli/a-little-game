import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class play {
    Frame fr = new Frame();
    picture p = new picture();
    String fileName = "C:\\Users\\无想\\Desktop\\nlp\\game\\src\\newFile4.txt";
    File file = new File(fileName);
    int num1 = 0;
    int num2 = 0;
    private static Thread t;
    private Button btn1 = new Button();
    Random ra = new Random();
    int k1 = 0;
    int k2 = 0;
    int k3 = 0;
    int k4 = 0;
    int speed_x = 5;
    int speed_y = 2;
    String s = "";
    ArrayList<Character> ans = new ArrayList<Character>();
    public void picture_move(){
        btn1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_UP){
                    k3 = 1;
                    s+="0 : ";
                    p.drawArea.repaint();
                }
                if(e.getKeyCode() == KeyEvent.VK_DOWN){
                    k4 = 1;
                    s+="0 ; ";
                    p.drawArea.repaint();
                }
                if(e.getKeyCode() == KeyEvent.VK_LEFT){
                    k1 = 1;
                    if(num1==0){
                        ans.add('1');
                        s += "0 1 ";
                    }
                    if(num1==1){
                        ans.add('2');
                        s += "0 2 ";
                    }
                    if(num1==2){
                        ans.add('3');
                        s += "0 3 ";
                    }
                    if(num1==3){
                        ans.add('4');
                        s += "0 4 ";
                    }
                    num1++;
                    p.drawArea.repaint();
                }
                if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                    k2 = 1;
                    if(num2==0){
                        ans.add('5');
                        s += "0 5 ";
                    }
                    if(num2==1){
                        ans.add('6');
                        s += "0 6 ";
                    }
                    if(num2==2){
                        ans.add('7');
                        s+="0 7 ";
                    }
                    if(num2==3){
                        ans.add('8');
                        s+="0 8 ";
                    }
                    num2++;
                    p.drawArea.repaint();
                }

            }
            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }
    ArrayList<Integer> arr = new ArrayList<Integer>();
    public void add_nums(){
        for(int i=0;i<9;i++){
            arr.add(i);
        }
    }
    public void draw(){
        p.drawArea.setPreferredSize(new Dimension(1600,800));
        fr.add(p.drawArea,BorderLayout.NORTH);
        fr.add(btn1,BorderLayout.SOUTH);
        p.drawArea.repaint();
        fr.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    Font font=new Font("宋体",Font.BOLD,36);
    int q_time = 0;
    public void begin(){
        init();
    }
    public void time(){
        int x = 0;
        int x1 = 0;
        int x2 = 0;
        int x3 = 0;
        int x4 = 0;
        int x5 = 0;
        int x6 = 0;
        int x7 = 0;
        while(true){
            try (FileWriter writer = new FileWriter(file,true)) {
                writer.write(s);
            } catch (IOException e) {
                e.printStackTrace();
            }
            s = "";
            try{
                Thread.sleep(5);
            }catch(Exception e){
                e.printStackTrace();
            }
            if(k1==1){
                if(num1 == 0){
                    x = 1;
                }
                else if(num1 == 1){
                    x1 = 1;
                }
                else if(num1 == 2){
                    x2 = 1;
                }
                else if(num1 == 3){
                    x3 = 1;
                }
                if(num1>=3){
                    num1 = 0;
                }
            }
            if(k2==1){
                if(num2 == 0){
                    x4 = 1;
                }
                else if(num2 == 1){
                    x5 = 1;
                }
                else if(num2 == 2){
                    x6 = 1;
                }
                else if(num2 == 3){
                    x7 = 1;
                }
                if(num2>=3){
                    num2 = 0;
                }
            }
            if(x==1){
                p.emeny_l_x -= speed_x;
            }
            if(x1==1){
                p.emeny_l_x1 -= speed_x;
            }
            if(x2==1){
                p.emeny_l_x2 -= speed_x;
            }
            if(x3==1){
                p.emeny_l_x3 -= speed_x;
            }
            if(x4==1){
                p.emeny_l_x4 -= speed_x;
            }
            if(x5==1){
                p.emeny_l_x5 -= speed_x;
            }
            if(x6==1){
                p.emeny_l_x6 -= speed_x;
            }
            if(x7==1){
                p.emeny_l_x7 -= speed_x;
            }
            if(k3==1){
                p.emeny_sp_y1 += speed_y;
            }
            if(k4==1){
                p.emeny_sp_y2 -= speed_y;
            }
            if(p.emeny_l_x<=20){
                k1 = 0;
                x = 0;
                p.emeny_l_x = 1800;
            }
            if(p.emeny_l_x1<=20){
                k1 = 0;
                x1 = 0;
                p.emeny_l_x1 = 1800;
            }
            if(p.emeny_l_x2<=20){
                k1 = 0;
                x2 = 0;
                p.emeny_l_x2 = 1800;
            }
            if(p.emeny_l_x3<=20){
                k1 = 0;
                x3 = 0;
                p.emeny_l_x3 = 1800;
            }
            if(p.emeny_l_x4<=20){
                k2 = 0;
                x4 = 0;
                p.emeny_l_x4 = 1800;
            }
            if(p.emeny_l_x5<=20){
                k2 = 0;
                x5 = 0;
                p.emeny_l_x5 = 1800;
            }
            if(p.emeny_l_x6<=20){
                k2 = 0;
                x6 = 0;
                p.emeny_l_x6 = 1800;
            }
            if(p.emeny_l_x7<=20){
                k2 = 0;
                x7 = 0;
                p.emeny_l_x7 = 1800;
            }
            if(p.emeny_sp_y1>=1000){
                k3 = 0;
                p.emeny_sp_y1 = -200;
            }
            if(p.emeny_sp_y2<=-100){
                k4 = 0;
                p.emeny_sp_y2 = 1000;
            }
            p.drawArea.repaint();
        }
    }
    void testCreateFile4() throws IOException {
        if (file.createNewFile()) {
            System.out.println("创建成功！");
        } else {
            System.out.println("文件已经存在不需要重复创建");
        }

    }
    boolean flag;
    File files;
    public void deleteFile() {
        String sPath = "C:\\Users\\无想\\Desktop\\nlp\\game\\src\\newFile4.txt";
        flag = false;
        files = new File(sPath);
        if (files.isFile() && files.exists()) {
            files.delete();
            flag = true;
        }
    }
    public void init(){
        p.people_x = -200;
        picture_move();
        t=new Thread(new Runnable(){
            public void run(){
                time();
            }
        });
        draw();
        t.start();
        fr.pack();
        fr.setVisible(true);
        deleteFile();
        try {
            testCreateFile4();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
