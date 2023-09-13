/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

import javax.swing.JTextField;

import LamThem.C;
import java.awt.Color;

/**
 *
 * @author numpa
 */
public class Validator {
    public static boolean isEmpty(JTextField textField, StringBuilder sb, String errorMessage){
        String strField = textField.getText().trim();
        if(strField.isEmpty()){
            sb.append(errorMessage).append("\n");
            textField.setBackground(Color.yellow);
            return false;
        }
        textField.setBackground(Color.white);
        return true;
    }

    public static boolean isDate(JTextField textField, StringBuilder sb, String errorMessage, String pattern){
        SimpileDateFormat sdf = new SimpileDateFormat(pattern);
        if(!isEmpty(textField, sb, errorMessage)){
            return false;
        }else{
            try{
                
            }
        }
        return true;
    }
    
}
