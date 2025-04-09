package unidad07.U07_A03;

class CuentaCorriente {
    String dni;
    public String nombre;
    private double saldo;

    // Constructor con DNI y saldo inicial
    public CuentaCorriente(String dni, double saldo) {
        this.dni = dni;
        this.saldo = saldo;
        this.nombre = "Desconocido"; // Valor por defecto si no se proporciona el nombre
    }

    // Constructor con DNI, nombre y saldo inicial
    public CuentaCorriente(String dni, String nombre, double saldo) {
        this(dni, saldo); // Llama al otro constructor
        this.nombre = nombre; // Sobrescribe el nombre predeterminado
    }

    // Método para mostrar la información de la cuenta
    public void mostrarInformacion() {
        System.out.println("Titular: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo);
    }
}

