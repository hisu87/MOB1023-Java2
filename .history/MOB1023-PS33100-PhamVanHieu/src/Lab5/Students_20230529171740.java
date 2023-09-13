/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

import Lab3.*;
import java.io.Serializable;

/**
 *
 * @author numpa
 */
public class Students implements Serializable{
    private String id;
    private String name;
    private double mark;
    private String major;

    public Students() {
    }

    public Students(String id, String name, double mark, String major) {
        this.id = id;
        this.name = name;
        this.mark = mark;
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    

    public String getGrade() {
        if (this.mark <= 3) {
            return "Kém";
        }
        if (this.mark <= 5) {
            return "Yếu";
        }
        if (this.mark <= 6.5) {
            return "Trung bình";
        }
        if (this.mark <= 7.5) {
            return "Khá";
        }
        if (this.mark <= 9) {
            return "Giỏi";
        }
        return "Xuất sắc";
    }

    public boolean isBonus() {
        return this.mark >= 7.5;
    }

    public String splitName(String Fullname){
        String name = Fullname.substring(Fullname.lastIndexOf(" ")+1 );
        return name;
    }

    @Override
    public String toString() {
        return "Students{" + "id=" + id + ", name=" + name + ", mark=" + mark + ", major=" + major + '}';
    }
    
}
