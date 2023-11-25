public class Game {
  private String Name;
  private String Platform;
  private String DateOfPurchase;

  public Game() {
    this.Name = "N/A";
    this.Platform = "N/A";
    this.DateOfPurchase = "N/A";
  }

  public Game(String name, String platform, String dateOfPurchase) {
    this.Name = name;
    this.Platform = platform;
    this.DateOfPurchase = dateOfPurchase;
  }

  public String getName() {
    return Name;
  }

  public void setName(String setName) throws IllegalArgumentException {
    if (Name != null && !Name.isEmpty()) {
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
    if (Platform != null && !Platform.isEmpty()) {
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
    if (DateOfPurchase != null && !DateOfPurchase.isEmpty()) {
      this.DateOfPurchase = setDateOfPurchase;
    } 
    else {
      throw new IllegalArgumentException("Invalid entry, check and try again");
    }
  }
}


