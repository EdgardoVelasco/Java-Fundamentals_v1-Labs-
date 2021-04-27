package modelo;

public class PruebaCuenta {

    public static void main(String[] args) {
        /*Creando cuenta*/
        System.out.println("-.-.-.-.-.Cuenta Cheques-.-.-.-.-.");
        CuentaCheques cnt1= new CuentaCheques(1234, 'a', 9800, 200);
        /*Realizando movimientos*/
        cnt1.deposito(200);
        cnt1.retiro(15800);
        
        /*imprimiendo valores objeto*/
        cnt1.imprimirCuenta();
        
        /*Cuenta inversión*/
        System.out.println("-.-.-.-.-.Cuenta Inversión-.-.-.-.-.");
        CuentaInversion cntI= new CuentaInversion(1234, 'a', 9800, 3.2);
        /*Validando métodos*/
        cntI.deposito(123);
        cntI.retiro(123);
        /*imprimir información*/
        cntI.imprimirCuenta();
    }
    
}
