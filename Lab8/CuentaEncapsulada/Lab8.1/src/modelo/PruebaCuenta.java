package modelo;

public class PruebaCuenta {

    public static void main(String[] args) {
        /*Creando cuenta*/
        Cuenta cnt1= new Cuenta(1234, 'a', 9800);
        /*Realizando movimientos*/
        cnt1.deposito(200);
        cnt1.retiro(123);
        
        /*imprimiendo valores objeto*/
        cnt1.imprimirCuenta();
  
    }
    
}
