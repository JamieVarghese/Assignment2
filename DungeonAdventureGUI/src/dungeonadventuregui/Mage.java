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
public class Mage extends Player
{
    int intelligence;            // crit = special skill
    
    public Mage()
    {
        super ("Mage", 45, 20);
        intelligence = 3;
    }
    
    /**
     * This method doubles the players attack damage for that turn if x = 0, There's a 50% chance that it activates 
     */
    
    @Override 
    public void specialSkill()
    {
        if(intelligence > 0)
        {
           NumberGenerator rNum = new NumberGenerator();
           int x = rNum.mageSpecial();
           if (x == 0)
           {
               int y = this.getAttackDmg();
               this.setAttackDmg(y *2);
           }
        }
    }
    
    /**
     * This method changes the attack damage back to normal while also decreasing the number of intelligence the Mage object has 
     */
    
    public void changeIntelligence()
    {
        intelligence = intelligence -1;
        int y = this.getAttackDmg();
        this.setAttackDmg(y/2);
        
    }
    
    public int getIntelligence()
    {
        return this.intelligence;
    }
    
    public void setIntelligence(int intelligence)
    {
        this.intelligence = intelligence;
    }
    
    @Override
    public String toString()
    {
        String mageInfo = super.toString() + "\n Remaining Intelligence: " 
                         + this.intelligence;
        return mageInfo;
    }
             
}
