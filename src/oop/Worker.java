package oop;

import java.io.Console;

/***
 * 
 */
public class Worker extends Student {


    /*********************************
     * set Worker to kerja with things
     * @param bahans
     */
    public void kerja(String[] bahans) {
        for (String string : bahans) {
            System.out.println(string);
        }
    }
    
}
