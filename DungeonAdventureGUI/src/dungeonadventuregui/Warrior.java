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
public class Warrior extends Player 
{
    private int rage;
    
    public Warrior()
    {
        super("Warrior",55,15);
        rage = 3;
    }
    
    /**
     * This method increase the attack damage of the Player by 10 for one turn and then decreases the amount of rage the player has 
     */
    
    @Override
    public void specialSkill()
    {
        if (rage > 0)
        {
            int x = this.getAttackDmg();
            this.setAttackDmg(x + 10);
            rage = rage -1;
        }
        
    }
    
    /**
     * This method reduces the damage after the Player has used the special skill.
     */
    
    public void changeRage()
    {
        int y = this.getAttackDmg();
        this.setAttackDmg(y - 10);
    }
    
    public int getRage()
    {
        return this.rage;
    }
    
    public void setRage(int x)
    {
        this.rage = x;
    }
    
    @Override 
    public String toString()
    {
        String warInfo = super.toString() + "\n Remaining Rage: " + this.rage;
        return warInfo;
    }
}
