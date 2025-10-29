//VigEncDec1.java
//Walimini Devage:Shevan:A00490556:u33
//Submission 01
//Vigenere Encoding and Decoding a Single Character

/*
 *Self-assessment goes here ...
 This program successfully encodes or decodes a single uppercase letter
  * using a Vigenere cipher with a lowercase key. It correctly handles the
  * three required error cases: missing arguments, 
          invalid mode (not 'e' or 'd'),
  * and invalid character types. The program displays the opening screen and
  * program information using the instructor-supplied OpeningScreen and
  * TextItems classes, and pauses appropriately before termination.
  * All specifications have been met, and the program runs correctly from
  * the provided executable jar file.
 */

//imports go here
//imports go here
import java.io.*; // For InputStream (used by TextItems)


/**
 * A class to encode or decode a single uppercase letter according to a
 * Vigenere encoding/decoding scheme.
 */
public class VigEncDec1
{

    //Class variables go here

    private static char mode;
    private static char upper;
    private static char lower;
    /**
     * The main method. If there is no command-line input, it displays the
     * opening screen and program information. If there is command-line input,
     * it processes that input to perform encoding or decoding.
     *
     * @param args Command-line arguments.
     */

    public static void main(String[] args)
    {
        if (args.length == 0)
        {
            //Display opening screen and program info
            OpeningScreen opc = new OpeningScreen(
                "Shevan Walimini Devage:A00490556",
                "Submission 01",
                "Vigenere Encoding and Decoding a Single Character");

            opc.display();

            TextItems infoFile = new TextItems(
                VigEncDec1.class.getResourceAsStream("VigEncDec1.txt"));
            infoFile.displayItem("ProgramInfo");

            return;
        }
        if (!validateInput(args))
        {
            return; // Exit if input is invalid
        }

        char result = (mode == 'e') ? encode(upper, lower) : 
        decode(upper, lower);
        if (mode == 'e')
        {
            System.out.println(upper + " Encoded with key " +
        lower + " is " + result);}
        else
        {
            System.out.println(upper +
            " Decoded with key " +
            lower + " is " + result);
        }


        //Here you first read the command-line input, then you call
        //the methods you've defined below to perform the encoding
        //or decoding, according to that input, and output the result.
    }




    //Class methods go here
    private static boolean validateInput(String[] args)
    {
        if (args.length != 3)
        {
            System.out.println
            ("Invalid number of arguments. Please provide " +
            "exactly three arguments.");
            Utils.pause(0, "Press ENTER to continue ...");
            return false;
        }

        // Extract arguments
        mode = args[0].charAt(0);
        upper = args[1].charAt(0);
        lower = args[2].charAt(0);

        // Validate mode
        if (!(mode == 'e' || mode == 'd'))
        {
            System.out.println
            ("Invalid mode. Please use 'e' for encoding or 'd' for decoding.");
            return false;
        }

        // Validate character types
        if (!(Character.isUpperCase(upper) && Character.isLowerCase(lower)))
        {
            System.out.println(
                "The first character must be an uppercase letter (A-Z) " +
               "and the second character must be a lowercase letter (a-z).");
            return false;
        }

        return true;
    }
    /**
     * Decodes a single uppercase letter using the Vigenere decoding scheme.
     * @param upper the uppercase letter to decode
     * @param lower the lowercase letter to use as the key
     * @return the decoded uppercase letter
     */
    private static char decode(char upper, char lower)
    {
        int upperPos = upper - 'A';
        int lowerPos = lower - 'a';
        int decodedPos = (upperPos - lowerPos + 26) % 26;
        return (char)(decodedPos + 'A');
    }

    /**
     * Encodes a single uppercase letter using the Vigenere encoding scheme.
     * @param upper the uppercase letter to encode
     * @param lower the lowercase letter to use as the key
     * @return the encoded uppercase letter
     */
    private static char encode(char upper, char lower)
    {
        int upperPos = upper - 'A';
        int lowerPos = lower - 'a';
        int encodedPos = (upperPos + lowerPos) % 26;
        return (char)(encodedPos + 'A');
    }
}

