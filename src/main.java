import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
public class main {
    private static Thread t;
    public static void main(String[] args) throws IOException {
        GUI g = new GUI();
        t=new Thread(new Runnable(){
            public void run(){
                g.begin();
            }
        });
        t.start();
    }
}
