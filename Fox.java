//Maria Tsatsari 
//AM 4907
public class Fox extends Animal
{ 
    int eaten;
    
    public Fox( )
    {
       eaten=0;     
    }

    boolean isRabbit()
    {
		return false;   
    }
    
    boolean timetoBreed()
    {
		return false;   
    }
    
    
    boolean starve()
    {
        if (eaten>3)
        {
			 c.removeAnimal();
			 return true;
        }
        
        return false;
    }
        
  
    Animal giveBirth()
    {
        return new Fox();               
    }
    
    void move()
    {
        survived();
        
        for (Cell cc: c.getNeighbors())
        {
            if(!cc.isEmpty())
            if(cc.containsRabbit())
            {  
               Rabbit r=(Rabbit) cc.getAnimal();
               r.becomeEaten();
               c.removeAnimal();
               cc.setAnimal(this);
               eaten=0;
               return;
            }
            
        }
        
        
        randomMove();
    }
    
    
    public String toString()
    {
		return "X";   
    }
    
    
}


