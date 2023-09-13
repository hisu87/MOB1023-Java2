/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

import javax.swing.JTextField;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    public static boolean isDate(JTextField textField, StringBuilder sb, String msg, String pattern){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        if(!isEmpty(textField, sb, msg)){
            return false;
        }else{
            try{
                msg = "Ngày sinh không đúng định dạng dd-MM-yyyy";
                Date date = sdf.parse(textField.getText().trim());
            }catch(Exception e){
                sb.append(msg).append("\n");
                textField.setBackground(Color.yellow);
                System.out.println("isDate Error"+e.toString());
                return false;
            }
        }
        textField.setBackground(Color.white);
            return true;
    }
    
}
