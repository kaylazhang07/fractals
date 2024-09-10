/*
Kayla Zhang
Per 3
tree
 */
import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("fractals");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setVisible(true);
        Drawing component = new Drawing();

        frame.add(component);

    }
}

class Drawing extends JComponent{
    public void paintComponent(Graphics g ){
        Graphics2D g2 = (Graphics2D) g;
        printTree(g2);

    }

    public void printTree(Graphics2D g2){
        drawTree(g2, 300, 500,Math.PI/3, 250);
    }

    public void drawTree ( Graphics2D g2, int x, int y, double angle, int height){
        if (height ==0){
            return;
        }

            int x2 = (int) (Math.cos(angle) * height * 10);
            int y2 = (int) (Math.sin(angle) * height * 10);
            g2.setColor(Color.BLACK);
            g2.drawLine(x, y, x2, y2);

            drawTree(g2, x2, y2, angle+(Math.PI/3),height-1);
            drawTree(g2, x2, y2, angle-(Math.PI/3), height-1);

    }

}



