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
public class Skeleton extends Player
{
   public Skeleton()
   {
       super("Skeleton",25,0);
       NumberGenerator num = new NumberGenerator();
       this.setAttackDmg(num.skullADNum());
       
   }
   
   /**
    * This method , just gives the skeleton another 10 hp when it activates. 
    */
   
   @Override
   public void specialSkill()
   {
       int x = this.getHealth();
       this.setHealth(x + 10);
       
   }
   
   @Override
   public String toString()
   {
       String skeletonInfo = "";
       skeletonInfo  += " Current Health: " + this.getHealth() 
                + "\n Current attack damage: " + this.getAttackDmg();
       return skeletonInfo;
   }
}