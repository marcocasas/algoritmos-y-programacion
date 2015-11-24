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
  
  public Delegate(String name, String school, String country) {
    this();
    this.name = name;
    this.school = school.toUpperCase();
    this.country = new Country(countryName);
  }
  
  public Delegate(int delegateNumber) {
    delegateNumber = delegateNumber;
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
  
  public String getCountry() {
    return country.toString();
  }
  
  public int getDelegateNumber() {
    return delegateNumber;
  }
  
  public int compareTo(Object obj) {
    Delegate d = (Delegate) obj;
    
    return (this.delegateNumber - obj.delegateNumber);
  }
}
