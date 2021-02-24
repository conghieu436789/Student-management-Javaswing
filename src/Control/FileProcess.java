/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Hieu
 */
public class FileProcess {
    public static Object getFile(String filepath) {
        Object obj = null;
        try {
            File file = new File(filepath);;        
            if (file.length()>0) {
                FileInputStream fileIn = new FileInputStream(filepath);
                ObjectInputStream objectIn = new ObjectInputStream(fileIn);
                obj = objectIn.readObject();
                objectIn.close();
             
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
          
        }
        return obj;
    }
    public static void writeFile(Object serObj, String path) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream output = new ObjectOutputStream(fileOutputStream);
            output.writeObject(serObj);
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
