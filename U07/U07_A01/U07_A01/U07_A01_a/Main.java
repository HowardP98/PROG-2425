package unidad07.U07_A01;

import unidad07.U07_A01.CuentaCorriente;

public class Main {
    public static void main(String[]args){
        CuentaCorriente c;
        c = new CuentaCorriente ("12345678A", "Pepe"); //Cuenta de Pepe con DNI 12.345.678-A
        c.ingreso (1000); //Ingresamos 1000 euros
        c.egreso(300); //Sacamos 300 euros. Quedaran 700 euros
        c.mostrarInformacion(); //Mostramos
        System.out.println("Puedo sacar 700 euros: " + c.egreso(700)); //Quedan 0 euros
        System.out.println("Puedo sacar 700 euros: " + c.egreso(500));   
    }
}
