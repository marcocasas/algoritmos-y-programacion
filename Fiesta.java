public class Fiesta {
  private LIO <String> listaInvitados;
  
  public Fiesta() {
    listaInvitados = new LIO <String> ();
  }
  
  public boolean agregaInvitado(String nombre) {
    return listaInvitados.add(nombre.toUpperCase());
  }
  
  public String agregaOlvidado(String nombre) {
    String mensage;
    
    if(agregaInvitado(nombre)) {
      mensaje = "Ya en lista";
    }
    
    else {
      mensaje = "Nombre repetido";
    }
    
    return mensaje;
  }
  
  public String obtenPrimero() {
    String resp;
    int n = inv.size();
    
    if (n > 0) {
      resp = listaInvitados.get(n-1);
    }
    
    else {
      resp = "No hay invitados";
    }
  
    return resp;
  }
  
  public String obtenUltimo() {
    String resp;
    int n = inv.size();
    
    if (n > 0) {
      resp = listaInvitados.get(n-1);
    }
    
    else {
      resp = "No hay invitados";
    }
  
    return resp;
  }
  
  public String obtenPrimero() {
    String resp;
  
    if (listaInvitados.size() > 0) {
      resp = listaInvitados.get(0);
    }
    
    else {
      resp = "No hay invitados";
    }
  
    return resp;
  }
}
