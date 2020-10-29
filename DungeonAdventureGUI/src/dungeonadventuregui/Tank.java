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
public class Tank extends Player
{
    int shield;
    
    public Tank()
    {
        super("Tank", 60, 12);
        shield = 20;
    }
    
    /**
     * This method increases the players health by an amount of shield and then sets the shield variable to zero.
     */
    
    @Override
    public void specialSkill()
    {
        if (shield > 0)
        {
            int s = shield + this.getHealth();
            this.setHealth(s);
            this.setShield(0);
        }
    }
    
    public int getShield()
    {
        return this.shield;
    }
    
    public void setShield(int x)
    {
        this.shield = x;
    }
    
    @Override 
    public String toString()
    {
        String tankInfo = super.toString()  + "\n Remaining Shield: "
                + this.shield;
        
        return tankInfo;
    }
    
    
}
