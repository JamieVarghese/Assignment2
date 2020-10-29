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
public class DropItems 
{
    /**
     * If the number of health potions the player has is in between 0 and 2 (3 is the upper limit) they gain an extra health potion.
     * @param p type Player Object
     */
    
    public void chanceHPPOTION(Player p)
    {
        if (p.NUMBEROFHEALTHPOTIONS == 0 || p.NUMBEROFHEALTHPOTIONS <3)
        {
             p.NUMBEROFHEALTHPOTIONS = p.NUMBEROFHEALTHPOTIONS + 1;
        }
    }
    
    /**
     * Changes the amount of rage the warrior object has and returns that object back
     * @param w Takes an warrior object
     * @return that warrior object
     */
    
    public Warrior spWarrior(Warrior w)  
    {   
        if(w.getRage() >= 0 && w.getRage() < 3)
        {
            w.setRage(w.getRage() + 1);
        }
        return w;
    }
    
    /**
     * Changes the amount of shield the Tank object has and returns that object back , but the limit of shield the object has is capped to 20.
     * @param t Tank object
     * @return that Tank object
     */
    
    public Tank spTank(Tank t)
    {
    
        if(t.getShield() >= 0 && t.getShield() < 20 )
            {
                t.setShield(t.getShield() + 10);
                if(t.getShield() > 20)
                {
                    t.setShield(20);
                }
            }
        return t;
    }
    
    /**
     * Changes the amount of Intelligence the Mage object has and returns that object back
     * @param m Mage object
     * @return that Mage object
     */
    
    public Mage spMage(Mage m)
    {
        if(m.getIntelligence() >= 0 && m.getIntelligence() < 3 )
            {
                m.setIntelligence(m.getIntelligence() + 1);
            }
        
        return m;
    }
    

   
}
