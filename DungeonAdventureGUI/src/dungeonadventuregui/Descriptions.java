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
public class Descriptions 
{
    public Descriptions()
    {
        
    }
    
    public String welcome()
    {
        String welcomeDes = "";
        welcomeDes = "Welcome to the Dungeon Adventure , an endless monster slaying experience\n" +
                    "where the choices you make, and how you utilize your equipment \n" +
                    "leads to a higher score";
        return welcomeDes;
    }
    
    public String describeCharatacters(int x)
    {
        String describeChar= "";
        
        if (x == 0)  // tank
        {
            describeChar = "Tank a Hero who can take a beating \n" +
                            "while also dishing one out too";
        }
        
        if (x == 1)
        {
            describeChar = "Warrior a Hero who is well rounded in terms of health and \n" +
                            "attack damage, or you would think";
        }
        
        if (x == 2)
        {
            describeChar = "Mage a Hero who likes to \n" +
                            "take his chances to do more damage";
        }
        
        return describeChar;
    }
    
    public String characterStats(Player p)
    {
        String characterStats = "";
        characterStats = " You have chosen the hero: " + p.getTypeName() + "\n with the current stats: "
                        + "\n" + p.toString() + "\n Good luck with your adventure";
        return characterStats;
    }
    
    public String monsterDescription(Player monster)
    {
        String describeMonster = "";
        describeMonster = " You encounter the monster: " + monster.getTypeName() +"\n its stats: "
                + "\n" + monster.toString();
        return describeMonster;
    }
}
