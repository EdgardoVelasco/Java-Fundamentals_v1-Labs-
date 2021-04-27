package modelo;

public class CuentaCheques extends Cuenta{
    private double proteccion;
      
    public CuentaCheques(int numeroCuenta, char tipoCuenta, double saldo, double proteccion) {
        super(numeroCuenta, tipoCuenta, saldo);
        this.proteccion=proteccion;
    }

    @Override
    public void retiro(double retiro) {
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
       String info="CuentaCheques[ numero de cuenta: "+this.numeroCuenta+", tipo de cuenta "+tipoCuenta+", protección: "+proteccion +", saldo:"+saldo;   
        System.out.println(info);
    }
    
    
    
   
      
    
}
