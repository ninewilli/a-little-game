import java.awt.*;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class picture {
    int end_play = 0;
    int people_x = 0;
    int people_y = 200;
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
    public Image boom_l5 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("emeny.png"));
    public Image boom_l6 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("emeny.png"));
    public Image boom_l7 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("emeny.png"));
    public Image boom_l8 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("emeny.png"));
    public Image boom_l9 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("emeny.png"));
    public Image boom_l_break = Toolkit.getDefaultToolkit().getImage(getClass().getResource("boom.png"));
    public Image died = Toolkit.getDefaultToolkit().getImage(getClass().getResource("change.png"));
    public Image beact = Toolkit.getDefaultToolkit().getImage(getClass().getResource("beact.png"));
    public Image act = Toolkit.getDefaultToolkit().getImage(getClass().getResource("act1.png"));
    public Image sp_bee = Toolkit.getDefaultToolkit().getImage(getClass().getResource("bee2.png"));
    class Mycanvas_picture extends Canvas{
        public void paint(Graphics g){
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
                ig.drawImage(flying,bee_x,bee_y,200,200,this);
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
                else if(enemy_state == 3){
                    ig.drawImage(sp_bee,emeny_l_x1,emeny_l_y1,100,100,this);
                }
                else{
                    ig.drawImage(boom_l2,emeny_l_x1,emeny_l_y1,100,100,this);
                }
                if(enemy_state2==1){
                    ig.drawImage(boom_l_break,emeny_l_x2,emeny_l_y2,100,100,this);
                }
                else if(enemy_state == 3){
                    ig.drawImage(sp_bee,emeny_l_x2,emeny_l_y2,100,100,this);
                }
                else{
                    ig.drawImage(boom_l3,emeny_l_x2,emeny_l_y2,100,100,this);
                }
                if(enemy_state3==1){
                    ig.drawImage(boom_l_break,emeny_l_x3,emeny_l_y3,100,100,this);
                }
                else if(enemy_state == 3){
                    ig.drawImage(sp_bee,emeny_l_x3,emeny_l_y3,100,100,this);
                }
                else{
                    ig.drawImage(boom_l4,emeny_l_x3,emeny_l_y3,100,100,this);
                }
                if(enemy_state4==1){
                    ig.drawImage(boom_l_break,emeny_l_x4,emeny_l_y4,100,100,this);
                }
                else if(enemy_state == 3){
                    ig.drawImage(sp_bee,emeny_l_x4,emeny_l_y4,100,100,this);
                }
                else{
                    ig.drawImage(boom_l5,emeny_l_x4,emeny_l_y4,100,100,this);
                }
                if(enemy_state5==1){
                    ig.drawImage(boom_l_break,emeny_l_x5,emeny_l_y5,100,100,this);
                }
                else if(enemy_state == 3){
                    ig.drawImage(sp_bee,emeny_l_x5,emeny_l_y5,100,100,this);
                }
                else{
                    ig.drawImage(boom_l6,emeny_l_x5,emeny_l_y5,100,100,this);
                }
                if(enemy_state6==1){
                    ig.drawImage(boom_l_break,emeny_l_x6,emeny_l_y6,100,100,this);
                }
                else if(enemy_state == 3){
                    ig.drawImage(sp_bee,emeny_l_x6,emeny_l_y6,100,100,this);
                }
                else{
                    ig.drawImage(boom_l7,emeny_l_x6,emeny_l_y6,100,100,this);
                }
                if(enemy_state7==1){
                    ig.drawImage(boom_l_break,emeny_l_x7,emeny_l_y7,100,100,this);
                }
                else if(enemy_state == 3){
                    ig.drawImage(sp_bee,emeny_l_x7,emeny_l_y7,100,100,this);
                }
                else{
                    ig.drawImage(boom_l8,emeny_l_x7,emeny_l_y7,100,100,this);
                }
                if(enemy_state8==1){
                    ig.drawImage(boom_l_break,emeny_l_x8,emeny_l_y8,100,100,this);
                }
                else if(enemy_state == 3){
                    ig.drawImage(sp_bee,emeny_l_x8,emeny_l_y8,100,100,this);
                }
                else{
                    ig.drawImage(boom_l9,emeny_l_x8,emeny_l_y8,100,100,this);
                }
                if(enemy_state9==1){
                    ig.drawImage(boom_l_break,emeny_l_x9,emeny_l_y8,100,100,this);
                }
                else if(enemy_state == 3){
                    ig.drawImage(sp_bee,emeny_l_x9,emeny_l_y8,100,100,this);
                }
                else{
                    ig.drawImage(boom_l9,emeny_l_x9,emeny_l_y8,100,100,this);
                }
                if(enemy_state10==1){
                    ig.drawImage(boom_l_break,emeny_l_x10,emeny_l_y8,100,100,this);
                }
                else if(enemy_state == 3){
                    ig.drawImage(sp_bee,emeny_l_x10,emeny_l_y8,100,100,this);
                }
                else{
                    ig.drawImage(boom_l9,emeny_l_x10,emeny_l_y8,100,100,this);
                }
                if(enemy_state11==1){
                    ig.drawImage(boom_l_break,emeny_l_x11,emeny_l_y8,100,100,this);
                }
                else if(enemy_state == 3){
                    ig.drawImage(sp_bee,emeny_l_x11,emeny_l_y8,100,100,this);
                }
                else{
                    ig.drawImage(boom_l9,emeny_l_x11,emeny_l_y8,100,100,this);
                }
            }
        }
    }
}
