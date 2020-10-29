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
public class PathFileImage 
{
    public PathFileImage()
    {   
        
    }
    
    public String imageBasedOnFilePath(int x)
    {
        String imagePath = "";
        
        if (x == 60) // tank
        {
            imagePath = "D:\\Documents\\NetBeans -JAVA\\Projects\\Assignment 2-17981815\\Assignment2\\DungeonAdventureGUI\\src\\Images Used\\tank.png"; 
        }
        if (x == 55) // warrior
        {
            imagePath = "D:\\Documents\\NetBeans -JAVA\\Projects\\Assignment 2-17981815\\Assignment2\\DungeonAdventureGUI\\src\\Images Used\\warriorjpg.jpg";
        }
        if (x == 45) // mage
        {
            imagePath = "D:\\Documents\\NetBeans -JAVA\\Projects\\Assignment 2-17981815\\Assignment2\\DungeonAdventureGUI\\src\\Images Used\\magejpg.jpg";
        }
        if (x == 3) //skeleton
        {
            imagePath = "D:\\Documents\\NetBeans -JAVA\\Projects\\Assignment 2-17981815\\Assignment2\\DungeonAdventureGUI\\src\\Images Used\\Skeleton.jpg";
        }
        if (x == 4) // goblin
        {
            imagePath = "D:\\Documents\\NetBeans -JAVA\\Projects\\Assignment 2-17981815\\Assignment2\\DungeonAdventureGUI\\src\\Images Used\\Goblin.png";
        }
        if (x == 5) // vampire
        {
            imagePath = "D:\\Documents\\NetBeans -JAVA\\Projects\\Assignment 2-17981815\\Assignment2\\DungeonAdventureGUI\\src\\Images Used\\Vampire.jpg";
        }
        if (x == 6) // dragon
        {
            imagePath = "D:\\Documents\\NetBeans -JAVA\\Projects\\Assignment 2-17981815\\Assignment2\\DungeonAdventureGUI\\src\\Images Used\\Dragon.jpg";
        }
        
        return imagePath;
       
    }
}
