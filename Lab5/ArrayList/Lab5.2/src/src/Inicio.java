package src;
/*
Manejo de ArrayList
*/
/*importaciones */
import java.util.ArrayList;

public class Inicio {

    public static void main(String[] args) {
        ArrayList<String> cadenas= new ArrayList<>();
        /*Agregando datos en lista*/
        cadenas.add("uno");
        cadenas.add("dos");
        cadenas.add("tres");
        cadenas.add("cuatro");
        cadenas.add("cinco");
        
        /*Recorriendo lista con ForEnhaced*/
        System.out.println("-.-.-.-.Recorrido de lista-.-.-.-.-");
        for (String cadena : cadenas) {
            System.out.println(cadena);
        }
        System.out.println("-.-.-.-.-.-.Fin de recorrido-.-.-.-.");
        System.out.println("");
        
        System.out.println("-.-.-.-.Manipulando lista-.-.-.-.-.-.");
        /*Agregando en posición 0 'cero'*/
        cadenas.add(0, "cero");
        /*Eliminando 'dos' y 'cuatro'*/
        cadenas.remove("dos");
        cadenas.remove("cuatro");
        System.out.println(".-.-.-.Recorrido después de manipular-.-.-.-.");
        for (String cadena : cadenas) {
            System.out.println(cadena);
        }
        System.out.println("-.-.-.-.Fin de recorrido-.-.-.-.");
        System.out.println("Tamaño de lista: "+cadenas.size());
        
        

    }
    
}
