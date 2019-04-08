package Main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Square extends javax.swing.JPanel {

    public boolean isEnemy, battle, trigger = false, triggerInput = false,endgame=false;
    int x, y;
    int[][] thisBoard = new int[10][10];
    public Graphics g = this.getGraphics();

    public Square(boolean Enemy, boolean argBattle) {
        initComponents();
        isEnemy = Enemy;
        battle = argBattle;

        if (!(Enemy ^ argBattle)) {//wymaga xnor
            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    x = e.getX() / 50;
                    y = e.getY() / 50;
                    triggerInput = true;//trigger do 
                    trigger = true;//trigger do uzywania przy klikaniu w positioning
                    repaint();
                    //System.out.println(x + "," + y);
                }
            });
        }

        //init tablic
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                thisBoard[i][j] = 0;
            }
        }
        this.setVisible(true);
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(18, 196, 255));
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!isEnemy) {
            g.setColor(Color.GRAY);
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (thisBoard[i][j] == 1) {
                        g.fillRect(i * 50, j * 50, 49, 49);
                    }
                }
            }
        }
        g.setColor(Color.RED);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (thisBoard[i][j] == 2) {
                    g.fillRect(i * 50, j * 50, 49, 49);
                }
            }
        }
        g.setColor(new Color(18, 196, 255));
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (thisBoard[i][j] == 0) {
                    g.fillRect(i * 50, j * 50, 49, 49);
                }
            }
        }

        g.setColor(Color.BLUE);//jesli pudlo to ciemny niebieski
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (thisBoard[i][j] == 3) {
                    g.fillRect(i * 50, j * 50, 49, 49);
                }
            }
        }
        if (trigger&&!endgame) {
            g.setColor(Color.YELLOW);
            g.fillRect(x * 50, y * 50 - 1, 50, 50);
            g.setColor(Color.BLACK);
            g.drawLine(x * 50, y * 50, x * 50 - 1 + 50, y * 50 - 1);
            g.drawLine(x * 50, y * 50, x * 50 - 1, y * 50 - 1 + 50);
            trigger = false;
        }
        g.setColor(Color.BLACK);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                g.drawRect(i * 50 - 1, j * 50 - 1, 50, 50);
            }
        }
        //rysowanie lini siatki
        g.setColor(Color.BLACK);
        g.drawLine(0, 0, 0, 500);
        g.drawLine(50, 0, 50, 500);
        g.drawLine(100, 0, 100, 500);
        g.drawLine(150, 0, 150, 500);
        g.drawLine(200, 0, 200, 500);
        g.drawLine(250, 0, 250, 500);
        g.drawLine(300, 0, 300, 500);
        g.drawLine(350, 0, 350, 500);
        g.drawLine(400, 0, 400, 500);
        g.drawLine(450, 0, 450, 500);
        g.drawLine(500, 0, 500, 500);
        g.drawLine(0, 0, 500, 0);
        g.drawLine(0, 50, 500, 50);
        g.drawLine(0, 100, 500, 100);
        g.drawLine(0, 150, 500, 150);
        g.drawLine(0, 200, 500, 200);
        g.drawLine(0, 250, 500, 250);
        g.drawLine(0, 300, 500, 300);
        g.drawLine(0, 350, 500, 350);
        g.drawLine(0, 400, 500, 400);
        g.drawLine(0, 450, 500, 450);
        g.drawLine(0, 500, 500, 500);
        //koniec rysowania lini
        //printArr();
    }

    public void printArr() {//do sprawdzenia czy tablice kopiuja sie dobrze
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(thisBoard[j][i]);
            }
            //System.out.println("Square");
            System.out.println("");
        }
        System.out.println("to bylo z isEnemy" + isEnemy);
    }

    public int getMouseX() {
        return x;
    }

    public int getMouseY() {
        return y;
    }

    public int getInputX() {
        while (!triggerInput) {

        }
        return x;
    }

    public int getInputY() {
        while (!triggerInput) {

        }
        return y;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
