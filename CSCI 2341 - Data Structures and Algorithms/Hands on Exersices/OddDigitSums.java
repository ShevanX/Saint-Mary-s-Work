import java.util.ArrayList;


public class OddDigitSums
{


    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < args.length; i++)
        {
            numbers.add(Integer.parseInt(args[i]));
        }

        System.out.println();
        System.out.println("Programmed by Shevan Walimini: K343");
        ArrayList<Integer> oddNums = new ArrayList<>();
        int sum = 0;
        for (int n : numbers)
        {
            if (isOdd(n))
            {
                oddNums.add(n);
                sum += n;
            }
        }

        System.out.print("Values entered: ");
        numbers.forEach(n -> System.out.print(n + " "));
        System.out.print("\nValues with an odd digit sum: ");
        oddNums.forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.println("Sum of values with an odd digit number: " + sum);
        System.out.println();

    }

    private static boolean isOdd(int number)
    {
        int digitSum = 0;
        while (number > 0)
        {
            digitSum += number % 10;
            number /= 10;
        }
        return digitSum % 2 != 0;
    }


}