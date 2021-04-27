package modelo;

import java.time.LocalDate;
import java.time.Month;


public class PruebaCuenta {

    public static void main(String[] args) {
        
       /*Cuenta inversión*/
        CuentaInversion cntI= new CuentaInversion(12345, 'a', 9800, 3.2, LocalDate.of(2021, Month.MARCH, 2));
        try {
            cntI.retiro(2341);
        } catch (SaldoInsuficienteException | OperacionInvalidaException ex) {
            System.out.println(ex);
        }
        
        
    }
    
}
