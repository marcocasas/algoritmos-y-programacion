public class MUN {
  private String name;
  private String place;
  private double cost;
  private LIO <Committee> committeeList;
  
  public MUN() {
    committeeList = new LIO <Committee> ();
  }
  
  public MUN(String name, String place, String cost) {
    this();
    this.name = name;
    this.place = place;
    this.cost = cost;
  }
  
  public double calculateProfits() {
    
  }
}
