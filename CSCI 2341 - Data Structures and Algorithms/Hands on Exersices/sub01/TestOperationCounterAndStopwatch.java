//TestOperationCounterAndStopwatch.java
public class TestOperationCounterAndStopwatch
{
    public static void main(String[] args)
    {
        OperationCounter counter = new OperationCounter();
        Stopwatch timer = new Stopwatch();
        int n = 200;
        counter.setNameOfOther("Additions");
        timer.start();
        int sum = 0;
        counter.incrementAssignments();
        timer.delay();
        for (int i=1; i<=n; i++)
        {
            sum += i;
            counter.incrementOther();
            counter.incrementAssignments();
            timer.delay(2);
        }
        timer.stop();
        counter.display();
        System.out.println("time = " + timer.getSeconds());
        Utils.pause();

        n = 20;
        timer.start();
        counter.reset();
        counter.setNameOfOther("Additions");
        sum = 0;
        counter.incrementAssignments();
        timer.delay();
        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=n; j++)
            {
                sum += i;
                counter.incrementOther();
                counter.incrementAssignments();
                timer.delay(2);
            }
        }
        timer.stop();
        counter.display();
        System.out.println("time = " + timer.getSeconds());
        Utils.pause();
    }
}
