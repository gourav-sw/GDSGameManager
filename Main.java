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
        displayGameList(GameList);
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

    while(true){
      System.out.println("Select the game format:");
      System.out.println("1. Physical Game");
      System.out.println("2. Digital Game");
      int userChoice = userInput.nextInt();

      if (userChoice == 1) {
        System.out.println("Enter the number of discs:");
        int numberOfDiscs = userInput.nextInt();
        userInput.nextLine();
        System.out.println("Enter the condition:");
        String condition = userInput.nextLine();

        PhysicalGame newPhysicalGame = new PhysicalGame(name, platform, dateOfPurchase, numberOfDiscs, condition);
        GameList.add(newPhysicalGame);
        System.out.println("Added to library successfully!");
        break;
      } else if (userChoice == 2) {
        System.out.println("Enter the digital store/download link");
        String store = userInput.nextLine();
        userInput.nextLine();
        System.out.println("Enter the download size");
        double size = userInput.nextDouble();

        DigitalGame newDigitalGame = new DigitalGame(name, platform, dateOfPurchase, store, size);
        GameList.add(newDigitalGame);
        System.out.println("Added to library successfully!");
        break;
      } else {
        System.out.println("Invalid choice. Please try again.");
      }
    }

    // Game newGame = new Game(name, platform, dateOfPurchase);
    // GameList.add(newGame);
    // System.out.println("Added to library successfully!");
  }

  private static void displayGameList(List<Game> gameList) {
    System.out.println("Game Library:");
    System.out.println();
    for (Game game : gameList) {
      game.displayDetails();
      System.out.println();
    }

    // for (Game game : GameList) {
    //   System.out.println("Name: " + game.getName());
    //   System.out.println("Platform: " + game.getPlatform());
    //   System.out.println("D.O.P.: " + game.getDateOfPurchase());

    //   if (game instanceof PhysicalGame) {
    //     PhysicalGame physicalGame = (PhysicalGame) game;
    //     System.out.println("Format: " + physicalGame.getFormat());
    //     System.out.println("No. of Discs: " + physicalGame.getNumberOfDiscs());
    //     System.out.println("Condition: " + physicalGame.getCondition());
    //   } else if (game instanceof DigitalGame) {
    //     DigitalGame digitalGame = (DigitalGame) game;
    //     System.out.println("Format: " + digitalGame.getFormat());
    //     System.out.println("Store: " + digitalGame.getStore());
    //     System.out.println("Size (in GB): " + digitalGame.getSize());
    //   }
    // }
  }
}