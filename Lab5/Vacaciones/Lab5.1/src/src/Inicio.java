
package src;
/*Calcular los días de vacaciones*/

public class Inicio {

    public static void main(String[] args) {
        /*Declaración de variables*/
        int aniosServicio=3 ;
        int[]diasVacaciones= {0, 6, 8, 10, 12};
        
        if(aniosServicio>=0 && aniosServicio<=4){
             System.out.println("La persona tiene "+diasVacaciones[aniosServicio]+" dias de vacaciones");
        }else if(aniosServicio>4){
             System.out.println("La persona tiene "+diasVacaciones[diasVacaciones.length-1]+" días de  vacaciones");
        }
    }
    
}
