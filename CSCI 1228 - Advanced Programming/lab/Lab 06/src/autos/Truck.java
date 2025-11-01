/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package autos;

/**
 *
 * @author Shevan Nadiranga
 */
public class Truck extends MotorVehicle {
    
    private int numWheels;
    
    public Truck(String make, String model, int year, int wheels){
        
        super(make, model, year);
        numWheels = wheels;
    }
    
    public int getNumWheels(){
        return numWheels;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println(numWheels + " wheel");
    }
    
    @Override
    public int compareTo(Object o){
        
        if(o instanceof Truck){
            Truck t  = (Truck)o;
            if(this.numWheels > t.numWheels){
                return 1;
                
            }else if(this.numWheels == t.numWheels){
                return 0;
            }else{
                return -1;
            }
        }
        
        if(o instanceof Car){
            
            return 1;
        }
        return -1;
    }
    

}
