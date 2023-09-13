 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author numpa
 */
public class UserDAO {
    public static List<User> ls = new ArrayList<>();
    public int add(User u){
        ls.add(u);
        return 1;
    }
    public int findUserByID( String username){
        int pos = -1;
        for (int i = 0; i<ls.size(); i++){
            User u = ls.get(i);
            if(u.getUsername().equals(username)){
                pos=i;
                        break;
            }
           
        }
        return pos;
    }
    public int del(String username){
        int pos = findUserByID(username);
        if(pos <0){
            System.out.println("Không tìm thấy");
        }else{
            ls.remove(pos);
            System.out.println("Đã xóa User");
        }
        return 1;
    }
    public int update(User u){
        int pos = findUserByID(u.getUsername());
        if(pos <0){
            System.out.println("Không tìm thấy");
        }else{
            ls.set(pos, u);
        }
        return pos;
    } 
    public List<User> getAll(){
        for(User u : ls){
            System.out.println("Username:" + u.getUsername());
            System.out.println("Pass:" + u.getPass());
            System.out.println("Admin:" + u.isRole());
        }
        return ls;
    }
}
