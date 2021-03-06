public class Delegate implements Comparable <Delegate> {
  private String name;
  private boolean paymentStatus;
  private String school;
  private Country country;
  private int delegateNumber;
  
  private static int delegateNumberMaster = 1;
  
  public Delegate() {
    paymentStatus = false;
    delegateNumber = delegateNumberMaster;
    delegateNumberMaster++;
  }
  
  public Delegate(String name, String school) {
    this();
    this.name = name;
    this.school = school.toUpperCase();
  }
  
  public Delegate(int delegateNumber) {
    delegateNumber = delegateNumber;
  }
  
  public void registerPayment() {
    paymentStatus = true;
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
  
  public boolean getPaymentStatus() {
    return paymentStatus;
  }
  
  public int getDelegateNumber() {
    return delegateNumber;
  }
  
  public void setCountry(Country c) {
    country = c; 
  }
  
  public int compareTo(Delegate other) {
    return (this.delegateNumber - other.delegateNumber);
	}
  
  public String toString() {
    StringBuilder str = new StringBuilder();
    
    str.append("Nombre: " + name + "\n");
    str.append("Country: " + country.getName() + "\n");
    str.append("Delegate Number: " + delegateNumber + "\n");
    str.append("School: " + school + "\n");
    str.append("Payment Status: " + paymentStatus + "\n");
    
    return str.toString();
  }
}
