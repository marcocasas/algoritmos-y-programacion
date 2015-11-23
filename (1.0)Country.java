public class Country () {
  private String name;
  private boolean assigned;
  
  public Country() {
  }
  
  public Country (String name) {
    this.name = name.toUpperCase();
    assigned = false;
  }
  
  public Country (String name) {
    this.name = name;
  }
  
  public boolean assign() {
    assigned = true;
  }
}
