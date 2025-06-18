//Maria Tsatsari 
//AM 4907
import java.util.*;
public class Simulation
{
    
    public static void main(String arg[])
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Give number of steps:");
        int s=in.nextInt();
        
        PopulationSimulator S=new PopulationSimulator();
        
        S.simulate(s);
        
    }
}
