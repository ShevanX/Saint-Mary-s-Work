/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package autos;

/**
 *
 * @author Shevan Nadiranga
 */
public abstract class MotorVehicle implements Comparable {
    
    private String make;
    private String model;
    private int year;
    
    public MotorVehicle(String make, String model, int year){
        
        this.make = make;
        this.model = model;
        this.year = (year > 0)? year : 0;
    }
    
    public void display(){
        System.out.println(year + " " + make + " " + model);
        
    }
    
    public abstract int compareTo(Object o); 

}
