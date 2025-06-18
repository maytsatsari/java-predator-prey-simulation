//Maria Tsatsari 
//AM 4907
import java.util.*;
public class Grid
{

    private final int SIZE=20;
    Cell A[][];
    public Grid()
    {
        A=new Cell[SIZE][SIZE];
        
        for (int i=0;i<SIZE;i++)
        for (int j=0;j<SIZE; j++)
        {
           
           A[i][j]=new Cell();
        }
        
        for (int i=0;i<SIZE;i++)
        for (int j=0;j<SIZE; j++)
        {
           if(j<SIZE-1) A[i][j].addNeighbor(A[i][j+1]);
           if(i<SIZE-1) A[i][j].addNeighbor(A[i+1][j]);
           if(i>0) A[i][j].addNeighbor(A[i-1][j]);
           if(j>0) A[i][j].addNeighbor(A[i][j-1]);
        }
        
    }
    
    

    public void addRandomly(Animal a)
    {
       
        ArrayList<Cell> E=new ArrayList<Cell>();
        
        for (int i=0;i<SIZE;i++)
        for (int j=0;j<SIZE; j++)
           {
               if (A[i][j].isEmpty())   E.add(A[i][j]);
           }
       
       
       int k=(int) Math.floor(Math.random()*E.size());
       
       E.get(k).setAnimal(a);
       
    }
    
    
    public String toString()
    {
        String s="";
        for (int i=0;i<SIZE;i++)
        {
        for (int j=0;j<SIZE; j++)
           {
               if (A[i][j].isEmpty())   s=s+"_";
               else s=s+A[i][j].getAnimal();
           }
           s=s+"\n";
        }
        
        return s;
    }
}
