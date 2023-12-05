import java.util.Scanner;

public class Game {
  private String Name;
  private String Platform;
  private String DateOfPurchase;

  public Game() {
    this.Name = "N/A";
    this.Platform = "N/A";
    this.DateOfPurchase = "N/A";
  }

  public Game(String name, String platform, String dateOfPurchase) throws IllegalArgumentException {
    if (name != null && !name.isEmpty()) {
      this.Name = name;
    } else {
      throw new IllegalArgumentException("Invalid entry, check and try again");
    }
    if (platform != null && !platform.isEmpty()) {
      this.Platform = platform;
    } else {
      throw new IllegalArgumentException("Invalid entry, check and try again");
    }
    if (dateOfPurchase != null && !dateOfPurchase.isEmpty()) {
      this.DateOfPurchase = dateOfPurchase;
    } else {
      throw new IllegalArgumentException("Invalid entry, check and try again");
    }
  }

  public String getName() {
    return Name;
  }

  public void setName(String setName) throws IllegalArgumentException {
    if (setName != null && !setName.isEmpty()) {
      this.Name = setName;
    } 
    else {
      throw new IllegalArgumentException("Invalid entry, check and try again");
    }
  }

  public String getPlatform() {
    return Platform;
  }

  public void setPlatform(String setPlatform) {
    if (setPlatform != null && !setPlatform.isEmpty()) {
      this.Platform = setPlatform;
    } 
    else {
      throw new IllegalArgumentException("Invalid entry, check and try again");
    }
  }

  public String getDateOfPurchase() {
    return DateOfPurchase;
  }

  public void setDateOfPurchase(String setDateOfPurchase) {
    if (setDateOfPurchase != null && !setDateOfPurchase.isEmpty()) {
      this.DateOfPurchase = setDateOfPurchase;
    } 
    else {
      throw new IllegalArgumentException("Invalid entry, check and try again");
    }
  }

  public void displayDetails() {
    System.out.println("Name: " + getName());
    System.out.println("Platform: " + getPlatform());
    System.out.println("D.O.P.: " + getDateOfPurchase());
  }

  public void editGame() {
    Scanner userInput = new Scanner(System.in);

    System.out.println("Enter new name:");
    String newName = userInput.nextLine();
    this.setName(newName);
    System.out.println("Enter new platform:");
    String newPlatform = userInput.nextLine();
    this.setPlatform(newPlatform);
    System.out.println("Enter new date of purchase:");
    String newDateOfPurchase = userInput.nextLine();
    this.setDateOfPurchase(newDateOfPurchase);
  }
}