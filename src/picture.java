import java.awt.*;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class picture {
    int score = 0;
    int health = 0;
    int end_play = 0;
    int people_x = 0;
    int people_y = 200;
    int people2_x = -200;
    int people2_y = -200;
    int have_end = 0;
    int bee_x = 1800;
    int bee_y = 500;
    int boom_x_left = -100;
    int boom_x_right = 100;
    int boom_y_up = -100;
    int boom_y_down = 100;
    int people_state = 0;
    int emeny_l_x = 1800;
    int emeny_l_y = 200;
    int emeny_l_x1 = 1800;
    int emeny_l_y1 = 0;
    int emeny_l_x2 = 1800;
    int emeny_l_y2 = 400;
    int emeny_l_x3 = 1800;
    int emeny_l_y3 = 600;
    int emeny_l_x4 = 1800;
    int emeny_l_y4 = 200;
    int emeny_l_x5 = 1800;
    int emeny_l_y5 = 0;
    int emeny_l_x6 = 1800;
    int emeny_l_y6 = 400;
    int emeny_l_x7 = 1800;
    int emeny_l_y7 = 600;
    int emeny_l_x8 = 1800;
    int emeny_l_y8 = 600;
    int emeny_l_x9 = 2000;
    int emeny_l_x10 = 2200;
    int emeny_l_x11 = 2400;
    int emeny_sp_y1 = -200;
    int emeny_sp_x = 200;
    int emeny_sp_y2 = 900;
    int emeny_sp_y3 = -200;
    int emeny_sp_y4 = 900;
    int people_max = 600;
    int people_min = 0;
    int back_x = 1600;
    int back_y = 600;
    int back_x1 = 1600;
    int back_y1 = 600;
    int enemy_state = 0;
    int enemy_state1 = 0;
    int enemy_state2 = 0;
    int enemy_state3 = 0;
    int enemy_state4 = 0;
    int enemy_state5 = 0;
    int enemy_state6 = 0;
    int enemy_state7 = 0;
    int enemy_state8 = 0;
    int enemy_state9 = 0;
    int enemy_state10 = 0;
    int enemy_state11 = 0;
    int enemy_state12 = 0;
    int enemy_state13 = 0;
    int enemy_state14 = 0;
    int enemy_state15 = 0;
    int people_state1 = 0;
    int chuguai_x = 800;
    int chuguai_y = 100;
    int guizhe_x = 800;
    int guizhe_y = 100;
    Mycanvas_picture drawArea = new Mycanvas_picture();
    Image image = null;
    public Image background1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("movement2.png"));
    public Image people1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("main.png"));
    public Image people2 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("act.png"));
    public Image background = Toolkit.getDefaultToolkit().getImage(getClass().getResource("back.jpg"));
    public Image flying = Toolkit.getDefaultToolkit().getImage(getClass().getResource("be.png"));
    public Image boom_l1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("emeny.png"));
    public Image boom_l2 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("emeny.png"));
    public Image boom_l3 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("emeny.png"));
    public Image boom_l4 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("emeny.png"));
    public Image boom_l5 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("left.png"));
    public Image boom_l6 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("left.png"));
    public Image boom_l7 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("right.png"));
    public Image boom_l8 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("right.png"));
    public Image boom_l9 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("left.png"));
    public Image boom_l10 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("up.png"));
    public Image boom_l11 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("down.png"));
    public Image boom_l12 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("up.png"));
    public Image boom_l13 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("down.png"));
    public Image boom_l_break = Toolkit.getDefaultToolkit().getImage(getClass().getResource("boom.png"));
    public Image died = Toolkit.getDefaultToolkit().getImage(getClass().getResource("change.png"));
    public Image beact = Toolkit.getDefaultToolkit().getImage(getClass().getResource("beact.png"));
    public Image act = Toolkit.getDefaultToolkit().getImage(getClass().getResource("act6.png"));
    public Image sp_bee = Toolkit.getDefaultToolkit().getImage(getClass().getResource("bee2.png"));
    public Image act1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("act1.png"));
    public Image act2 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("act2.png"));
    public Image act3 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("act3.png"));
    public Image act4 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("act4.png"));
    public Image act5 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("act5.png"));
    public Image kuang = Toolkit.getDefaultToolkit().getImage(getClass().getResource("kuang.png"));
    public Image guizhe = Toolkit.getDefaultToolkit().getImage(getClass().getResource("guizhe.png"));
    public Image chuguai = Toolkit.getDefaultToolkit().getImage(getClass().getResource("chuguai.png"));
    public Image heal = Toolkit.getDefaultToolkit().getImage(getClass().getResource("health.png"));
    int gui_state = 0;
    class Mycanvas_picture extends Canvas{
        public void paint(Graphics g){
            String s = String.valueOf(score);
            image=this.createImage(1600, 800);
            Graphics ig=image.getGraphics();
            if(have_end == 1){
                ig.drawImage(died,0,0,1600,800,this);
                g.drawImage(image, 0, 0, null);
            }
            else{
                ig.drawImage(background,0,0,1600,800,this);
                ig.drawImage(background1,back_x,back_y,300,300,this);
                ig.drawImage(background1,back_x1,back_y1,300,300,this);
                if(gui_state==1){
                    ig.drawImage(guizhe,guizhe_x,guizhe_y,500,800,this);
                }
                else if(gui_state==2){
                    ig.drawImage(chuguai,chuguai_x,chuguai_y,500,800,this);
                }
                ig.drawImage(flying,bee_x,bee_y,200,200,this);
                ig.drawImage(kuang,1300,0,300,200,this);
                for(int i=0;i<max(3-health,0);i++){
                    if(gui_state == 2){
                        continue;
                    }
                    ig.drawImage(heal,10+i*50,10,100,100,this);
                }
                ig.setFont(new Font("华文行楷",Font.PLAIN,100));
                ig.setColor(Color.BLACK);
                ig.drawString(s,1400,130);
                draw_people(ig);
                draw_enemy(ig);
                g.drawImage(image, 0, 0, null);
            }
        }
        public void update(Graphics g){
            paint(g);
        }
        public void draw_people(Graphics ig){
            if(people_state == 0){
                ig.drawImage(people1,people_x,max(min(people_max,people_y),people_min),150,200,this);
            }
            else if(people_state == 1){
                ig.drawImage(people2,people_x,max(min(people_max,people_y),people_min),200,200,this);
            }
            else if(people_state == 2){
                ig.drawImage(died,people_x,max(min(people_max,people_y),people_min),150,200,this);
            }
            else if(people_state == 3){
                ig.drawImage(beact,people_x,max(min(people_max,people_y),people_min),150,200,this);
            }
            else if(people_state == 4){
                ig.drawImage(act,people_x,max(min(people_max,people_y),people_min),150,200,this);
            }
            else if(people_state == 5){
                ig.drawImage(act2,people_x,max(min(people_max,people_y),people_min),150,200,this);
            }
            else if(people_state == 6){
                ig.drawImage(act3,people_x,max(min(people_max,people_y),people_min),150,200,this);
            }
            else if(people_state == 7){
                ig.drawImage(act4,people_x,max(min(people_max,people_y),people_min),150,200,this);
            }
            if(people_state1 == 0){
                ig.drawImage(people1,people2_x,max(min(people_max,people2_y),people_min),150,200,this);
            }
            else if(people_state1 == 1){
                ig.drawImage(people2,people2_x,max(min(people_max,people2_y),people_min),200,200,this);
            }
            else if(people_state1 == 2){
                ig.drawImage(died,people2_x,max(min(people_max,people2_y),people_min),150,200,this);
            }
            else if(people_state1 == 3){
                ig.drawImage(beact,people2_x,max(min(people_max,people2_y),people_min),150,200,this);
            }
            else if(people_state1 == 4){
                ig.drawImage(act,people2_x,max(min(people_max,people2_y),people_min),150,200,this);
            }
            else if(people_state1 == 5){
                ig.drawImage(act2,people2_x,max(min(people_max,people2_y),people_min),150,200,this);
            }
            else if(people_state1 == 6){
                ig.drawImage(act3,people2_x,max(min(people_max,people2_y),people_min),150,200,this);
            }
            else if(people_state1 == 7){
                ig.drawImage(act4,people2_x,max(min(people_max,people2_y),people_min),150,200,this);
            }
        }
        public void draw_enemy(Graphics ig){
            if(end_play == 1){
                ig.drawImage(boom_l1,emeny_l_x,emeny_l_y,100,100,this);
                ig.drawImage(boom_l2,emeny_l_x,emeny_l_y1,100,100,this);
                ig.drawImage(boom_l3,emeny_l_x,emeny_l_y2,100,100,this);
                ig.drawImage(boom_l4,emeny_l_x,emeny_l_y3,100,100,this);
                ig.drawImage(boom_l1,emeny_l_x1,emeny_l_y,100,100,this);
                ig.drawImage(boom_l2,emeny_l_x1,emeny_l_y1,100,100,this);
                ig.drawImage(boom_l3,emeny_l_x1,emeny_l_y2,100,100,this);
                ig.drawImage(boom_l4,emeny_l_x1,emeny_l_y3,100,100,this);
                ig.drawImage(boom_l1,emeny_l_x2,emeny_l_y,100,100,this);
                ig.drawImage(boom_l2,emeny_l_x2,emeny_l_y1,100,100,this);
                ig.drawImage(boom_l3,emeny_l_x2,emeny_l_y2,100,100,this);
                ig.drawImage(boom_l4,emeny_l_x2,emeny_l_y3,100,100,this);
                ig.drawImage(boom_l1,emeny_l_x3,emeny_l_y,100,100,this);
                ig.drawImage(boom_l2,emeny_l_x3,emeny_l_y1,100,100,this);
                ig.drawImage(boom_l3,emeny_l_x3,emeny_l_y2,100,100,this);
                ig.drawImage(boom_l4,emeny_l_x3,emeny_l_y3,100,100,this);
            }
            else{
                if(enemy_state==1){
                    ig.drawImage(boom_l_break,emeny_l_x,emeny_l_y,100,100,this);
                }
                else if(enemy_state == 3){
                    ig.drawImage(sp_bee,emeny_l_x,emeny_l_y,100,100,this);
                }
                else{
                    ig.drawImage(boom_l1,emeny_l_x,emeny_l_y,100,100,this);
                }
                if(enemy_state1==1){
                    ig.drawImage(boom_l_break,emeny_l_x1,emeny_l_y1,100,100,this);
                }
                else if(enemy_state1 == 3){
                    ig.drawImage(sp_bee,emeny_l_x1,emeny_l_y1,100,100,this);
                }
                else{
                    ig.drawImage(boom_l2,emeny_l_x1,emeny_l_y1,100,100,this);
                }
                if(enemy_state2==1){
                    ig.drawImage(boom_l_break,emeny_l_x2,emeny_l_y2,100,100,this);
                }
                else if(enemy_state2 == 3){
                    ig.drawImage(sp_bee,emeny_l_x2,emeny_l_y2,100,100,this);
                }
                else{
                    ig.drawImage(boom_l3,emeny_l_x2,emeny_l_y2,100,100,this);
                }
                if(enemy_state3==1){
                    ig.drawImage(boom_l_break,emeny_l_x3,emeny_l_y3,100,100,this);
                }
                else if(enemy_state3 == 3){
                    ig.drawImage(sp_bee,emeny_l_x3,emeny_l_y3,100,100,this);
                }
                else{
                    ig.drawImage(boom_l4,emeny_l_x3,emeny_l_y3,100,100,this);
                }
                if(enemy_state4==1){
                    ig.drawImage(boom_l_break,emeny_l_x4,emeny_l_y4,100,100,this);
                }
                else if(enemy_state4 == 3){
                    ig.drawImage(sp_bee,emeny_l_x4,emeny_l_y4,100,100,this);
                }
                else{
                    ig.drawImage(boom_l5,emeny_l_x4,emeny_l_y4,100,100,this);
                }
                if(enemy_state5==1){
                    ig.drawImage(boom_l_break,emeny_l_x5,emeny_l_y5,100,100,this);
                }
                else if(enemy_state5 == 3){
                    ig.drawImage(sp_bee,emeny_l_x5,emeny_l_y5,100,100,this);
                }
                else{
                    ig.drawImage(boom_l6,emeny_l_x5,emeny_l_y5,100,100,this);
                }
                if(enemy_state6==1){
                    ig.drawImage(boom_l_break,emeny_l_x6,emeny_l_y6,100,100,this);
                }
                else if(enemy_state6 == 3){
                    ig.drawImage(sp_bee,emeny_l_x6,emeny_l_y6,100,100,this);
                }
                else{
                    ig.drawImage(boom_l7,emeny_l_x6,emeny_l_y6,100,100,this);
                }
                if(enemy_state7==1){
                    ig.drawImage(boom_l_break,emeny_l_x7,emeny_l_y7,100,100,this);
                }
                else if(enemy_state7 == 3){
                    ig.drawImage(sp_bee,emeny_l_x7,emeny_l_y7,100,100,this);
                }
                else{
                    ig.drawImage(boom_l8,emeny_l_x7,emeny_l_y7,100,100,this);
                }
                if(enemy_state8==1){
                    ig.drawImage(boom_l_break,emeny_l_x8,emeny_l_y8,100,100,this);
                }
                else if(enemy_state8 == 3){
                    ig.drawImage(sp_bee,emeny_l_x8,emeny_l_y8,100,100,this);
                }
                else{
                    ig.drawImage(boom_l9,emeny_l_x8,emeny_l_y8,100,100,this);
                }
                if(enemy_state9==1){
                    ig.drawImage(boom_l_break,emeny_l_x9,emeny_l_y8,100,100,this);
                }
                else if(enemy_state9 == 3){
                    ig.drawImage(sp_bee,emeny_l_x9,emeny_l_y8,100,100,this);
                }
                else{
                    ig.drawImage(boom_l9,emeny_l_x9,emeny_l_y8,100,100,this);
                }
                if(enemy_state10==1){
                    ig.drawImage(boom_l_break,emeny_l_x10,emeny_l_y8,100,100,this);
                }
                else if(enemy_state10 == 3){
                    ig.drawImage(sp_bee,emeny_l_x10,emeny_l_y8,100,100,this);
                }
                else{
                    ig.drawImage(boom_l9,emeny_l_x10,emeny_l_y8,100,100,this);
                }
                if(enemy_state11==1){
                    ig.drawImage(boom_l_break,emeny_l_x11,emeny_l_y8,100,100,this);
                }
                else if(enemy_state11 == 3){
                    ig.drawImage(sp_bee,emeny_l_x11,emeny_l_y8,100,100,this);
                }
                else{
                    ig.drawImage(boom_l9,emeny_l_x11,emeny_l_y8,100,100,this);
                }
                if(enemy_state12==1){
                    ig.drawImage(boom_l_break,emeny_sp_x,emeny_sp_y1,100,100,this);
                }
                else if(enemy_state12 == 3){

                }
                else{
                    ig.drawImage(boom_l10,emeny_sp_x,emeny_sp_y1,100,100,this);
                }
                if(enemy_state13==1){
                    ig.drawImage(boom_l_break,emeny_sp_x,emeny_sp_y2,100,100,this);
                }
                else if(enemy_state13 == 3){

                }
                else{
                    ig.drawImage(boom_l11,emeny_sp_x,emeny_sp_y2,100,100,this);
                }
                if(enemy_state14==1){
                    ig.drawImage(boom_l_break,emeny_sp_x,emeny_sp_y3,100,100,this);
                }
                else if(enemy_state14 == 3){

                }
                else{
                    ig.drawImage(boom_l12,emeny_sp_x,emeny_sp_y3,100,100,this);
                }
                if(enemy_state15==1){
                    ig.drawImage(boom_l_break,emeny_sp_x,emeny_sp_y4,100,100,this);
                }
                else if(enemy_state15 == 3){

                }
                else{
                    ig.drawImage(boom_l13,emeny_sp_x,emeny_sp_y4,100,100,this);
                }
            }
        }
    }
}
