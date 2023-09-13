/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.vn.itf;

import edu.vn.models.Employee;
import java.util.List;

/**
 *
 * @author numpa
 */
public interface InterfaceEmployee {
    int save(Employee e);
    int del(String id);
    int findByID(String id);
    Employee getEmployeeByPosition (int index);
    List<Employee> openFile();
    void saveFile(List<Employee> ls);
    List <Employee> getAlls();
    int count();
}
