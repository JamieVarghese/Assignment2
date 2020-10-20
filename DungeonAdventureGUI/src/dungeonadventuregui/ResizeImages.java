/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonadventuregui;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Jamie
 */
public class ResizeImages 
{
    public ResizeImages()
    {
        
    }
    
    public ImageIcon resizeImage(String s, JLabel x)
    {
        ImageIcon imagetest = new ImageIcon(s);
        Image img = imagetest.getImage();
        Image imgscale = img.getScaledInstance(x.getWidth(), x.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgscale);
        return scaledIcon;
    }
}
