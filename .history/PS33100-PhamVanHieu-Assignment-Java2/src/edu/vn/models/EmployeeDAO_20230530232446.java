/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.vn.models;

import edu.vn.itf.InterfaceEmployee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author numpa
 */
public class EmployeeDAO implements InterfaceEmployee{
    
    public static List<Employee> ls = new ArrayList<>();

    @Override
    public int save(Employee e) {
        int position = findByID(e.getId());
        if (position <= 0) {
            ls.add(e);
        }else{
            ls.set(position, e);
        }
        return 1;
    }

    @Override
    public int del(String id) {
        int position = findByID(id);
        if (position >= 0) {
            ls.remove(position);
        }
        return position;
    }

    @Override
    public int findByID(String id) {
        int position = -1;
        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i).getId().equals(id)) {
                position = i;
                break;
            }
        }
       return position;
    }

    @Override
    public Employee getEmployeeByPosition(int index) {
        if(index >=0 && index < ls.size()){
            return ls.get(index);
        }
        return null;
    }

    @Override
    public List<Employee> openFile() {
        ls.add(new Employee("E01", "Hieu", 20, "hisu87@outlook.com", 1000000));
    }

    @Override
    public void saveFile(List<Employee> ls) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Employee> getAlls() {
        return ls;
    }

    @Override
    public int count() {
        return ls.size();
    }
}
