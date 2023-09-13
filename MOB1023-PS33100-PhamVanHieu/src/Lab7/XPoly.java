/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

public class XPoly {
    @Deprecated
    public static boolean isCardNumber(String number) {
        int n = Integer.parseInt(number);
        
        int tong = 0;
        //12345
        while (n > 0) {            
            int a = n % 10;//5
            tong += a;
            n = n / 10;//0,1
        }
        
        return tong % 2 == 0;
        
    }
    
}
