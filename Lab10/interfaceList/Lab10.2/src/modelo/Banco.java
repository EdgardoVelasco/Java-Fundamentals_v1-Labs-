package modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco implements ManejarClientes {
    private String nombre;
    private String domicilio;
    private String telefono;
    private List<CuentaHabiente> clientes;

    public Banco(String nombre, String domicilio, String telefono) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.clientes= new ArrayList<>();
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

    public List<CuentaHabiente> getClientes() {
        return clientes;
    }

    public void setClientes(List<CuentaHabiente> clientes) {
        this.clientes = clientes;
    }
    
    public void  imprimirClientes(){
        for (CuentaHabiente cliente : clientes) {
             System.out.println(cliente);
        }
    }
    

    @Override
    public void altaCliente(CuentaHabiente cliente) {
       this.clientes.add(cliente);
    }

    @Override
    public void bajaCliente(String nombre) {
        CuentaHabiente buscado=this.consultaCliente(nombre);
        if(buscado!=null){
            this.clientes.remove(buscado);
            System.out.println("se ha eliminado con éxito");
        }else{
            System.out.println("no existe");
        }
    }

    @Override
    public CuentaHabiente consultaCliente(String nombre) {
       CuentaHabiente ct=null;
        for (CuentaHabiente cliente : clientes) {
            if(cliente.getNombre().equals(nombre)){
              ct=cliente;
            }
        }
        return ct;
    }

    @Override
    public void actualizaCliente(CuentaHabiente ctN) {
        CuentaHabiente ct= this.consultaCliente(ctN.getNombre());
        if(ct!=null){
           ct.setDomicilio(ctN.getDomicilio());
           ct.setTelefono(ctN.getTelefono());
        }
    }
    
    
}
