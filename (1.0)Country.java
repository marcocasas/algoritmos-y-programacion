public class Country () {
  private String name;
  private boolean status;
  
  public Country() {
  }
  
  public Country (String name) {
    this.name = name.toUpperCase();
    assigned = false;
  }
  
  public Country (String name) {
    this.name = name;
  }
  
  public boolean assignStatus() {
    status = true;
  }
  
  public boolean getStatus() {
    return status;
  }
}
