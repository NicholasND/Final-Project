import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameFrame extends JFrame{

    GamePanel panel;

    GameFrame(){
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public void newBall(){

    }

    public void newPaddle(){

    }

    public void paint(Graphics g){

    }

    public void draw(Graphics g){

    }

    public void move(){

    }

    public void checkCollision(){

    }

    public void run(){

    }

    public class AL extends KeyAdapter{
        public void keyPressed(KeyEvent e) {

        }

        public void keyReleased(KeyEvent e){

        }

    }
}
