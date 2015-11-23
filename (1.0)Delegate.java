public class Delegate implements Comparable <Delegate> {
  private String name;
  private boolean paymentStatus;
  private String school;
  //private String country;
  private Country country;
  private int delegateNumber;
  
  private static int delegateNumberMaster = 1;
  
  public Delegate() {
    paymentStatus = false;
    delegateNumber = delegateNumberMaster;
    delegateNumberMaster++;
  }
  
  public Delegate(String name, String school, String countryName) {
    this();
    this.name = name;
    this.school = school.toUpperCase();
    this.country = new Country(countryName);
  }
  
  public void registerPayment() {
    payment = true;
  }
  
  public String getName() {
    return name;
  }
  
  public String getSchool() {
    return school;
  }
  
  public String country() {
    return country;
  }
  
  public int getDelegateNumber() {
    return delegateNumber;
  }
}
