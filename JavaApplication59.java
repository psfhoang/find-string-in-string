/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication59;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author phamv
 */
public class JavaApplication59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] fullName = { "pham viet hoang","pham tuan viet","nguyen thi mai thanh"};
        String regex=".*ph.*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        for (int i = 0; i<fullName.length; i++) {
            matcher= pattern.matcher(fullName[i]);
            if(matcher.find())
            {
                System.out.println(fullName[i]);
            }
        }
        
        
    }
    
}
