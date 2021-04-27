package modelo;

public class CuentaInversion extends Cuenta{
    private final double tasaInteresSemestral;
    public CuentaInversion(int numeroCuenta, char tipoCuenta, double saldo, double tasaInteres) {
        super(numeroCuenta, tipoCuenta, saldo);
        this.tasaInteresSemestral=tasaInteres;
    }

    @Override
    public void imprimirCuenta() {
       String info="Cuenta Inversion: [ numero de cuenta: "+numeroCuenta+", tipo de cuenta: "+tipoCuenta+", saldo inicial: "+saldo+" tasa interés"+tasaInteresSemestral+"]";
       System.out.println(info);
    }

    @Override
    public void deposito(double deposito) {
        System.out.println("aún no implementado");
    }

    @Override
    public void retiro(double retiro) {
        System.out.println("aún no implementado");    
    }

    @Override
    public void descripcionDeLaCuenta() {
       System.out.println("-.-.-.-         Cuenta de Inversión     -.-.-.-.");    
        System.out.println("-.-.Numero Cuenta: "+numeroCuenta+"    -.-.-.-.");
        System.out.println("-.-.Saldo: "+saldo+"                   -.-.-.-.");
        System.out.println("-.-.Tipo: "+tipoCuenta+"               -.-.-.-.");
        System.out.println("-.-.Tasa: "+tasaInteresSemestral+"     -.-.-.-.");    
    }
    
    
    
}
