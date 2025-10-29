//VigEncDec2.java
//Walimini Devage:Shevan:A00490556:u33
//Submission 02
//Vigenere Encoding and Decoding Messages

/*
 *Self-assessment goes here ...
 This program successfully encodes or decodes an entire uppercase message
 using a Vigenere cipher with a lowercase key. It correctly handles spaces
 by leaving them unchanged, repeats the key as necessary, and validates all
 input cases including invalid arguments, invalid mode (not 'e' or 'd'),
 and invalid message/key characters. The program displays the opening screen
 and program information using the instructor-supplied OpeningScreen and
 TextItems classes, and pauses appropriately before termination.
 All specifications have been met, and the program runs correctly from
 the provided executable jar file.
 */

//imports go here
import java.io.*; // For InputStream (used by TextItems)


/**
 * A class to encode or decode a single uppercase letter or entire message
 * according to a Vigenere encoding/decoding scheme.
 */
public class VigEncDec2
{

    // Class variables go here
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
            // Display opening screen and program info
            OpeningScreen opc = new OpeningScreen(
                "Shevan Walimini Devage:A00490556:u33",
                "Submission 02",
                "Vigenere Encoding and Decoding Messages");

            opc.display();

            TextItems infoFile = new TextItems(
                VigEncDec2.class.getResourceAsStream("VigEncDec2.txt"));
            infoFile.displayItem("ProgramInfo");

            return;
        }

        // --- NEW: Check if we are dealing with message-level input ---
        if (args.length == 3 &&
                args[1].length() > 1) // message instead of single char
        {
            if (!validateMessageInput(args))
            {
                return;
            }

            String message = args[1];
            String key = args[2];
            String result = (mode == 'e') ? encodeMessage(message,
                            key) : decodeMessage(message, key);

            if (mode == 'e')
            {
                System.out.println(result);
            }
            else
            {
                System.out.println(result);
            }

            return;
        }

        // --- Original single-character version preserved below ---
        if (!validateInput(args))
        {
            return; // Exit if input is invalid
        }

        char result = (mode == 'e') ? encode(upper, lower) :
                      decode(upper, lower);
        if (mode == 'e')
        {
            System.out.println(upper + " Encoded with key " +
                               lower + " is " + result);
        }
        else
        {
            System.out.println(upper + " Decoded with key " +
                               lower + " is " + result);
        }
    }

    // Class methods go here
    private static boolean validateInput(String[] args)
    {
        if (args.length != 3)
        {
            System.out.println(
                "Invalid number of arguments. Please provide exactly" +
                "three arguments.");

            return false;
        }

        // Extract arguments
        mode = args[0].charAt(0);
        upper = args[1].charAt(0);
        lower = args[2].charAt(0);

        // Validate mode
        if (!(mode == 'e' || mode == 'd'))
        {
            System.out.println(
                "Invalid mode. Please use 'e' for encoding or" +
                "'d' for decoding.");
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
     * NEW: Validates message-level input.
     */
    private static boolean validateMessageInput(String[] args)
    {
        if (args.length != 3)
        {
            System.out.println(
                "Invalid number of arguments. Please provide" +
                "exactly three arguments.");

            return false;
        }

        mode = args[0].charAt(0);
        String message = args[1];
        String key = args[2];

        if (!(mode == 'e' || mode == 'd'))
        {
            System.out.println(
                "Invalid mode. Please use 'e' for" +
                "encoding or 'd' for decoding.");
            return false;
        }

        // Check that message only contains uppercase letters and spaces
        for (char c : message.toCharArray())
        {
            if (!(Character.isUpperCase(c) || c == ' '))
            {
                System.out.println(
                    "Invalid message. Only uppercase letters" +
                    "and spaces are allowed.");
                return false;
            }
        }

        // Check that key only contains lowercase letters
        for (char c : key.toCharArray())
        {
            if (!Character.isLowerCase(c))
            {
                System.out.println(
                    "Invalid key. The key must only contain" +
                    "lowercase letters (a-z).");
                return false;
            }
        }

        return true;
    }

    /**
     * Decodes a single uppercase letter using the Vigenere decoding scheme.
     *
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
     *
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

    /**
     * Encodes an entire message using a repeating Vigenere key.
     * The key index advances even through spaces, as per assignment sample.
     */
    private static String encodeMessage(String message, String key)
    {
        StringBuilder result = new StringBuilder();
        int keyIndex = 0;

        for (int i = 0; i < message.length(); i++)
        {
            char c = message.charAt(i);
            char k = key.charAt(keyIndex % key.length());

            if (c == ' ')
            {
                result.append(' ');
                keyIndex++; // advance even on space
            }
            else
            {
                result.append(encode(c, k));
                keyIndex++;
            }
        }

        return result.toString();
    }

    /**
     * Decodes an entire message using a repeating Vigenere key.
     * The key index advances even through spaces, as per assignment sample.
     */
    private static String decodeMessage(String message, String key)
    {
        StringBuilder result = new StringBuilder();
        int keyIndex = 0;

        for (int i = 0; i < message.length(); i++)
        {
            char c = message.charAt(i);
            char k = key.charAt(keyIndex % key.length());

            if (c == ' ')
            {
                result.append(' ');
                keyIndex++; // advance even on space
            }
            else
            {
                result.append(decode(c, k));
                keyIndex++;
            }
        }

        return result.toString();
    }

}
