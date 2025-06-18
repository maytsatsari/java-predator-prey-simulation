//Maria Tsatsari 
//AM 4907
public abstract class Animal
{
   
    Cell c;
    int steps;
   
    
    abstract boolean isRabbit();
    abstract boolean timetoBreed();
    abstract Animal giveBirth();
    abstract void move();
    
    Animal()
    {
        
    }
    
    void setCell(Cell cc)
    {
     c=cc;   
    }
    
    void survived()
    {
     steps++; 
     
    }
    
    void randomMove()
    {
        int x=(int )(Math.floor(Math.random()*c.getNeighbors().size()));
        Cell cc=c.getNeighbors().get(x);
             
        if(cc.isEmpty())
        {
         c.removeAnimal();
         cc.setAnimal(this);
        }
        
    }
    
    Animal breed()
    {
        int S;
        if(this.isRabbit()) S=3;
        else S=8;
        if(steps%S==0)
        {
            for (Cell cc: c.getNeighbors())
            {
             if(cc.isEmpty())
             {
                 
                 Animal a=giveBirth();
                 cc.setAnimal(a);
                 return a;
                }
            }
            return null;
        }
        else
        {
            return null;
        }
        
    }
}
