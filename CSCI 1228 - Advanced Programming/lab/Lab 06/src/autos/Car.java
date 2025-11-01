/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package autos;

/**
 *
 * @author Shevan Nadiranga
 */
public class Car extends MotorVehicle  {
    
    private int numDoors;
    
    public Car(String make, String model, int year, int doors){
        
        super(make, model, year);
        numDoors = doors;
        
    }
    
    public int getNumDoors(){
        return numDoors;
    }
    
    @Override
    public void display(){
        
        super.display();
        System.out.println(numDoors + " door");
    }
    
    @Override
    public int compareTo(Object o){
        
        if(o instanceof Car){
            Car c  = (Car)o;
            if(this.numDoors > c.numDoors){
                return 1;
                
            }else if(this.numDoors == c.numDoors){
                return 0;
            }else{
                return -1;
            }
        }
        
        if(o instanceof Truck){
            return -1;
        }
        
        return -1;
    }
}
        
        
    
        
    
    
    
    


