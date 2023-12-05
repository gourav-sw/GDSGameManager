import java.util.Scanner;

public class PhysicalGame extends Game{
  protected String Format;
  protected int NumberOfDiscs;
  protected String Condition;

  public PhysicalGame() {
    super();
    this.Format = "Physical Game";
    this.NumberOfDiscs = 0;
    this.Condition = "N/A";
  }

  public PhysicalGame(String name, String platform, String dateOfPurchase, int numberOfDiscs, String condition) {
    super(name, platform, dateOfPurchase);
    this.Format = "Physical Game";
    this.NumberOfDiscs = numberOfDiscs;
    this.Condition = condition;
  }

  public String getFormat() {
    return Format;
  }

  public int getNumberOfDiscs() {
    return NumberOfDiscs;
  }

  public void setNumberOfDiscs(int setNumberOfDiscs) throws IllegalArgumentException {
    if (setNumberOfDiscs >= 0) {
      this.NumberOfDiscs = setNumberOfDiscs;
    } 
    else {
      throw new IllegalArgumentException("Invalid entry, check and try again");
    }
  }

  public String getCondition() {
    return Condition;
  }

  public void setCondition(String setCondition) throws IllegalArgumentException {
    if (setCondition != null && !setCondition.isEmpty()) {
      this.Condition = setCondition;
    } 
    else {
      throw new IllegalArgumentException("Invalid entry, check and try again");
    }
  }

  @Override
  public void displayDetails(){
    super.displayDetails();
    System.out.println("Format: " + getFormat());
    System.out.println("No. of Discs: " + getNumberOfDiscs());
    System.out.println("Condition: " + getCondition());
  }

  @Override
  public void editGame() {
    super.editGame();
    Scanner userInput = new Scanner(System.in);

    System.out.println("Enter new no. of discs: ");
    int newNumberOfDiscs = userInput.nextInt();
    this.setNumberOfDiscs(newNumberOfDiscs);
    userInput.nextLine();
    System.out.println("Enter new condition: ");
    String newCondition = userInput.nextLine();
    this.setCondition(newCondition);
  }
}