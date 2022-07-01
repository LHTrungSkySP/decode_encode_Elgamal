/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class FileTxt {
    public static String readFile(String path) throws FileNotFoundException, IOException {
        String content = "", sNewLine;
        try (FileInputStream fin = new FileInputStream(path)) {
            InputStreamReader isr = new InputStreamReader(fin, "utf-8");
            BufferedReader br = new BufferedReader(isr);
            while ((sNewLine = br.readLine()) != null) {
                content += sNewLine + "\n";
            }
            fin.close();
        }
        return content;  
    }
}
