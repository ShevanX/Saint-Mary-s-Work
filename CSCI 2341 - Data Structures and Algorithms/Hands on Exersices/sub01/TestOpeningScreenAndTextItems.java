//TestOpeningScreenAndTextItems.java

public class TestOpeningScreenAndTextItems  
{
    public static void main(String[] args)
    {
        if (args.length == 0)
        {
            OpeningScreen openingScreen = new OpeningScreen
            (
                "Scobey:Porter:A00123456:u00",
                "Submission ##",
                "Title of Submission"
            );
            openingScreen.display();
            TextItems infoFile = new TextItems
            (
                TestTextItems.class.getResourceAsStream("info.txt")
            );
            infoFile.displayItem("Item 1");
            return;
        }
        Utils.pause(0, "\nThere was command-line input, so process it ...");
    }
}

