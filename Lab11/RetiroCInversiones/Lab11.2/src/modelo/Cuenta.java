package modelo;

import java.time.LocalDate;
import java.time.Period;

public abstract class Cuenta {
    protected int numeroCuenta;
    protected char tipoCuenta;
    protected double saldo;
    protected LocalDate fechaAlta;

    public Cuenta(int numeroCuenta, char tipoCuenta, double saldo,LocalDate fechaAlta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
        this.fechaAlta=fechaAlta;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
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
    public Period calculaVigencia(){
        Period periodo=Period.between(fechaAlta, LocalDate.now());
        System.out.println("La vigencia es: "+periodo.getYears()+" años, "+periodo.getMonths()+" meses, "+periodo.getDays()+" días");
        return periodo;
    }
    
    public abstract void descripcionDeLaCuenta();
    
}
