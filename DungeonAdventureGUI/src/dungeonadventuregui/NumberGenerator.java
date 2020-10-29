/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonadventuregui;

import java.util.Random;
/**
 * @author Jamie
 * This class is used to generate a random number between the range , the range is depended on what the numbers are used for. Majority of it
 * is used to set the attack damage of the monsters when they are generated.
 */
public class NumberGenerator 
{
    public int skullADNum()
    {
        Random rNum = new Random();
        int low = 1;
        int high = 4;
        int result = rNum.nextInt(high - low) + low;
        return result;   
    }
    
    public int goblinADNum()
    {
        Random rNum = new Random();
        int low = 1;
        int high = 6;
        int result = rNum.nextInt(high - low) + low;
        return result;   
    }
    
     public int vampireADNum()
    {
        Random rNum = new Random();
        int low = 4;
        int high = 8;
        int result = rNum.nextInt(high - low) + low;
        return result;   
    }
     
      public int dragonADNum()
    {
        Random rNum = new Random();
        int low = 5;
        int high = 10;
        int result = rNum.nextInt(high - low) + low;
        return result;   
    }
      
      public int chanceOfSpecial()
    {
        Random rNum = new Random();
        int low = 0;
        int high = 4;
        int result = rNum.nextInt(high - low) + low;
        return result;   
    }
      
      public int mageSpecial()
      {
          Random rNum = new Random();
          int low = 0;
          int high = 1;
          int result = rNum.nextInt(high - low) + low; 
          return result;
      }
    
}
