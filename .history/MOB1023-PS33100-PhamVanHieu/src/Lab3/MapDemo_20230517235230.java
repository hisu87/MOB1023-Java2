/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3;

/**
 *
 * @author numpa
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, Students> map = new HashMap<>();
        Students st1 = new Students("1", "Hieu", 9, "CNTT");
        Students st2 = new Students("2", "Hieu", 9, "CNTT");
        Students st3 = new Students("3", "Hieu", 9, "CNTT");
        Students st4 = new Students("4", "Hieu", 9, "CNTT");
        Students st5 = new Students("5", "Hieu", 9, "CNTT");
        map.put(st1.getId(), st1);
        map.put(st2.getId(), st2);
        map.put(st3.getId(), st3);
        map.put(st4.getId(), st4);
        map.put(st5.getId(), st5);
        Set<String> keys = map.keySet();
        for
    }
}
