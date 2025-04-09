package unidad07.U07_A03;

public class Main {
    public static void main(String[] args) {
        // Crear objetos con diferentes constructores
        CuentaCorriente cuenta1 = new CuentaCorriente("12345678A", 1000.0);
        CuentaCorriente cuenta2 = new CuentaCorriente("87654321B", "Carlos Alberto", 1800.0);
        
        // Mostrar información de las cuentas
        System.out.println("Cuenta 1:");
        cuenta1.mostrarInformacion();
        
        System.out.println("\nCuenta 2:");
        cuenta2.mostrarInformacion();
        
        System.out.println(cuenta1.dni);
        System.out.println(cuenta1.nombre);
        System.out.println(cuenta1.saldo);
    }
}
