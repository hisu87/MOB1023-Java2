/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.vn.ultils;

import java.io.FileOutputStream;

/**
 *
 * @author numpa
 */
public class FileUltil {
    public static final String FILE_NAME = "employee.dat";
    public static void writeFile(){
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        
    }
}
