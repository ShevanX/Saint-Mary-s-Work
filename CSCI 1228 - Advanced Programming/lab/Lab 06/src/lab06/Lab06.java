/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab06;
import autos.*;
import java.util.Arrays;

/**
 *
 * @author sheva
 */
public class Lab06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        MotorVehicle[] mArray = new MotorVehicle[4];
        
        mArray[0] = new Car("Chevrlot", "Cruze", 2012, 4);
        mArray[1] = new Truck("Freightliner", "Century", 2008, 18);
        mArray[2] = new Car("Honda", "Civic", 2009, 2);
        mArray[3] = new Truck("Ford", "F150", 2006, 4);
        
        
        Arrays.sort(mArray);
        
        for(MotorVehicle m1: mArray){
            m1.display();
        }
    }
    
}
