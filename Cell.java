//Maria Tsatsari 
//AM 4907
import java.util.*;
public class Cell
{

    private ArrayList<Cell> neighbors;
    Animal animal;

    public Cell()
    {
        Animal a=null;
        neighbors=new ArrayList<Cell>();
    }

     public Cell(Animal a)
    {
        animal=a;
        neighbors=new ArrayList<Cell>();
    }

    
    public ArrayList<Cell> getNeighbors()
    {
		return neighbors;       
    }
    
    public void setAnimal(Animal a)
    {
		 animal=a;   
		 a.setCell(this);
    }
    
    public Animal getAnimal()
    {
		return animal;
    }
    
    public void removeAnimal()
    {
        animal=null;
    }
    
    boolean isEmpty()
    {
		return (animal==null);
    }
    
    boolean containsRabbit()
    {
		return animal.isRabbit();
    }
    
    
    public void addNeighbor(Cell c)
    {
       neighbors.add(c);
    }
    
    public Cell getRandomNeighbor()
    {
        int i=(int) Math.floor(Math.random()*neighbors.size());
        return neighbors.get(i);   
    }
    
    
}
