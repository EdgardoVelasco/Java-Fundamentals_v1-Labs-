
package src;
/*
En este Laboratorio se solicita crear un proyecto que convierta de
Farenheit a Centigrados

Formula: C=(F-32)/(9.0/5.0) o  C=(F-32)*(5.0/9.0)

*/
public class Inicio {


    public static void main(String[] args) {
        /*Declaración de variables*/
        /*Grados Farenheit*/
        double farenheit=68;
        
        /*Conversión grados a centigrados*/
        double centigrados= (farenheit-32)/(9.0/5.0);
        System.out.println(farenheit+" grados farenheit son "+centigrados+ " grados centigrados: ");
    }
    
}
