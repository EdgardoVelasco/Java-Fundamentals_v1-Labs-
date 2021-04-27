package modelo;

public class Cuenta {
    int numeroCuenta;
    char tipoCuenta;
    double saldo;

    public Cuenta(int numeroCuenta, char tipoCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }
    
    public void deposito(double deposito){
        if(deposito>0){
            this.saldo+=deposito;
        }
    }
    public void retiro(double retiro){
      if(retiro>this.saldo){
          System.out.println("saldo insuficiente");
      }else{
          this.saldo-=retiro;
      }
    }
    
    public void imprimirCuenta(){
      String info="Cuenta[ numero de Cuenta:"+numeroCuenta+", tipoCuenta: "+tipoCuenta+", saldo:"+saldo+"]";
      System.out.println(info);
    }
    
    
}
