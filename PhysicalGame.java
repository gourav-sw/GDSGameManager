public class PhysicalGame extends Game{
  int NumberOfDiscs;
  String Condition;

  public PhysicalGame() {
    super();
    this.NumberOfDiscs = 0;
    this.Condition = "N/A";
  }

  public PhysicalGame(String name, String platform, String dateOfPurchase, int numberOfDiscs, String condition) {
    super(name, platform, dateOfPurchase);
    this.NumberOfDiscs = numberOfDiscs;
    this.Condition = condition;
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
}

  