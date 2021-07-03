/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileController;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author ACER AMD
 */
public class FileController {

    public static void copyFile(File a, File b) {

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(a);
            outputStream = new FileOutputStream(b);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        int i = 0;
        try {
            while((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
