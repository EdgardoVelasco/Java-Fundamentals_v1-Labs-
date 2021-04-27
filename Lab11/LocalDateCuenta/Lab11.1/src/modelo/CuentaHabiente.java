package modelo;

import java.util.ArrayList;

public class CuentaHabiente {
    private String nombre;
    private String domicilio;
    private String telefono;
    private ArrayList<Cuenta> cuentas;

    public CuentaHabiente(String nombre, String domicilio, String telefono) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.cuentas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
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

    @Override
    public String toString() {
        return "CuentaHabiente{" + "nombre=" + nombre + ", domicilio=" + domicilio + ", telefono=" + telefono + ", cuentas=" + cuentas + '}';
    }
    
}
