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
  
  public String getName() {
    return name;
  }
  
  public int equals(Object obj) {
    Country c = (Country) obj;
    
    return (this.name == c.getName());
  }
}
