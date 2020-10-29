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
public class Dragon extends Player
{
    public Dragon()
    {
        super("Dragon",50,0);
        NumberGenerator numGen = new NumberGenerator();
        this.setAttackDmg(numGen.dragonADNum());
    }
    
    @Override
    public void specialSkill()
    {
        ;
    }
    
    /**
     * This method takes in an object type player and reduces the health of that object by a certain percentage and sets it as the new health of that object
     * @param p = type Player Object
     */
    
    public void realSpecialSkill(Player p)
    {
        int x = p.getHealth();
        int y = (int)(x*(5.0f / 100.0f));
        p.setHealth(x-y);
        
    }
    
    @Override
    public String toString()
    {
        String dragInfo = "";
        dragInfo += " Current Health: " + this.getHealth() 
                + "\n Current attack damage: " + this.getAttackDmg();
        return dragInfo;
    }
}
