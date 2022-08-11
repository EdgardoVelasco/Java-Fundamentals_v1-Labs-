package modelo;

public class PruebaCuenta {

    public static void main(String[] args) {
        /*Creando cuenta*/
        System.out.println("-.-.-.-.-.Cuenta Cheques-.-.-.-.-.");
        CuentaCheques cnt1= new CuentaCheques(1234, 'a', 9800, 200);
        /*imprimiendo valores  objeto*/
        cnt1.descripcionDeLaCuenta();
        
        /*Cuenta inversión*/
        System.out.println("-.-.-.-.-.Cuenta Inversión-.-.-.-.-.");
        CuentaInversion cntI= new CuentaInversion(12345, 'a', 9800, 3.2);
        
        /*imprimir información*/
        cntI.descripcionDeLaCuenta();
        
        /*Cuenta habiente*/
        CuentaHabiente ctA= new CuentaHabiente("Den", "jeferson24", "1234354");
        ctA.agregarCuenta(cnt1);
        ctA.agregarCuenta(cntI);
        System.out.println("Cuentas de cuenta habiente");
        ctA.listarCuentas();
    }
    
}
