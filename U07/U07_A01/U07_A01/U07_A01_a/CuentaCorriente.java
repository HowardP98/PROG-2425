package unidad07.U07_A01;
   
    class CuentaCorriente {
    private String dni;
    private String nombre;
    private double saldo;
    
    // Constructor
    CuentaCorriente(String dni, String nombre) {
    this.dni = dni;
    this.nombre = nombre;
    this.saldo = 0.0;
    }
    boolean egreso (double cant) {// Sacar dinero de la cuenta
    boolean operacionPosible;
    if (saldo >= cant) {
        operacionPosible = true;
    } else { //No hay saldo disponible
        System.out.println("No hay dinero suficiente");
        operacionPosible = false;
    }
    return (operacionPosible); //Indica si ha sido posible realizar la operacion
    }
    void ingreso (double cant) {
        saldo += cant;
    }
    // Metodo para mostrar la informacion de la cuenta
    void mostrarInformacion() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Saldo: " + saldo);
    }
}
