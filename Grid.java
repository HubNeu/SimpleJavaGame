package Main;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Grid extends javax.swing.JPanel {
    private int locationX,locationY,rectLength,rectHeight,size,x,y;
    public Grid(int argLocX,int argLocY,int argLength,int argHeight,int argSize) {
        size=argSize;
        locationX=argLocX;
        locationY=argLocY;
        rectLength=argLength;
        rectHeight=argHeight;
        initComponents();   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(185, 174, 154));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D graphics = (Graphics2D) g; 
        for(int i=0;i<rectLength*size;i=i+size){
            for(int j=0;j<rectHeight*size; j=j+size){
                graphics.drawRect(i, j,rectHeight,+rectHeight);
            }
        }
    }
    public int getMouseX(){
        return x;
    }
    public int getMouseY(){
        return y;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
