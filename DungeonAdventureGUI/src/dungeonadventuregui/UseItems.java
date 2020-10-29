/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonadventuregui;

/**
 *
 * @author Jamie
 */
public class UseItems 
{
    /**
     *This method increases the health of the player by 30% based on their maximum health 
     * @param p Takes the player object.
     */
    
    public void useHealthPotion(Player p)
    {
        int x = p.getHealth();
        int h = constantHealth(p);                                        
        if (p.NUMBEROFHEALTHPOTIONS > 0)
        {
           p.NUMBEROFHEALTHPOTIONS = p.NUMBEROFHEALTHPOTIONS - 1;
           int y = (int)(h*(30.0f/100.0f) + x);
           
           if( y > h)
           {
               p.setHealth(h);
           }
           else 
           {
               p.setHealth(y);
           }
           
        }
    }
    
    /**
     * This method determines what type the object is and returns an int of value that is equal to the max hp of the player Hero.
     * @param p Player object
     * @return int x
     */
    
    public int constantHealth(Player p)
    {
        int x = 0;
        
        if (p instanceof Warrior)
        {
            x = 55;
        }
        
        if (p instanceof Tank)
        {
            x = 60;
        }
        
        if (p instanceof Mage)
        {
            x = 45;
        }
        
        return x;
    }
    
    /**
     * This method determines what type the object is for the monster subclass and returns an int value so that superclass reference can be typecast to a subclass
     * @param p Player object 
     * @return int value
     */
    
    public int checkingMonsterType(Player p)
    {
        int m = 0;
        
        if( p instanceof Goblin)
        {
             m = 1;
        }
        
        if( p instanceof Skeleton)
        {
            m = 2;
        }
        
        if ( p instanceof Vampire)
        {
            m = 3;
        }
        
        if (p instanceof Dragon)
        {
            m = 4;
        }
        
        return m;
    }
}
