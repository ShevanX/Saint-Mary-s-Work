import java.util.*;

public class SortCLNames
{
    public static void main(String[] args)
    {
        System.out.println("\nProgrammed by Shevan Walimini: M345");

        // Print the list of names entered
        System.out.println("Here is a list of the names entered:");
        for (String name : args)
        {
            System.out.println(name);
        }

        System.out.println();

        // Create a list of names for sorting
        List<String> names = new ArrayList<>(Arrays.asList(args));

        // Sort alphabetically by last name
        Collections.sort(names, new Comparator<String>()
        {
            public int compare(String a, String b)
            {
                String lastA = a.split(" ")[1];
                String lastB = b.split(" ")[1];
                return lastA.compareToIgnoreCase(lastB);
            }
        });

        System.out.println("Here they are in alphabetical order");
        System.out.println("by last name, one name per line:");
        for (String name : names)
        {
            String[] parts = name.split(" ");
            System.out.println(parts[1] + ", " + parts[0]);
        }

        System.out.println();

        // Sort reverse alphabetically by last name
        Collections.sort(names, new Comparator<String>()
        {
            public int compare(String a, String b)
            {
                String lastA = a.split(" ")[1];
                String lastB = b.split(" ")[1];
                return lastB.compareToIgnoreCase(lastA);
            }
        });

        System.out.println("Finally, here they are as entered,");
        System.out.println("but in reverse alphabetical order");
        System.out.println("by last name, one name per line:");
        for (String name : args)
        {
            System.out.println(name);
        }
        System.out.println();
    }
}
