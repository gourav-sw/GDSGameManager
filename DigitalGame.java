public class DigitalGame {
  String Store;
  double Size;

  public DigitalGame() {
    this.Store = "N/A";
    this.Size = 0;
  }

  public DigitalGame(String name, String platform, String dateOfPurchase, String store, int size) {
    super();
    this.Store = store;
    this.Size = size;
  }

  public String getStore() {
    return Store;
  }

  public void setStore(String setStore) throws IllegalArgumentException {
    if (setStore != null && !setStore.isEmpty()) {
      this.Store = setStore;
    } 
    else {
      throw new IllegalArgumentException("Invalid entry, check and try again");
    }
  }

  public double getSize(){
    return Size;
  }

  public void setSize(double setSize) throws IllegalArgumentException {
    if (setSize > 0) {
      this.Size = setSize;
    } 
    else {
      throw new IllegalArgumentException("Invalid entry, check and try again");
    }
  }
}

