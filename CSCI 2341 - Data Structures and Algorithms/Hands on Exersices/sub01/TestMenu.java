//TestMenu.java
public class TestMenu
{
    public static void main(String[] args)
    {
        Menu menu = new Menu("My Menu");
        menu.addOption("Quit");
        menu.addOption("Get some information about this program");
        menu.addOption("Do this");
        menu.addOption("Do that");
        int menuChoice;
        do
        {
            menu.display();
            menuChoice = menu.getChoice();
            switch (menuChoice)
            {
                case 1:
                case -1:
                    Utils.pause(0, "\nProgram now terminating.");
                    break;
                case 2:
                    Utils.pause(0, "\nGetting program information.");
                    break;
                case 3:
                    Utils.pause(0, "\nDoing this.");
                    break;
                case 4:
                    Utils.pause(0, "\nDoing that.");
                    break;
            }
        }
        while (menuChoice != 1 && menuChoice != -1);
    }
}
