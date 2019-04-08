package Main;

public class GameGrid {
    
    private int length,height;
    private int[][] gridArray;
    private int xPixels,yPixels;
    
    GameGrid(int arglength,int argheight){
        xPixels=length*40;
        yPixels=height*40;        
        length=arglength;
        height=argheight;
        gridArray = new int[length][height];
        for (int i=0;i<length;i++){
            for (int j=0;j<height;j++){
                gridArray[i][j]=0;
            }
        }
    //w tym momencie wszedzie jest 0 i mozna zaczac statki umieszczac/wlozyc do gui.    
    }
    
    public int getXPixels(){
        return xPixels;
    }
    
    public int getYPixels(){
        return yPixels;
    }
}
