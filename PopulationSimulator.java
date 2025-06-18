//Maria Tsatsari 
//AM 4907
import java.util.*;
public class PopulationSimulator
{
    Grid G;
    HashSet<Rabbit> R;
    HashSet<Fox> F;
    private final int NUM_OF_FOXES=5;
    private final int NUM_OF_RABBITS=100;
    
    
    public PopulationSimulator()
    {
      R= new HashSet<Rabbit>();  
      F= new HashSet<Fox>();
      G=new Grid();
    }


    private void populateGrid()
    {
        
        
        for (int i=0;i<NUM_OF_FOXES;i++)
        {
			F.add(new Fox());
        }
        
        for (int i=0;i<NUM_OF_RABBITS;i++)
        {
			R.add(new Rabbit());
        }
        
        for (Fox f: F)
        {
            G.addRandomly(f);
        }
        
        
        for (Rabbit r: R)
        {
            G.addRandomly(r); 
        }
        
    }
    
    public void handleFoxes()
    {
        ArrayList<Fox> FL=new ArrayList<Fox>();
        for (Fox f: F)
        {
            f.move();
            if(!f.starve())
            {
				f.breed();   
            }
            else
            {
                FL.add(f);
            }
        }
        
        for (Fox f: FL)
        {
            F.remove(f);
        }
    }
    
    
    public void handleRabbits()
    {
        ArrayList<Rabbit> RL=new ArrayList<Rabbit>();
        for (Rabbit r: R)
        {
            
            if(!r.isEaten())
            {
				 r.move();
				 r.breed();   
            }
            else
            {
                RL.add(r);
            }
        }
        
        for (Rabbit r: RL)
        {
            R.remove(r);
        }
    }
    
    public void simulate(int s)
    {
             
        populateGrid();
        
        for (int i=0;i<s;i++)
        {
          System.out.println(G);
          System.out.println(R.size()+" Rabbits and "+F.size()+" Foxes\n\n");
          handleFoxes();
          handleRabbits();
        }
        
         System.out.println("Final State : ");
         System.out.println(G);
         System.out.println(R.size()+" Rabbits and "+F.size()+" Foxes\n\n");
    }
}
