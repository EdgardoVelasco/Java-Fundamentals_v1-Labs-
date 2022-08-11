package modelo;

public class PruebaCliente {

    public static void main(String[] args) {
        /*Creando cuenta*/
        Cuenta cnt1= new Cuenta(1234, 'a', 9800);
        Cuenta cnt2= new Cuenta(1235, 'b', 10800);
        Cuenta cnt3= new  Cuenta(1236, 'a', 1800);
        
        /*Cuenta Habiente*/
        CuentaHabiente ca1=new CuentaHabiente("Den", "jeferson 24", "1234567");
        
        /*método agregar cuenta*/
        System.out.println("-.-.-.-.Agregar Cuenta-.-.-.-.-.");
        System.out.println(ca1.agregarCuenta(cnt1));
        System.out.println(ca1.agregarCuenta(cnt2));
        System.out.println(ca1.agregarCuenta(cnt3));
        System.out.println(ca1.agregarCuenta(cnt1));
        
        /*imprimiendo cuentas*/
        System.out.println("-.-.-.Cuentas-.-.-.-.-.");
        ca1.listarCuentas();
        
        /*Eliminando cuenta*/
        System.out.println("Eliminando cuenta 1234");
        System.out.println(ca1.eliminarCuenta(1234));
        System.out.println(ca1.eliminarCuenta(1234));
       
        /*Despúes de eliminar*/
        System.out.println("-.-.-.Después de eliminar--.-.-.");
        ca1.listarCuentas();
        
        /*Consultando Cuenta*/
        System.out.println("-.-.-.Consulta Cuenta-.-.-.-.");
        Cuenta caE=ca1.consultarCuenta(1235);
        caE.imprimirCuenta();
        
    }
    
}
