import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class test {
        Frame fr = new Frame();
        private Button btn1 = new Button();
        int k = 0;
        int k3 = 0;
        int k4 = 0;
        int k5 = 0;
        int k6 = 0;
        int k7 = 0;
        int k8 = 0;
        int k9 = 0;
        int k10 = 0;
        int k11 = 0;
        int k15 = 0;
        int k16 = 0;
        int k17 = 0;
        int k18 = 0;
        int x_p5;
        int x_p6;
        private int fist_change = 1300;
        private int second_change = 1500;
        private static double x_p1 = 0;
        private static double x_p2 = 0;
        private static double x_p3 = 0;
        private static double x_p4 = 0;
        private static int speed_0 = 0;
        private static int speed_1 = 6;
        private static int speed_2 = 2;
        private static int speed_3 = 3;
        private int change_x = 0;
        private int change_x1 = 0;
        private int change_x2 = 0;
        private int change_x3 = 0;
        private int model_re = 1;
        private int change_x4 = 0;
        private int change_x5 = 0;
        private int change_x6 = 0;
        private int change_x7 = 0;
        private int change_x8 = 0;
        private int change_x9 = 0;
        private int change_x10 = 0;
        private int change_x11 = 0;
        private int change_x15 = 0;
        private int change_x16 = 0;
        private int change_x17 = 0;
        private int change_x18 = 0;
        private static Thread t;
        private static Thread t1;
        private static Thread t2;
        private static Thread t3;
        private static Thread t4;
        private static Thread t5;
        picture p = new picture();
        private int state_demo = 0;
        private int score = 0;
        private int health = 0;
        private int k1 = 0;
        private int k2 = 0;
        private int kk = 0;
        private int kagg = 0;
        private ArrayList<Integer> arr = new ArrayList<Integer>();
        public void test_wa(){
            int q = (p.people_x-p.bee_x)*(p.people_x-p.bee_x) + (p.people_y-p.bee_y)*(p.people_y-p.bee_y);
            if(Math.sqrt(q)<=121){
                p.people_x = 200;
                p.people_y = 200;
                state_demo = 3;
                if(kk==1){
                    health+=1;
                }
                kk=0;
            }
        }
        int q = 0;
        public void move_enemy(){
            int move_s1 = Math.abs(p.emeny_sp_y1 - p.people_y);
            int move_s2 = Math.abs(p.emeny_sp_y2 - p.people_y);
            int move_s3 = Math.abs(p.emeny_sp_y3 - p.people_y);
            int move_s4 = Math.abs(p.emeny_sp_y4 - p.people_y);
            if(q==2){
                if(move_s1<280&&p.emeny_sp_y1 - p.people_y > 0){
                    change_x15 = 1;
                    arr.set(15,0);
                    k15 = 0;
                    score+=100;
                }
                if(move_s2<280&&p.emeny_sp_y2 - p.people_y > 0){
                    change_x16 = 1;
                    arr.set(16,0);
                    k16 = 0;
                    score+=100;
                }
                if(move_s3<280&&p.emeny_sp_y3 - p.people_y > 0){
                    change_x17 = 1;
                    arr.set(17,0);
                    k17 = 0;
                    score+=100;
                }
                if(move_s4<280&&p.emeny_sp_y4 - p.people_y > 0){
                    change_x18 = 1;
                    arr.set(18,0);
                    k18 = 0;
                    score+=100;
                }
            }
            else if(q == 1){
                if(move_s1<280&&p.emeny_sp_y1 - p.people_y < 0){
                    change_x15 = 1;
                    arr.set(15,0);
                    k15 = 0;
                    score+=100;
                }
                if(move_s2<280&&p.emeny_sp_y2 - p.people_y < 0){
                    change_x16 = 1;
                    arr.set(16,0);
                    k16 = 0;
                    score+=100;
                }
                if(move_s3<280&&p.emeny_sp_y3 - p.people_y < 0){
                    change_x17 = 1;
                    arr.set(17,0);
                    k17 = 0;
                    score+=100;
                }
                if(move_s4<280&&p.emeny_sp_y4 - p.people_y < 0){
                    change_x18 = 1;
                    arr.set(18,0);
                    k18 = 0;
                    score+=100;
                }
            }
        }
    public void test_enemy(){
            int q1 = (p.people_x-p.emeny_l_x)*(p.people_x-p.emeny_l_x) + (p.people_y-p.emeny_l_y)*(p.people_y-p.emeny_l_y);
            int q2 = (p.people_x-p.emeny_l_x1)*(p.people_x-p.emeny_l_x1) + (p.people_y-p.emeny_l_y1)*(p.people_y-p.emeny_l_y1);
            int q3 = (p.people_x-p.emeny_l_x2)*(p.people_x-p.emeny_l_x2) + (p.people_y-p.emeny_l_y2)*(p.people_y-p.emeny_l_y2);
            int q4 = (p.people_x-p.emeny_l_x3)*(p.people_x-p.emeny_l_x3) + (p.people_y-p.emeny_l_y3)*(p.people_y-p.emeny_l_y3);
            int q5 = (p.people_x-p.emeny_l_x4)*(p.people_x-p.emeny_l_x4) + (p.people_y-p.emeny_l_y4)*(p.people_y-p.emeny_l_y4);
            int q6 = (p.people_x-p.emeny_l_x5)*(p.people_x-p.emeny_l_x5) + (p.people_y-p.emeny_l_y5)*(p.people_y-p.emeny_l_y5);
            int q7 = (p.people_x-p.emeny_l_x6)*(p.people_x-p.emeny_l_x6) + (p.people_y-p.emeny_l_y6)*(p.people_y-p.emeny_l_y6);
            int q8 = (p.people_x-p.emeny_l_x7)*(p.people_x-p.emeny_l_x7) + (p.people_y-p.emeny_l_y7)*(p.people_y-p.emeny_l_y7);
            int q9 = (p.people_x-p.emeny_l_x8)*(p.people_x-p.emeny_l_x8) + (p.people_y-p.emeny_l_y8)*(p.people_y-p.emeny_l_y8);
            int q10 = (p.people_x-p.emeny_l_x9)*(p.people_x-p.emeny_l_x9) + (p.people_y-p.emeny_l_y8)*(p.people_y-p.emeny_l_y8);
            int q11 = (p.people_x-p.emeny_l_x10)*(p.people_x-p.emeny_l_x10) + (p.people_y-p.emeny_l_y8)*(p.people_y-p.emeny_l_y8);
            int q12 = (p.people_x-p.emeny_l_x11)*(p.people_x-p.emeny_l_x10) + (p.people_y-p.emeny_l_y8)*(p.people_y-p.emeny_l_y8);
        if(p.end_play == 1){
                q1 = Math.abs(p.people_x-p.emeny_l_x);
                q2 = Math.abs(p.people_x-p.emeny_l_x1);
                q3 = Math.abs(p.people_x-p.emeny_l_x2);
                q4 = Math.abs(p.people_x-p.emeny_l_x3);
            }
            if(Math.sqrt(q1)<=121){
                change_x = 1;
                arr.set(1,0);
                k = 0;
                score+=100;
            }
            if(Math.sqrt(q2)<=121){
                change_x1 = 1;
                arr.set(2,0);
                k1 = 0;
                score+=100;
            }
            if(Math.sqrt(q3)<=121){
                change_x2 = 1;
                arr.set(3,0);
                k2 = 0;
                score+=100;
            }
        if(Math.sqrt(q4)<=121){
            change_x3 = 1;
            arr.set(4,0);
            k3 = 0;
            score+=100;
        }
        if(Math.sqrt(q5)<=121){
            change_x4 = 1;
            arr.set(5,0);
            k4 = 0;
            score+=100;
        }
        if(Math.sqrt(q6)<=121){
            change_x5 = 1;
            arr.set(6,0);
            k5 = 0;
            score+=100;
        }
        if(Math.sqrt(q7)<=121){
            change_x6 = 1;
            arr.set(7,0);
            k6 = 0;
            score+=100;
        }
        if(Math.sqrt(q8)<=121){
            change_x7 = 1;
            arr.set(8,0);
            k7 = 0;
            score+=100;
        }
        if(Math.sqrt(q9)<=121){
            change_x8 = 1;
            arr.set(9,0);
            k8 = 0;
            score+=100;
        }
        if(Math.sqrt(q10)<=121){
            change_x9 = 1;
            arr.set(10,0);
            k9 = 0;
            score+=100;
        }
        if(Math.sqrt(q11)<=121){
            change_x10 = 1;
            arr.set(11,0);
            k10 = 0;
            score+=100;
        }
        if(Math.sqrt(q12)<=121){
            change_x11 = 1;
            arr.set(12,0);
            k11 = 0;
            score+=100;
        }
    }
    public void enemy1_move(){
        while(true){
            try{
                Thread.sleep(10);
            }catch(Exception e){
                e.printStackTrace();
            }
            p.end_play = 1;
            if(arr.get(1)==1){
                p.emeny_l_x-=speed_1;
            }
            if(arr.get(2)==1){
                p.emeny_l_x1-=speed_1;
            }
            if(arr.get(3)==1){
                p.emeny_l_x2-=speed_1;
            }
            if(arr.get(4)==1){
                p.emeny_l_x3-=speed_1;
            }
            if(p.emeny_l_x<=10){
                p.emeny_l_x = 1800;
            }
            if(p.emeny_l_x1<=10){
                p.emeny_l_x1 = 1800;
            }
            if(p.emeny_l_x2<=10){
                p.emeny_l_x2 = 1800;
            }
            if(p.emeny_l_x3<=10){
                p.emeny_l_x3 = 1800;
            }
            p.drawArea.repaint();
        }
    }
    public void enemy_move(){
        int k = 0;
        while(true){
            if(model_re == 0){
                break;
            }
            try{
                Thread.sleep(10);
            }catch(Exception e){
                e.printStackTrace();
            }
            if(arr.get(1)==1){
                p.emeny_l_x-=speed_1;
            }
            if(arr.get(2)==1){
                p.emeny_l_x1-=speed_1;
            }
            if(arr.get(3)==1){
                p.emeny_l_x2-=speed_1;
            }
            if(arr.get(4)==1){
                p.emeny_l_x3-=speed_1;
            }
            if(arr.get(5)==1){
                p.emeny_l_x4-=speed_1;
            }
            if(arr.get(6)==1){
                p.emeny_l_x5-=speed_1;
            }
            if(arr.get(7)==1){
                p.emeny_l_x6-=speed_1;
            }
            if(arr.get(8)==1){
                p.emeny_l_x7-=speed_1;
            }
            if(arr.get(9)==1){
                p.emeny_l_x8-=speed_1;
            }
            if(arr.get(10)==1){
                p.emeny_l_x9-=speed_1;
            }
            if(arr.get(11)==1){
                p.emeny_l_x10-=speed_1;
            }
            if(arr.get(12)==1){
                p.emeny_l_x11-=speed_1;
            }
            if(arr.get(15)==1){
                p.emeny_sp_y1+=speed_2;
            }
            if(arr.get(16)==1){
                p.emeny_sp_y2-=speed_2;
            }
            if(arr.get(17)==1){
                p.emeny_sp_y3+=speed_2;
            }
            if(arr.get(18)==1){
                p.emeny_sp_y4-=speed_2;
            }
            if(p.emeny_l_x<=10){
                p.emeny_l_x = 1800;
                arr.set(1,0);
            }
            if(p.emeny_l_x1<=10){
                p.emeny_l_x1 = 1800;
                arr.set(2,0);
            }
            if(p.emeny_l_x2<=10){
                p.emeny_l_x2 = 1800;
                arr.set(3,0);
            }
            if(p.emeny_l_x3<=10){
                p.emeny_l_x3 = 1800;
                arr.set(4,0);
            }
            if(p.emeny_l_x4<=10){
                p.emeny_l_x4 = 1800;
                arr.set(5,0);
            }
            if(p.emeny_l_x5<=10){
                p.emeny_l_x5 = 1800;
                arr.set(6,0);
            }
            if(p.emeny_l_x6<=10){
                p.emeny_l_x6 = 1800;
                arr.set(7,0);
            }
            if(p.emeny_l_x7<=10){
                p.emeny_l_x7 = 1800;
                arr.set(8,0);
            }
            if(p.emeny_l_x8<=10){
                p.emeny_l_x8 = 1800;
                arr.set(9,0);
            }
            if(p.emeny_l_x9<=10){
                p.emeny_l_x9 = 2000;
                arr.set(10,0);
            }
            if(p.emeny_l_x10<=10){
                p.emeny_l_x10 = 2200;
                arr.set(11,0);
            }
            if(p.emeny_l_x11<=10){
                p.emeny_l_x11 = 2400;
                arr.set(12,0);
            }
            if(p.emeny_sp_y1>1200){
                p.emeny_sp_y1 = -200;
                arr.set(15,0);
            }
            if(p.emeny_sp_y2<-200){
                p.emeny_sp_y2 = 900;
                arr.set(16,0);
            }
            if(p.emeny_sp_y3>1200){
                p.emeny_sp_y3 = -200;
                arr.set(17,0);
            }
            if(p.emeny_sp_y4<-200){
                p.emeny_sp_y4 = 900;
                arr.set(18,0);
            }
        }
    }
        public void sp_enemy_move(){
            k=0;
            while(true){
                if(model_re == 2){
                    break;
                }
                try{
                    Thread.sleep(10);
                }catch(Exception e){
                    e.printStackTrace();
                }
                if(k==0){
                    if(arr.get(1)==1){
                        p.emeny_l_x-=speed_1;
                    }
                    if(p.emeny_l_x<=fist_change){
                        k=2;
                    }
                }
                else if(k==1){
                    if(arr.get(1)==1){
                        p.emeny_l_x-=speed_1;
                        p.enemy_state = 2;
                    }
                    if(p.emeny_l_x<=10){
                        p.emeny_l_x=1800;
                        k=0;
                        arr.set(1,0);
                    }
                }
                else if(k==2){
                    if(arr.get(1)==1){
                        p.emeny_l_x+=speed_3;
                        p.enemy_state = 3;
                    }
                    if(p.emeny_l_x>=second_change){
                        k=1;
                    }
                }
                if(k1==0){
                    if(arr.get(2)==1){
                        p.emeny_l_x1-=speed_1;
                    }
                    if(p.emeny_l_x1<=fist_change){
                        k1=2;
                    }
                }
                else if(k1==1){
                    if(arr.get(2)==1){
                        p.emeny_l_x1-=speed_1;
                        p.enemy_state1 = 2;
                    }
                    if(p.emeny_l_x1<=100){
                        p.emeny_l_x1=1800;
                        k1=0;
                        arr.set(2,0);
                    }
                }
                else if(k1==2){
                    if(arr.get(2)==1){
                        p.emeny_l_x1+=speed_3;
                        p.enemy_state = 3;
                    }
                    if(p.emeny_l_x1>=second_change){
                        k1=1;
                    }
                }
                if(k2==0){
                    if(arr.get(3)==1){
                        p.emeny_l_x2-=speed_1;
                    }
                    if(p.emeny_l_x2<=fist_change){
                        k2=2;
                    }
                }
                else if(k2==1){
                    if(arr.get(3)==1){
                        p.emeny_l_x2-=speed_1;
                        p.enemy_state2 = 2;
                    }
                    if(p.emeny_l_x2<=100){
                        p.emeny_l_x2=1800;
                        k2=0;
                        arr.set(3,0);
                    }
                }
                else if(k2==2){
                    if(arr.get(3)==1){
                        p.emeny_l_x2+=speed_2;
                        p.enemy_state2 = 3;
                    }
                    if(p.emeny_l_x2>=second_change){
                        k2=1;
                    }
                }
                if(k3==0){
                    if(arr.get(4)==1){
                        p.emeny_l_x3-=speed_1;
                    }
                    if(p.emeny_l_x3<=fist_change){
                        k3=2;
                    }
                }
                else if(k3==1){
                    if(arr.get(4)==1){
                        p.emeny_l_x3-=speed_1;
                        p.enemy_state3 = 2;
                    }
                    if(p.emeny_l_x3<=100){
                        p.emeny_l_x3=1800;
                        k3=0;
                        arr.set(4,0);
                    }
                }
                else if(k3==2){
                    if(arr.get(4)==1){
                        p.emeny_l_x3+=speed_2;
                        p.enemy_state3 = 3;
                    }
                    if(p.emeny_l_x3>=second_change){
                        k3=1;
                    }
                }
                if(k4==0){
                    if(arr.get(5)==1){
                        p.emeny_l_x4-=speed_1;
                    }
                    if(p.emeny_l_x4<=fist_change){
                        k4=2;
                    }
                }
                else if(k4==1){
                    if(arr.get(5)==1){
                        p.emeny_l_x4-=speed_1;
                        p.enemy_state4 = 2;
                    }
                    if(p.emeny_l_x4<=100){
                        p.emeny_l_x4=1800;
                        k4=0;
                        arr.set(5,0);
                    }
                }
                else if(k4==2){
                    if(arr.get(5)==1){
                        p.emeny_l_x4+=speed_2;
                        p.enemy_state4 = 3;
                    }
                    if(p.emeny_l_x4>=second_change){
                        k4=1;
                    }
                }
                if(k5==0){
                    if(arr.get(6)==1){
                        p.emeny_l_x5-=speed_1;
                    }
                    if(p.emeny_l_x5<=fist_change){
                        k5=2;
                    }
                }
                else if(k5==1){
                    if(arr.get(6)==1){
                        p.emeny_l_x5-=speed_1;
                        p.enemy_state5 = 2;
                    }
                    if(p.emeny_l_x5<=100){
                        p.emeny_l_x5=1800;
                        k5=0;
                        arr.set(6,0);
                    }
                }
                else if(k5==2){
                    if(arr.get(6)==1){
                        p.emeny_l_x5+=speed_2;
                        p.enemy_state5 = 3;
                    }
                    if(p.emeny_l_x5>=second_change){
                        k5=1;
                    }
                }
                if(k6==0){
                    if(arr.get(7)==1){
                        p.emeny_l_x6-=speed_1;
                    }
                    if(p.emeny_l_x6<=fist_change){
                        k6=2;
                    }
                }
                else if(k6==1){
                    if(arr.get(7)==1){
                        p.emeny_l_x6-=speed_1;
                        p.enemy_state6 = 2;
                    }
                    if(p.emeny_l_x6<=100){
                        p.emeny_l_x6=1800;
                        k6=0;
                        arr.set(7,0);
                    }
                }
                else if(k6==2){
                    if(arr.get(7)==1){
                        p.emeny_l_x6+=speed_2;
                        p.enemy_state6 = 3;
                    }
                    if(p.emeny_l_x6>=second_change){
                        k6=1;
                    }
                }
                if(k7==0){
                    if(arr.get(8)==1){
                        p.emeny_l_x7-=speed_1;
                    }
                    if(p.emeny_l_x7<=fist_change){
                        k7=2;
                    }
                }
                else if(k7==1){
                    if(arr.get(8)==1){
                        p.emeny_l_x7-=speed_1;
                        p.enemy_state7 = 2;
                    }
                    if(p.emeny_l_x7<=100){
                        p.emeny_l_x7=1800;
                        k7=0;
                        arr.set(8,0);
                    }
                }
                else if(k7==2){
                    if(arr.get(8)==1){
                        p.emeny_l_x7+=speed_2;
                        p.enemy_state7 = 3;
                    }
                    if(p.emeny_l_x7>=second_change){
                        k7=1;
                    }
                }
                p.drawArea.repaint();
            }
        }
        int move_1 = 0;
        int move_2 = 0;
        int move_3 = 0;
        int move_4 = 0;
        int move_5 = 0;
        int move_6 = 0;
        public void movement(){
            while(true){
                try{
                    Thread.sleep(1);
                }catch(Exception e){
                    e.printStackTrace();
                }
                test_wa();
                if(move_1>=100){
                    x_p1 = 0;
                    move_1 = 0;
                }
                else if(move_2>=100){
                    x_p2 = 0;
                    move_2 = 0;
                }
                if(move_3 >= 150){
                    state_demo = 0;
                    p.people_state = state_demo;
                    move_3 = 0;
                    x_p3 = 0;
                }
                if(move_4 >= 150){
                    state_demo = 0;
                    p.people_state = state_demo;
                    move_4 = 0;
                    x_p4 = 0;
                }
                if(move_5 >= 150){
                    state_demo = 0;
                    p.people_state = state_demo;
                    move_5 = 0;
                    x_p5 = 0;
                }
                if(move_6 >= 150){
                    state_demo = 0;
                    p.people_state = state_demo;
                    move_6 = 0;
                    x_p6 = 0;
                }
                if(x_p3 == 1){
                    state_demo = 1;
                    move_3++;
                }
                if(x_p3 == 1&&move_3 <= 50){
                    state_demo = 4;
                }
                if(x_p4 == 1){
                    state_demo = 1;
                    move_4++;
                }
                if(x_p4 == 1&&move_4 <= 50) {
                    state_demo = 4;
                }
                if(x_p5 == 1){
                    state_demo = 1;
                    move_5++;
                }
                if(x_p5 == 1&&move_5 <= 50){
                    state_demo = 5;
                }
                if(x_p6 == 1){
                    state_demo = 7;
                    move_6++;
                }
                if(x_p6 == 1&&move_6 <= 50){
                    state_demo = 6;
                }
                if(p.people_x<200){
                    try{
                        Thread.sleep(1);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    p.people_x+=1;
                }
                if(x_p1==1){
                    p.people_y-=2;
                    move_1++;
                }
                else if(x_p2==1){
                    p.people_y+=2;
                    move_2++;
                }
                p.drawArea.repaint();
            }
        }
        public void picture_move(){
            btn1.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {

                }
                @Override
                public void keyPressed(KeyEvent e) {
                    if(e.getKeyCode() == KeyEvent.VK_UP){
                        x_p1 = 1;
                        x_p5 = 1;
                        q = 1;
                        move_enemy();
                        p.drawArea.repaint();
                    }
                    if(e.getKeyCode() == KeyEvent.VK_DOWN){
                        x_p2 = 1;
                        x_p6 = 1;
                        q = 2;
                        move_enemy();
                        p.drawArea.repaint();
                    }
                    if(e.getKeyCode() == KeyEvent.VK_LEFT){
                        x_p3 = 1;
                        test_enemy();
                        p.drawArea.repaint();
                    }
                    if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                        x_p4 = 1;
                        test_enemy();
                        p.drawArea.repaint();
                    }
                }
                @Override
                public void keyReleased(KeyEvent e) {

                }
            });
        }
        Random ra = new Random();
    public void duqv(){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream( System.getProperty("user.dir")+"\\src"+"\\test.txt");
            byte[] bytes = new byte[2];
            int readCount = 0;
            while((readCount = fis.read(bytes)) != -1) {
                try{
                    Thread.sleep(1000);
                }catch(Exception e){
                    e.printStackTrace();
                }
                String a = new String(bytes, 0, readCount);
                int ascii = a.charAt(0)-'0';
                if(ascii == 9){
                    int randomt = ra.nextInt(3);
                    p.emeny_l_y8 = randomt*200;
                    arr.set(8,1);
                    arr.set(9,1);
                    arr.set(10,1);
                    arr.set(11,1);
                }
                else{
                    arr.set(ascii, 1);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
        public void obstacle_move(){
            while(true){
                try{
                    Thread.sleep(5);
                }catch(Exception e){
                    e.printStackTrace();
                }
                p.bee_x-=2;
                if(p.bee_x<=10){
                    p.bee_y = ra.nextInt(800);
                    p.bee_x = 1800;
                }
                p.drawArea.repaint();
            }
        }
        public void end(){
             p.have_end = 1;
             p.drawArea.repaint();
             kagg = 1;
        }
    public void obstacle_move1(){
        while(true){
            try{
                Thread.sleep(5);
            }catch(Exception e){
                e.printStackTrace();
            }
            p.back_x-=2;
            if(p.back_x<=10){
                p.back_x = 1800;
            }
            p.back_x1-=3;
            if(p.back_x1<=10){
                p.back_x1 = 1800;
            }
            p.drawArea.repaint();
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
        public void time(){
            while(true){
                p.score = score;
                p.health = health;
                try{
                    Thread.sleep(5);
                }catch(Exception e){
                    e.printStackTrace();
                }
                q_time++;
                p.people_state = state_demo;
                if(q_time%1000 == 500){
                    if(p.people_state!=1){
                        state_demo = 0;
                    }
                    kk=1;
                    if(change_x2==2){
                        p.enemy_state2 = 0;
                        change_x2 = 0;
                        p.emeny_l_x2 = 1800;
                    }
                    if(change_x1==2){
                        p.enemy_state1 = 0;
                        change_x1 = 0;
                        p.emeny_l_x1 = 1800;
                    }
                    if(change_x==2){
                        p.enemy_state = 0;
                        change_x = 0;
                        p.emeny_l_x = 1800;
                    }
                    if(change_x3==2){
                        p.enemy_state3 = 0;
                        change_x3 = 0;
                        p.emeny_l_x3 = 1800;
                    }
                    if(change_x4==2){
                        p.enemy_state4 = 0;
                        change_x4 = 0;
                        p.emeny_l_x4 = 1800;
                    }
                    if(change_x5==2){
                        p.enemy_state5 = 0;
                        change_x5 = 0;
                        p.emeny_l_x5 = 1800;
                    }
                    if(change_x6==2){
                        p.enemy_state6 = 0;
                        change_x6 = 0;
                        p.emeny_l_x6 = 1800;
                    }
                    if(change_x7==2){
                        p.enemy_state7 = 0;
                        change_x7 = 0;
                        p.emeny_l_x7 = 1800;
                    }
                    if(change_x8==2){
                        p.enemy_state8 = 0;
                        change_x8 = 0;
                        p.emeny_l_x8 = 1800;
                    }
                    if(change_x9==2){
                        p.enemy_state9 = 0;
                        change_x9 = 0;
                        p.emeny_l_x9 = 1800;
                    }
                    if(change_x10==2){
                        p.enemy_state10 = 0;
                        change_x10 = 0;
                        p.emeny_l_x10 = 1800;
                    }
                    if(change_x11==2){
                        p.enemy_state11 = 0;
                        change_x11 = 0;
                        p.emeny_l_x11 = 1800;
                    }
                    if(change_x15==2){
                        p.enemy_state12 = 0;
                        change_x15 = 0;
                        p.emeny_sp_y1 = -200;
                    }
                    if(change_x16==2){
                        p.enemy_state13 = 0;
                        change_x16 = 0;
                        p.emeny_sp_y2 = 900;
                    }
                    if(change_x17==2){
                        p.enemy_state14 = 0;
                        change_x17 = 0;
                        p.emeny_sp_y3 = -200;
                    }
                    if(change_x18==2){
                        p.enemy_state15 = 0;
                        change_x18 = 0;
                        p.emeny_sp_y4 = 900;
                    }
                }
                else if(q_time%1000 == 0){
                    if(p.people_state!=1){
                        state_demo = 2;
                    }
                    if(change_x2==2){
                        p.enemy_state2 = 0;
                        change_x2 = 0;
                        p.emeny_l_x2 = 1800;
                    }
                    if(change_x1==2){
                        p.enemy_state1 = 0;
                        change_x1 = 0;
                        p.emeny_l_x1 = 1800;
                    }
                    if(change_x==2){
                        p.enemy_state = 0;
                        change_x = 0;
                        p.emeny_l_x = 1800;
                    }
                    if(change_x3==2){
                        p.enemy_state3 = 0;
                        change_x3 = 0;
                        p.emeny_l_x3 = 1800;
                    }
                    if(change_x4==2){
                        p.enemy_state4 = 0;
                        change_x4 = 0;
                        p.emeny_l_x4 = 1800;
                    }
                    if(change_x5==2){
                        p.enemy_state5 = 0;
                        change_x5 = 0;
                        p.emeny_l_x5 = 1800;
                    }
                    if(change_x6==2){
                        p.enemy_state6 = 0;
                        change_x6 = 0;
                        p.emeny_l_x6 = 1800;
                    }
                    if(change_x7==2){
                        p.enemy_state7 = 0;
                        change_x7 = 0;
                        p.emeny_l_x7 = 1800;
                    }
                    if(change_x8==2){
                        p.enemy_state8 = 0;
                        change_x8 = 0;
                        p.emeny_l_x8 = 1800;
                    }
                    if(change_x9==2){
                        p.enemy_state9 = 0;
                        change_x9 = 0;
                        p.emeny_l_x9 = 1800;
                    }
                    if(change_x10==2){
                        p.enemy_state10 = 0;
                        change_x10 = 0;
                        p.emeny_l_x10 = 1800;
                    }
                    if(change_x11==2){
                        p.enemy_state11 = 0;
                        change_x11 = 0;
                        p.emeny_l_x11 = 1800;
                    }
                    if(change_x15==2){
                        p.enemy_state12 = 0;
                        change_x15 = 0;
                        p.emeny_sp_y1 = -200;
                    }
                    if(change_x16==2){
                        p.enemy_state13 = 0;
                        change_x16 = 0;
                        p.emeny_sp_y2 = 900;
                    }
                    if(change_x17==2){
                        p.enemy_state14 = 0;
                        change_x17 = 0;
                        p.emeny_sp_y3 = -200;
                    }
                    if(change_x18==2){
                        p.enemy_state15 = 0;
                        change_x18 = 0;
                        p.emeny_sp_y4 = 900;
                    }
                    p.drawArea.repaint();
                }
                if(change_x==1){
                    change_x = 2;
                    p.enemy_state = 1;
                }
                if(change_x1==1){
                    change_x1 = 2;
                    p.enemy_state1 = 1;
                }
                if(change_x2==1){
                    change_x2 = 2;
                    p.enemy_state2 = 1;
                }
                if(change_x3==1){
                    change_x3 = 2;
                    p.enemy_state3 = 1;
                }
                if(change_x4==1){
                    change_x4 = 2;
                    p.enemy_state4 = 1;
                }
                if(change_x5==1){
                    change_x5 = 2;
                    p.enemy_state5 = 1;
                }
                if(change_x6==1){
                    change_x6 = 2;
                    p.enemy_state6 = 1;
                }
                if(change_x7==1){
                    change_x7 = 2;
                    p.enemy_state7 = 1;
                }
                if(change_x8==1){
                    change_x8 = 2;
                    p.enemy_state8 = 1;
                }
                if(change_x9==1){
                    change_x9 = 2;
                    p.enemy_state9 = 1;
                }
                if(change_x10==1){
                    change_x10 = 2;
                    p.enemy_state10 = 1;
                }
                if(change_x11==1){
                    change_x11 = 2;
                    p.enemy_state11 = 1;
                }
                if(change_x15==1){
                    change_x15 = 2;
                    p.enemy_state12 = 1;
                }
                if(change_x16==1){
                    change_x16 = 2;
                    p.enemy_state13 = 1;
                }
                if(change_x17==1){
                    change_x17 = 2;
                    p.enemy_state14 = 1;
                }
                if(change_x18==1){
                    change_x18 = 2;
                    p.enemy_state15 = 1;
                }
                p.drawArea.repaint();
                if(q_time==999){
                    speed_1 = 6;
                    speed_2 = 2;
                    speed_3 = 1;
                }
                if(q_time==2000){
                    p.gui_state = 0;
                }
                if(q_time==9999){
                    speed_1 = 6;
                    speed_2 = 3;
                    speed_3 = 4;
                }
                if(q_time==99999){
                    speed_1 = 6;
                    speed_2 = 5;
                    speed_3 = 4;
                }
                if(q_time==99999){
                    model_re = 0;
                }
                if(q_time==199999){
                    model_re = 2;
                }
            }
        }
        public void begin(){
            for(int i=0;i<=20;i++){
                arr.add(0);
            }
            init();
        }
        public void init(){
            p.gui_state = 1;
            picture_move();
            t=new Thread(new Runnable(){
                public void run(){
                   obstacle_move();
                }
            });
            t1=new Thread(new Runnable(){
                public void run(){
                    while(true) {
                        if (model_re == 0) {
                            sp_enemy_move();
                        } else if (model_re == 2) {
                            enemy1_move();
                        } else {
                            enemy_move();
                        }
                    }
                }
            });
            t2=new Thread(new Runnable(){
                public void run(){
                    time();
                }
            });
            t3=new Thread(new Runnable(){
                public void run(){
                    movement();
                }
            });
            t4=new Thread(new Runnable(){
                public void run(){
                    duqv();
                }
            });
            t5=new Thread(new Runnable(){
                public void run(){
                    obstacle_move1();
                }
            });
            draw();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t.start();
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();
            fr.pack();
            fr.setVisible(true);
        }
}