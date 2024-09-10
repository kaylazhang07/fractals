/*
Kayla Zhang
Per 3
Tree
 */


import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Fractals");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setVisible(true);
        Drawing component = new Drawing();

        frame.add(component);
    }
}

class Drawing extends JComponent {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        printTree(g2);
    }

    public void printTree(Graphics2D g2) {
        g2.setColor(Color.BLACK);
        drawTree(g2, 400, 700, -(Math.PI / 2), 10);  // Adjust starting angle and height
    }

    public void drawTree(Graphics2D g2, int x, int y, double angle, int height) {
        if (height == 0) {
            return;
        }

        int x2 = (int) (Math.cos(angle) * height * 10) + x;
        int y2 = (int) (Math.sin(angle) * height * 10) + y;


        g2.setColor(Color.BLACK);
        g2.drawLine(x, y, x2, y2);


        drawTree(g2, x2, y2, angle+ (Math.PI / 5), height - 1);
        drawTree(g2, x2, y2, angle -(Math.PI / 5), height - 1);

    }
}

