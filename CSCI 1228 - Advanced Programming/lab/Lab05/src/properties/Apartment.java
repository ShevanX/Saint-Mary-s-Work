/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package properties;

/**
 *
 * @author Shevan Nadiranga
 */
public class Apartment {

    //instance constants
    public final int UNIT_NUM;
    public final int NUM_BEDROOMS;

    //instance variables
    public int Rent;
    public boolean isOccupied;

    /**
     * Primary constructor for the class Apartment
     *
     * @param unitNum number of the unit
     * @param numOfRooms number of rooms
     * @param rent the rent
     * @param availability the room availability
     */
    public Apartment(int unitNum, int numOfRooms, int rent, boolean isOccupied) {

        this.UNIT_NUM = unitNum;
        if (numOfRooms > 0) {
            this.NUM_BEDROOMS = numOfRooms;

        } else {
            this.NUM_BEDROOMS = 0;

        }
        if (rent > 0) {
            this.Rent = rent;
        } else {
            this.Rent = 0;
        }

        this.isOccupied = isOccupied;

    }
    
    //copy constructor
    public Apartment(Apartment a){
        this(a.UNIT_NUM, a.NUM_BEDROOMS, a.Rent, 
                a.isOccupied);
    }

    //setters
    public void setRent(int newRent) {
        if (newRent > 0) {
            this.Rent = newRent;
        } else {
            return;
        }
    }

    public void setIsOccupied(boolean available) {

        this.isOccupied = available;
    }

    //getters
    public int getUNIT_NUM() {
        return UNIT_NUM;
    }

    public int getNUM_OF_ROOMS() {
        return NUM_BEDROOMS;
    }

    public int getRent() {
        return Rent;
    }

    public boolean isOccupied() {
        return isOccupied;
    }
    
    @Override
    public String toString(){
        return "Unit " + UNIT_NUM + " " + NUM_BEDROOMS + " bedroom\n" + 
                "Rent $" + Rent 
                + " per month\n" + ((!isOccupied) ? 
                "Currently Available\n\n" : "Currently Unavailable\n\n");
    }
    
    public void moveIn(){
        if(!isOccupied){
            isOccupied = true;
            System.out.println("New tenant moved in.");
        }else{
            System.out.println("The apartment in already occupied");
        }
    }
    
    public void moveOut(){
        if(isOccupied){
            isOccupied = false;
            System.out.println("Apartment is already vacant");
        }else{
            System.out.println("Tenant moved out");
        }
    }
    
    
    public boolean equals(Apartment other){
        return (this.UNIT_NUM == other.UNIT_NUM);
    }

}
