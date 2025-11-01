/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package properties;

/**
 *
 * @author Shevan Nadiranga
 */
public class Building {

    private Apartment[] apt;
    private int numApts;

    public Building(int Apts) {

        this.apt = new Apartment[Apts];
        this.numApts = 0;
    }

    public void addUnit(Apartment a) {

        if (numApts < apt.length) {

            for (int i = 0; i < apt.length; i++) {
                if (apt[i] == null) {
                    apt[i] = a;
                    numApts++;
                    break;
                }
            }
        } else {
            System.out.println("Cannot add another apartment the building is "
                    + "full");
        }
    }

    public int collectRent() {
        int rent = 0;
        for (int i = 0; i < apt.length; i++) {
            if (apt[i] != null && apt[i].isOccupied) {
                rent += apt[i].Rent;
            }
        }
        return rent;
    }

    public Apartment[] getUnits() {
        Apartment[] copy = new Apartment[numApts];
        for (int i = 0; i < numApts; i++) {
            if (apt[i] != null) {
                copy[i] = new Apartment(apt[i]);
            }
        }
        return copy;

    }

    @Override
    public String toString() {
        if (numApts == 0) {
            return "This building has no apartments.";
        }

        String s = "This building has the following apartments:\n\n";
        for (int i = 0; i < numApts; i++) {
            s += apt[i].toString() + "\n";
        }

        return s;
    }

}
