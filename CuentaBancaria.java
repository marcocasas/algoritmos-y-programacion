public class CuentaBancaria {
    
    private String nombre;
    private double saldo;
    private int numCuenta;
    
    private static int numCuentaMa = 0;
    
    public CuentaBancaria() {
        numCuenta = ++numCuentaMa;
    }
    
    public CuentaBancaria(String nombre) {
        this.nombre = nombre;
        saldo = 0;
        numCuenta = ++numCuentaMa;
    }
    
    public CuentaBancaria(String nombre, double deposito) {
        this.nombre = nombre;
        saldo = deposito;
        numCuenta = ++numCuentaMa;
    }
    
    public void deposito(double deposito) {
        if (deposito > 0) {
            saldo = saldo + deposito;
        }
        
        else {
            System.out.println("Operación no válida.");
        }
    }
    
    public void retiro(double retiro) {
        if (saldo >= retiro) {
            saldo = saldo - retiro;
        }
        
        else {
            System.out.println("Operación no válida.");
        }
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getCuenta() {
        return numCuenta;
    }
    
    public String toString() {
        return "Nombre: " + nombre + "\n" + "Número de cuenta: " +
                numCuenta + "\n" + "Saldo: " + saldo;
    }
    
    public int compareTo(CuentaBancaria otra) {
        int y;
        
        if (this.numCuenta > otra.numCuenta) {
            y = 10;
        }
        
        else if (this.numCuenta == otra.numCuenta) {
            y = 0;
        }
        
        else {
            y = -10;
        }
        
        return y;
    }
    
    public boolean equals(CuentaBancaria otra) {
        return this.numCuenta == otra.numCuenta;
    }
}
