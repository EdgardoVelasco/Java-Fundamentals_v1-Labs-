package modelo;

public abstract class Cuenta {
    protected int numeroCuenta;
    protected char tipoCuenta;
    protected double saldo;

    public Cuenta(int numeroCuenta, char tipoCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public char getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(char tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void deposito(double deposito){
        if(deposito>0){
            this.saldo+=deposito;
            System.out.println("Cuenta: "+this.numeroCuenta+", Operación: abono "+deposito+", saldo: "+this.saldo);
        }
    }
    public void retiro(double retiro){
      if(retiro>this.saldo){
          System.out.println("saldo insuficiente");
      }else{
          this.saldo-=retiro;
          System.out.println("Cuenta: "+numeroCuenta+", Operación: retiro "+retiro+", saldo: "+this.saldo);
      }
    }
    
    public void imprimirCuenta(){
      String info="Cuenta[ numero de Cuenta:"+numeroCuenta+", tipoCuenta: "+tipoCuenta+", saldo:"+saldo+"]";
      System.out.println(info);
    }
    
    public abstract void descripcionDeLaCuenta();
    
}
