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
public class Goblin extends Player
{
    public Goblin()
    {
        super("Goblin",20,0);
        NumberGenerator numGen = new NumberGenerator();
        this.setAttackDmg(numGen.vampireADNum());
    }
    
    /**
     * This method when activated takes one of the players Health potions away. 
     */
    
    @Override 
    public void specialSkill()
    {
        if (NUMBEROFHEALTHPOTIONS > 0 ) 
        {
           int x = NUMBEROFHEALTHPOTIONS - 1;
           NUMBEROFHEALTHPOTIONS = x;
        }
    }
    
    @Override
    public String toString()
    {
        String gobInfo = "";
        gobInfo += " Current Health: " + this.getHealth() 
                + "\n Current attack damage: " + this.getAttackDmg();
        return gobInfo;
    }
}
