package Main;

import java.awt.*;
import javax.swing.ImageIcon;

public class BoardPiece {
    private boolean isEmpty=true;
    private int x,y;
    private boolean isDestroyed=false;
    private boolean isEnemy=false;
    private Image shipIconAlive,shipIconDead,board;
    BoardPiece(int argx,int argy,boolean argIsEnemy){
        x=argx;
        y=argy;
        shipIconAlive = new ImageIcon("shipAlive50x50.png").getImage();
        shipIconDead = new ImageIcon("shipDead50x50.png").getImage(); 
        board = new ImageIcon("boardEmpty.png").getImage();
        isDestroyed = false;
        isEnemy = argIsEnemy;
    }
    public void destroyPiece(){
        isDestroyed=true;
    }
    public Image getImage(){
        if (isEmpty){return board;}
        else if (isDestroyed) {return shipIconDead;}
        else {return shipIconAlive;}
    }
    public void setX(int argX){
        x=argX;
    }
    public void setY(int argY){
        y=argY;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}