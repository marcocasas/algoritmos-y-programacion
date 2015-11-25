public class Committee implements Comparable <Committee> {
  private String president;
  private String name;
  //private LIO <Chair> committeeChair;
  private LIO <Delegate> delegatesList;
  //private LID <String> countriesList[];
  private LID <Country> countriesList;
  //private final int MAX_COUNTRIES = 35;
  
  public Committee() {
    //committeChair = new LIO <Chair> ();
    delegatesList = new LIO <Delegate> ();
    countriesList = new LID <Country> ();
  }
  
  public Committee(String name, String president) {
    this();
    this.name = name;
    this.president = president;
  }
  
  public String toString() {
    StringBuilder str;
    
    str.append("Committee: ").append(name).append("\n");
    str.append("President: ").append(president).append("\n");
    
    for(int i = 0; i<delegatesList.size(); i++) {
      str.append(delegatesList.get(i));
    }
  }
  
  public boolean registerListOfCountries() {
    Scanner read = new Scanner(new File("CList"));
    
    try {
      int i = 0;
        while(read.hasNext()) {
          countriesList[i] = read.nextLine();
          i++;
        }
    } catch (Exception e) {
      System.out.println("File reading error.");
      System.exit(-1);
    }
  }
  
  public boolean registerDelegate(String name, String school) {
    Delegate d = new Delegate(name, school);
    
    delegatesList.add(d);
  }
  
  public int compareTo(Object obj) {
    Committee c = (Committee) obj;

    return (delegatesList.size() - c.delegatesList.size());
  }
  
  public int getNumberOfDelegates() {
    return delegatesList.size();
  }
  
  public String setDelegatesCountry(int delegateNumber, String country) {
    
    String resp;
    
    Country c = new Country(country);
    Delegate d = new Delegate(delegateNumber);
    
    int countryIndex = countriesList.indexOf(c);
    int delegateIndex = delegatesList.indexOf(d);
    
    if (countryIndex > 0 && delegateIndex > 0) {
      if (delegateIndex > 0) {
        delegatesList.get(delegateIndex).setCountry(c); 
        resp = "Register succesfull!";
        c.assignStatus();
      }
      
      else {
        resp = "Delegate not listed.";
      }
    }
    
    else {
      resp = "Country not listed."
    }
      
    return resp;
  }
  
  public boolean addCountry(String country) {
    return countriesList.add(new Country (country));
  }
  
  public boolean removeCountry(String country) {
    return countriesList.remove(new Country (country));
  }
  
  public boolean checkDelegatePaymentStatus(int delegateNumber) {
    Delegate d = new Delegate(delegateNumber);
    int delegateIndex = delegatesList.indexOf(d);
    
    return delegatesList.get(delegateIndex).getPaymentStatus();
  }
  
  public boolean checkCountryAssignation(String countryName) {
    Country c = new Country (countryName);
    int countryIndex = countriesList.indexOf(c);
    
    return countriesList.get(countriesIndex).getStatus();
    
  }
}
