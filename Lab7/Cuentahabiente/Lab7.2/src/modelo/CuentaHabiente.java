package modelo;

import java.util.ArrayList;

public class CuentaHabiente {
    String nombre;
    String domicilio;
    String telefono;
    ArrayList<Cuenta> cuentas;

    public CuentaHabiente(String nombre, String domicilio, String telefono) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.cuentas = new ArrayList<>();
    }
    
    public Cuenta consultarCuenta(int numero){
        Cuenta cu=null;
        for (Cuenta cuenta : cuentas) {
            if(cuenta.numeroCuenta==numero){
              cu=cuenta;
              break;
            }
        }
        return cu;
    }
    
    public boolean agregarCuenta(Cuenta ct){
       boolean resp=false;
       Cuenta buscar=this.consultarCuenta(ct.numeroCuenta);
       if(buscar==null){
           resp=this.cuentas.add(ct);
       }
       return resp;
    }
    
    public boolean eliminarCuenta(int numero){
        return this.cuentas.remove(this.consultarCuenta(numero));
    }
    
    public void listarCuentas(){
        for (Cuenta cuenta : cuentas) {
            cuenta.imprimirCuenta();
        }
    }
    
}
