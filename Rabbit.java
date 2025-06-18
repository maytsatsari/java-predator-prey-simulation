//Maria Tsatsari 
//AM 4907
public class Rabbit extends Animal
{
    
    boolean eaten;
   
    public Rabbit()
    {
		eaten=false;
    }

    boolean isRabbit()
    {
		return true;   
    }
    
    boolean timetoBreed()
    {
		return false;   
    }
    
    void becomeEaten() 
    {
		eaten=true;   
    }
        
    boolean isEaten() 
	{
		return eaten; 
	}
    
    Animal giveBirth()
    {
        return new Rabbit();
    }
    
    void move()
    {
        survived();
        randomMove();    
    }
    
    
    public String toString()
    {
		return "o";   
    }
    
    
}
