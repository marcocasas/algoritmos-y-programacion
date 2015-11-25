public class Country () {
  private String name;
  private boolean status;
  
  public Country() {
  }
  
  public Country (String name) {
    this.name = name.toUpperCase();
    assigned = false;
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
  
  public String knowIfAssigned() {
      String str;
      
      if (this.status == true) {
          str = "Yes.";
      }
      
      else {
          str = "No.";
      }
      
      return str;
  }
  
  public int equals(Object obj) {
    Country c = (Country) obj;
    
    return (this.name.equals(c.getName()));
  }
  
  public String toString() {
      StringBuilder str = new StringBuilder();
      
      str.append("Country's Name: ").append(name + "\n");
      str.append("Assigned: ").append(this.knowIfAssigned());
      
      return str.toString();
  }
}
