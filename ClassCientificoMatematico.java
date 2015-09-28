public class CientificoMatematico {
  private String name, spezArea;
  
  public CientificoMatematico() {
  }
  
  public CientificoMatematico(String name, String spezArea) {
    this.name = name;
    this.spezArea = spezArea;
  }
  
  public String getName() {
    return name;
  }
  
  public String getSpezArea() {
    return spezArea;
  }
  
  public void setSpezArea(String newSpezArea) {
    spezArea = newSpezArea;
  }
  
  public String toString() {
    return "\n Nombre: " + name + "\n Area: " + spezArea;
  }
  
  public boolean equals (CientificoMatematico other) {
    return nom.equals(other.nom);
  }
  
  public int compareTo(CientificoMatematico other) {
    int resp = nom.compareTo(other.nom);
    return resp;
  }
}
