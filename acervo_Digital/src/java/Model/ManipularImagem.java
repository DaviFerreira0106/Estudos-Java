/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

/**
 *
 * @author daviferreira
 */
public class ManipularImagem {
    public static byte[] getImgBytes(BufferedImage image){
        ByteArrayOutputStream objByteStream = new ByteArrayOutputStream();
        
        try{
            ImageIO.write(image, "JPEG", objByteStream);
        }catch(IOException ex){
            
        }
        
        InputStream is = new ByteArrayInputStream(objByteStream.toByteArray());
        
        return objByteStream.toByteArray();
    }
}
