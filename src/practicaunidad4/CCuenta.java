package practicaunidad4;

public class CCuenta {

    // Propiedades de la Clase Cuenta
    String denominacion;
    String varableNueva1;
    String cuenta;
    double saldo;
    double tipoInterés;
    int i;

    public CCuenta() {
    }

    public CCuenta(String nom, String cue, double sal, double tipo) {
        denominacion = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (saldo < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }

}
