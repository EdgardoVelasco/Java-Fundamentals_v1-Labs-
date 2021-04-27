package modelo;

import java.time.LocalDate;

public class CuentaCheques extends Cuenta{
    private double proteccion;
      
    public CuentaCheques(int numeroCuenta, char tipoCuenta, double saldo, double proteccion, LocalDate fechaAlta) {
        super(numeroCuenta, tipoCuenta, saldo, fechaAlta);
        this.proteccion=proteccion;
    }

    @Override
    public void retiro(double retiro)throws SaldoInsuficienteException, OperacionInvalidaException{
        if(retiro<=saldo){
          super.retiro(retiro);
        }else if((saldo+proteccion)> retiro){
            System.out.println("Se ha retirado con sobregiro");
            retiro-=this.saldo;
            this.saldo=0;
            this.proteccion-=retiro;
            imprimirCuenta();
        }else{
            System.out.println("Penalización 10%");
            double penalizacion=retiro*.1;
            this.saldo-=penalizacion;
            imprimirCuenta();
        }
        
    }

    @Override
    public void imprimirCuenta() {
       String info="CuentaCheques[ numero de cuenta: "+this.numeroCuenta+", tipo de cuenta "+tipoCuenta+", protección: "+proteccion +", saldo:"+saldo+", fecha alta:"+fechaAlta+"]";   
        System.out.println(info);
    }

    @Override
    public void descripcionDeLaCuenta() {
        System.out.println("-.-.-.-         Cuenta de Cheques      -.-.-.-.");    
        System.out.println("-.-.Numero Cuenta: "+numeroCuenta+"    -.-.-.-.");
        System.out.println("-.-.Saldo: "+saldo+"                   -.-.-.-.");
        System.out.println("-.-.Tipo: "+tipoCuenta+"               -.-.-.-.");
        System.out.println("-.-.Protección: "+proteccion+"         -.-.-.-.");
    }
    
    
    
   
      
    
}
