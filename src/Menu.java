import java.util.Scanner;

public class Menu {

    private Scanner input = new Scanner(System.in);
    public void mainMenu() {
        System.out.println("Welcome to the library!");
        System.out.println("Please select a login.");
        System.out.println("[1] - Librarian.");
        System.out.println("[2] - User.");

        try{
        String selection = input.nextLine();

        switch(selection) {
            case "1":
                //Librarian menu method.
                break;
            case "2":
                //User menu method.
            default:
                System.out.println("Default!");
        }
        } catch (Exception e) {
            System.out.println("Fail!");
        }
    }
}
