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
public class Vampire extends Player
{
    public Vampire()
    {
        super("Vampire",30,0);
        NumberGenerator numGen = new NumberGenerator();
        this.setAttackDmg(numGen.vampireADNum());
    }
    
    @Override 
    public void specialSkill()
    {
        ;
    }
    
    /**
     * This method increases the hp of the vampire monster while decreasing the hp of the player object. 
     * @param p 
     */
    
    public void realSpecialSkillVamp(Player p)
    {
        int x = 5;
        int h = p.getHealth();
        p.setHealth( h - x);
        this.setHealth(this.getHealth() + 5);
    }
    
    @Override 
    public String toString()
    {
        String vampInfo= "";
        vampInfo += " Current Health: " + this.getHealth() 
                + "\n Current attack damage: " + this.getAttackDmg();
        return vampInfo;
    }
}
