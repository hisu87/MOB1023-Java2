/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3;

/**
 *
 * @author numpa
 */
public class Students {
    public String name;
    public double marks;
    public String major;
    public String getRank(){
        if(this.marks<3){
            return "Kém";
        }if(this.marks <5){
            return "Yếu";
        }if(this.marks <6.5){
            return "Trung bình";
        }if(this.marks <7.5){
            return "Khá";
        }if(this.marks <9){
            return "Giỏi";
        }
        return "Xuất sắc";
    }
    public boolean isBonus(){
        if(this.marks >=7.5 && this.major.equals("Kỹ thuật phần mềm")){
            return true;
        }
        return false;
    }
    
}
