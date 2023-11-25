import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  private static List<Game> GameList = new ArrayList<>();
  private static Scanner userInput;
  public static void main(String[] args) {
    userInput = new Scanner(System.in);
    do {
      int userChoice = displayMenu();
      if (userChoice == 1) {
        addNewGame();
      } else if (userChoice == 2) {
        displayGameList();
      } else if (userChoice == 3) {
        System.out.println("Exiting the program...");
        break;
      }
    } while (true);
  }

  private static int displayMenu() {
    int userChoice = 0;

    while (true) {
      System.out.println("GDS Game Manager");
      System.out.println("1. Add a game");
      System.out.println("2. List all games in library");
      System.out.println("3. Exit");
      System.out.println("Enter your choice: ");
      userChoice = userInput.nextInt();
      userInput.nextLine();
      if (userChoice >= 1 && userChoice <= 3) {
        break;
      } else {
        System.out.println("Invalid input, please try again!");
      }
    }
    return userChoice;
  }

  private static void addNewGame() {
    System.out.println("Enter the name: ");
    String name = userInput.nextLine();
    System.out.println("Enter the platform: ");
    String platform = userInput.nextLine();
    System.out.println("Enter the date of purchase: ");
    String dateOfPurchase = userInput.nextLine();

    Game newGame = new Game(name, platform, dateOfPurchase);
    GameList.add(newGame);
    System.out.println("Added to library successfully!");
  }

  private static void displayGameList() {
    System.out.println("Game Library:");
    for (Game game : GameList) {
      System.out.println("Name: " + game.getName());
      System.out.println("Platform: " + game.getPlatform());
      System.out.println("D.O.P.: " + game.getDateOfPurchase());
    }
  }

}