package modelo;

public interface ManejarClientes {
    void altaCliente(CuentaHabiente cliente);
    void bajaCliente(String  nombre);
    CuentaHabiente consultaCliente(String  nombre);
    void actualizaCliente(CuentaHabiente cliente);
    
    
}
