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
public abstract class Player 
{
    private String typeName ="";
    private int health;
    private int attackDmg;
    public static int NUMBEROFHEALTHPOTIONS = 3; 
    public int x = health;
    
    public Player(String name, int health, int attackdmg)
    {
        this.typeName = name;
        this.health = health;
        this.attackDmg = attackdmg;
        
    }
    
    public String getTypeName()
    {
        return this.typeName;
    }
    
    public int getHealth()
    {
        return this.health;
    }
    
    public int getAttackDmg()
    {
        return this.attackDmg;
    }
    
    public void setHealth(int health)
    {
        this.health = health;
    }
    
    public void setAttackDmg(int attackDmg)
    {
        this.attackDmg = attackDmg;
    }
    
    @Override
    public String toString()
    {
        String playerInfo  = "";
        playerInfo += " Current Health: " + this.getHealth() + "\n Number of Health Potions in Inventory: " 
                      + NUMBEROFHEALTHPOTIONS + "\n Current attack damage: " + this.getAttackDmg();
        return playerInfo;
    }
    
    public abstract void specialSkill(); 
      
}
