//CurrencyDriver.java
package a03;

import util1228.Utilities;

/**
 * This is the driver program for a currency converter that converts command
 * line arguments in eur,usd,and jpy to cad.
 *
 * @author Joshua Young (A00000000)
 *
 */
public class CurrencyDriver {

    /////////////////////////////////////////////////
    ////////CHANGE TO YOUR INFORMATION//////////////
    public static final String NAME = "Walimini Devage, Shevan";
    public static final String A_NUMBER = "A00490556";
    /////////////////////////////////////////////////
    ////////////////////////////////////////////////

    public static final double EUR_CAD = 1.52;
    public static final double USD_CAD = 1.29;
    public static final double JPY_CAD = 0.011;

    public static void main(String[] args) {

        //if there are no command line parameters
        if (args.length == 0) {

            //call the method that displays the info header
            Utilities.displayInfo(NAME, A_NUMBER, "03",
                    "This program takes currency amounts in Euros (EUR), "
                    + "US Dollars (USD) and Japanese \nYen (JPY) as "
                    + "command line parameters and converts them to "
                    + "Canadian Dollars (CAD).\nThe correct format for"
                    + " the command line parameters is at least one "
                    + "digit (possibly \nmore) followed by a '.' "
                    + "followed by exactly 2 digits followed by a 3 "
                    + "character\ncurrency code (ignoring upper or "
                    + "lower case). ");

            //call the method to pause
            Utilities.pause("Press enter to end... ");
        } //if there are command line parameters
        else {
            //create a new currencyConverter object 
            //by providing the conversion rates to the constructor
            CurrencyConverter c = 
                    new CurrencyConverter(EUR_CAD, USD_CAD, JPY_CAD);

            //for each command line parameter
            for (String s : args) {
                //call the object's convert method on that parameter.
                c.convert(s);
            }
            //call the method to pause
            Utilities.pause("\nPress enter to end...");
        }

    }

}
