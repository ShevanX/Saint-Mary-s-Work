//TestTextItems.java

public class TestTextItems
{
    public static void main(String[] args)
    {
        TextItems infoFile = new TextItems
        (
            TestTextItems.class.getResourceAsStream("info.txt")
        );
        infoFile.displayItem("Item 1");
    }
}

