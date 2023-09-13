/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author numpa
 */
public class StudentsDAO {

    public static List<Students> lsStu = new ArrayList<>();

    public int add(Students st) {
        lsStu.add(st);
        return 1;
    }

    public int findStudentByID(String id) {
        for (int i = 0; i < lsStu.size(); i++) {
            if (lsStu.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public int update(Students st) {
        int pos = findStudentByID(st.getId());
        if (pos < 0) {
            return -1;
        } else {
            lsStu.set(pos, st);
        }
        return pos;
    }

    public int del(String id) {
        int pos = findStudentByID(id);
        if (pos < 0) {
            return -1;
        } else {
            lsStu.remove(pos);
        }
        return pos;
    }

    public List<Students> getAll() {
        return lsStu;
    }
    public void getoderByName(){
        Comparator<Students> com = new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return o1.spilitName(o1.getName).compareTo(o2.spilitName(s2.spilitName(o2.getName))));
            }
        };
        Collections.sort(lsStu, null);
    }
}
