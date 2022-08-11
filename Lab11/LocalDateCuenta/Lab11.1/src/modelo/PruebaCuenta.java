package modelo;

import java.time.LocalDate;
import java.time.Month;

public class PruebaCuenta {

    public static void main(String[] args) {
        /*Creando cuenta*/
        CuentaCheques cnt1= new CuentaCheques(1234, 'a', 9800, 200, LocalDate.of(2019, Month.MARCH, 23));
        
        /*Cuenta inversión */
        CuentaInversion cntI= new CuentaInversion(12345, 'a', 9800, 3.2, LocalDate.of(2020, Month.MARCH, 2));
        
        cnt1.imprimirCuenta();
        cntI.imprimirCuenta();
        System.out.println("Vigencia de cuenta cheques");
        cnt1.calculaVigencia();
        System.out.println("Vigencia de cuenta de inversión");
        cntI.calculaVigencia();
        
    }
    
}
