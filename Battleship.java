package Main;

import java.util.Arrays;

public class Battleship {

    public int xInitial = 0, yInitial = 0, xFinal = 0, yFinal = 0;
    public boolean isVertical = false;
    public int length = 1;
    public int health = 1;
    public int[][] punkty = new int[4][2];
    public int[][] isDestroyed;

    public Battleship(int arg, boolean argVertical) {
        //tymczasowe uzupelnienie
        xInitial = xFinal = yInitial = yFinal = length = health = arg;
        isVertical = argVertical;
        for (int[] row : punkty) {
            Arrays.fill(row, 0);
        }

    }

    public void setXIniial(int arg) {
        xInitial = arg;
        
    }

    public void setYIniial(int arg) {
        yInitial = arg;
    }

    public void setFinals() {
        isDestroyed = new int[6 + 3 * length][2];
        if (isVertical) {
            xFinal = xInitial;
            yFinal = yInitial + length - 1;
            for (int i = 0; i < length; i++) {
                punkty[i][0] = xInitial;
                punkty[i][1] = yInitial + i;
            }
            int i = 0;
            for (int k = 0; k < 6 + 3 * length; k = k + 3) {
                isDestroyed[k][0] = xInitial - 1;
                isDestroyed[k + 1][0] = xInitial;
                isDestroyed[k + 2][0] = xInitial + 1;
                isDestroyed[k][1] = yInitial - 1 + i;
                isDestroyed[k + 1][1] = yInitial - 1 + i;
                isDestroyed[k + 2][1] = yInitial - 1 + i;
                i++;
            }
        } else {
            xFinal = xInitial + length - 1;
            yFinal = yInitial;
            for (int i = 0; i < length; i++) {
                punkty[i][0] = xInitial + i;
                punkty[i][1] = yInitial;
            }
            int i = 0;
            for (int k = 0; k < 6 + 3 * length; k = k + 3) {
                isDestroyed[k][0] = xInitial - 1 + i;
                isDestroyed[k + 1][0] = xInitial - 1 + i;
                isDestroyed[k + 2][0] = xInitial - 1 + i;
                isDestroyed[k][1] = yInitial - 1;
                isDestroyed[k + 1][1] = yInitial;
                isDestroyed[k + 2][1] = yInitial + 1;
                i++;
            }
        }
        health=length;
    }

    public void setVertical() {
        isVertical = true;
    }

    public void setHorizontal() {
        isVertical = false;
    }

    public void setHealthLength(int arg) {
        health = length = arg;
    }

    public void hit() {
        --health;
    }

    public boolean isDestroyed() {
        if (health == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getXInitial() {
        return xInitial;
    }

    public int getYInitial() {
        return yInitial;
    }

    public int getXFinal() {
        return xFinal;
    }

    public int getYFinal() {
        return yFinal;
    }
}
