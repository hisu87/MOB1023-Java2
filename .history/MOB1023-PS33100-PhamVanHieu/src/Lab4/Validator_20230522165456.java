/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

import javax.swing.JTextField;

import java.awt.Color;
import java.text.DateFormat;
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

    public static boolean isDate(JTextField textField, StringBuilder sb, String msg){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
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

    public static boolean isDate(JTextField textField, StringBuilder sb, String errormsg, String pattern){
        SimpleDateFormat sdf = new SimpleDateFormat();
        if(!pattern.equals("")){
            sdf.applyPattern(pattern);
        }
//        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        if(!isEmpty(textField, sb, errormsg)){
            return false;
        }else{
            try{
                errormsg = "Ngày sinh không đúng định dạng dd-MM-yyyy";
                Date date = sdf.parse(textField.getText().trim());
            }catch(Exception e){
                sb.append(errormsg).append("\n");
                 textField.setBackground(Color.yellow);
                System.out.println("isDate Error"+e.toString());
                return false;
            }
        }
        textField.setBackground(Color.white);
            return true;
    }
    
    public static boolean isNumber(JTextField textField, StringBuilder sb, String msg, int type){
        if(!isEmpty(textField, sb, msg)){
            return false;
        }else{
            try {
                msg = "Lương phải là số dương";
                if(type >0){
                    double number = Double.parseDouble(textField.getText().trim());
                }else{
                    int number = Integer.parseInt(textField.getText().trim());
                }
            } catch (Exception e) {
                // TODO: handle exception
                sb.append(msg).append("\n");
                textField.setBackground(Color.yellow);
                System.out.println("isNumber Error"+e.toString());
            }
        textField.setBackground(Color.white);
        return true;
    }

}
