public class Committee implements Comparable <Committee> {
  private String president; //Nombre del presidente del comité.
  private String name; //Nombre del comité.
  private LIO <Delegate> delegatesList; //Lista de delegados.
  private LID <Country> countriesList; //Lista de países del comité.

  public Committee() { //Constructor por omisión.
    delegatesList = new LIO <Delegate> (); //Instancio lista de delegados.
    countriesList = new LID <Country> (); //Instanciación de lista de países.
  }
  
  public Committee(String name, String president) { /*Constructor con 
                                                    nombre del comité y del presidente como parámetros.*/
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
      str.append("\n");
    }
  }
  
  public boolean registerListOfCountries() { //Método para llenado de la lista de países.
    Scanner read = new Scanner(new File("CList")); //Llenado se hace a través de un archivo de nombre "CList".
    
    try {
      int i = 0;
        while(read.hasNext()) {
          Country c = new Country(read.nextLine());
          
          if (!countrisList.contains(c)) { //Se revisa que el país a agregar no esté repetido.
            countriesList.add(c);
          }
        }
    } catch (Exception e) {
      System.out.println("File reading error.");
      System.exit(-1);
    }
  }
  
  public boolean registerDelegate(String name, String school) { //Método para agregar delegados al comité.
    Delegate d = new Delegate(name, school);
    
    delegatesList.add(d); //No se verifica que no se repita el nombre y escuela.
  }
  
  public boolean deleteDelegate(int delegateNumber) { //Método para eliminar delegado del comité.
    Delegate d = new Delegate(delegateNumber);
    
    delegatesList.remove(d);
  }
  
  public int compareTo(Object obj) { //Método de comparación de comités a través de su cantidad de delegados.
    Committee c = (Committee) obj;

    return (delegatesList.size() - c.delegatesList.size());
  }
  
  public int getNumberOfDelegates() { //Método que regresa número de delegados en el comité.
    return delegatesList.size();
  }
  
  public String setDelegatesCountry(int delegateNumber, String country) { /* Método para asignar el 
                                                                          país del delegado.
                                                                          
                                                                          Se regresa en String para
                                                                          dar a conocer al usuario
                                                                          la causa del error, si es
                                                                          que se presenta*/ 
    
    String resp;
    
    Country c = new Country(country);
    Delegate d = new Delegate(delegateNumber);
    
    int countryIndex = countriesList.indexOf(c);
    int delegateIndex = delegatesList.indexOf(d);
    
    if (countryIndex > 0 && delegateIndex > 0) { //Se verifica que el país y el delegado existan en la lista.
      if (delegateIndex > 0) {
        delegatesList.get(delegateIndex).setCountry(c); 
        resp = "Register succesfull!";
        countriesList.get(c).assignStatus();
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
  
  public boolean addCountry(String country) { //Método para añadir un nuevo país a la lista.
    return countriesList.add(new Country (country));
  }
  
  public boolean removeCountry(String country) { //Método para quitar un país de la lista.
    return countriesList.remove(new Country (country));
  }
  
  public boolean checkDelegatePaymentStatus(int delegateNumber) { //Método para conocer si el delegado ya pagó.
    Delegate d = new Delegate(delegateNumber);
    int delegateIndex = delegatesList.indexOf(d);
    
    return delegatesList.get(delegateIndex).getPaymentStatus();
  }
  
  public boolean checkCountryAssignation(String countryName) { /*Método para conocer si
                                                               determinado país ya fue asignado.*/
    Country c = new Country (countryName);
    int countryIndex = countriesList.indexOf(c);
    
    return countriesList.get(countriesIndex).getStatus();
  }
}
