/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a03;

/**
 *
 * @author Shevan Nadiranga
 * A00490556
 * Assignment 02
 * 
 */
public class CurrencyConverter {
    
    
    //instance constants
    private final double EUR_CONV;
    private final double JPY_CONV;
    private final double USD_CONV;
    
    public CurrencyConverter(double eur, double jpy, double usd){
        
        this.EUR_CONV = eur;
        this.JPY_CONV = jpy;
        this.USD_CONV = usd;
        
    }
    
    public void convert(String input){
        
        boolean isValid = checkValidity(input);
        
            
        double converted = conversion(isValid, input);
            
            
        getOutput(isValid, converted, input);
        
    }
    
    private boolean checkValidity(String num) {
        boolean allDigits = false;

        if (num.length() >= 7) {

            String currency = num.substring(num.length() - 3).toUpperCase();
            String numPart = num.substring(0, num.length() - 3);

            if (currency.equals("USD") || currency.equals("JPY") 
                    || currency.equals("EUR")) {

                if (num.charAt(numPart.length() - 3) == '.') {

                    char d1 = numPart.charAt(numPart.length() - 2);
                    char d2 = numPart.charAt(numPart.length() - 1);

                    if (Character.isDigit(d1) && Character.isDigit(d2)) {

                        String amount = numPart.substring(0, 
                                numPart.length() - 3);
                        allDigits = true;

                        for (int i = 0; i < amount.length(); i++) {
                            if (!Character.isDigit(amount.charAt(i))) {
                                allDigits = false;
                                break;
                            }
                        }
                    }

                }

            }

        }
        return allDigits;
    }
    /**
     * This method converts the input according to the currency code if its 
     * valid
     * 
     * @param allDigits is the validity of the input
     * @param num is the command line input
     * @return it returns a double variable which is the converted amount
     */
    private double conversion(boolean allDigits, String num){
        double converted = 0.0;
        if(allDigits){
            String code = num.substring(num.length() - 3).toUpperCase();
            double amount = Double.parseDouble(num.substring(0, 
                    num.length() - 3));
            
            switch (code){
                case "USD":
                    converted = amount * USD_CONV;
                    break;
                    
                case "JPY":
                    converted = amount * JPY_CONV;
                    break;
                    
                case "EUR":
                    converted = amount * EUR_CONV;
                    break;
            }
        }
        return converted;
    }
    /**
     * This method gives the output according to the currency code
     * @param allDigits check the validity
     * @param converted this is the converted amount
     * @param num this is the original input from command line
     */
    private void getOutput(boolean allDigits, double converted, 
            String num){
        if(allDigits){
            String code = num.substring(num.length() - 3).toUpperCase();
            String amount = num.substring(0, num.length() - 3);
            
            
            String symbol = "";
            switch(code){
                case "EUR":
                        symbol = "€";
                        break;
                case "JPY":
                        symbol = "¥";
                        break;
                case "USD":
                        symbol = "$";
                        break;
                        
            }
            
            System.out.printf("%s%s %s is $%.2f CAD.%n", symbol, 
                    amount, code, converted);
                     
        } else {
            System.out.println("Error: invalid input " + num + ".");
        }
    }

}
