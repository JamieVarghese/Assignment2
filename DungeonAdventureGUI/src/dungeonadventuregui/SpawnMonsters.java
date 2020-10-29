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
public class SpawnMonsters 
{
    /**
     * The number is between 0-3 , depending on the number an object of that type monster is created.
     * @return Player object
     */
    
    public Player randMonster()
    {
        NumberGenerator numGen = new NumberGenerator();
        int random = numGen.chanceOfSpecial();
        Player monster = null;
        
        switch(random)
        {
            case 0: 
                monster = new Skeleton();
                break;
            
            case 1:
                monster = new Goblin();
                break;
            
            case 2:
                monster = new Vampire();
                break;
            
            case 3:
                monster = new Dragon();
                break;
        }
        return monster;
    }
}

