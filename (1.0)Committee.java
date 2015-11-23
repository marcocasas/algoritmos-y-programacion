public class Committee implements Comparable <Committee> {
  private String president;
  private String name;
  //private LIO <Chair> committeeChair;
  private LIO <Delegate> delegatesList;
  //private LID <String> countriesList[];
  private LID <Country> countriesList[];
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
  
  public int compareTo(Object obj) {
    Committee c = (Committee) obj;

    return (delegatesList.size() - c.delegatesList.size());
  }
  
  public int numberOfDelegates() {
    return delegatesList.size();
  }
  
  public boolean setDelegatesCountry(int delegateNumber, String country) {
    
    Country c = new Country(country);
    Delegate d = new Delegate(delegateNumber);
    
    int countryIndex = countriesList.indexOf(c);
    int pos
    
    if ( pos > 0 && !(countriesList.get(pos).getStatus()))
      delegatesList.get(delegatesList.indexOf(d)).setCountry(c);
    
  }
}
