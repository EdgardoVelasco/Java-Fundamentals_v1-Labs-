package modelo;

public class PruebaCuenta {

    public static void main(String[] args) {
        /*Creando cuenta */
        CuentaCheques cnt1= new CuentaCheques(1234, 'a', 9800, 200);
        
        /*Cuenta inversión */
        CuentaInversion cntI= new CuentaInversion(12345, 'a', 9800, 3.2);
        
        
        /*Cuenta habientes*/
        CuentaHabiente ctA= new CuentaHabiente("Den", "jeferson24", "1234354");
        ctA.agregarCuenta(cnt1);
        CuentaHabiente ctA2= new CuentaHabiente("Jhon", "2de mayo", "54778");
        ctA.agregarCuenta(cntI);
        
        /*Creando banco*/
        Banco banco= new Banco("BBVA", "Santafe", "32411234");
        banco.altaCliente(ctA);
        banco.altaCliente(ctA2);
        /*imprimir */
        System.out.println("-.-.-.Clientes de banco-.-.-.");
        banco.imprimirClientes();
    }
    
}
