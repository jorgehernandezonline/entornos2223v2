package practicaunidad4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        CCuenta unaCuenta;
        double saldoActual;
        int opcion = 0;
        unaCuenta = new CCuenta("María Serna", "1234-4321-12-123456789", 1300, 0);
        do {
            try {
                System.out.println("MENÚ DE OPERACIONES");
                System.out.println("-------------------");
                System.out.println("1 - Ingresar");
                System.out.println("2 - Retirar");
                System.out.println("3 - Finalizar");
                opcion = Integer.parseInt(dato.readLine());
                if (opcion == 1) {
                    System.out.println("¿Cuánto desea ingresar?: ");
                    float ingresar = Integer.parseInt(dato.readLine());
                    try {
                        System.out.println("Ingreso en cuenta. ");
                        unaCuenta.ingresar(ingresar);
                    } catch (Exception e) {
                        System.out.print("Fallo al ingresar. ");
                    }
                } else if (opcion == 2) {
                    System.out.println("¿Cuátno desea retirar?: ");
                    float retirar = Integer.parseInt(dato.readLine());
                    try {
                        unaCuenta.retirar(retirar);
                    } catch (Exception e) {
                        System.out.print("Fallo al retirar. ");
                    }
                } else if (opcion == 3) {
                    System.out.println("Finalizamos la ejecución. ");
                } else {
                    System.err.println("Opción errónea");
                }
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (opcion != 3);
        saldoActual = unaCuenta.saldo;
        System.out.println("El saldo actual es: " + saldoActual);
    }

}
