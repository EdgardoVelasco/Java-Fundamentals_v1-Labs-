
package src;
/*
1.	Un municipio desea cobrar el paso de los automotores por su nueva autopista. Para ello ha creado la siguiente 
tabla de peajes según el tipo de automotor.
*/



public class Inicio {

    public static void main(String[] args) {
        /*Declaración de variable*/
        
        String vehiculo="MB";
        
        /*Switch*/
        
        switch(vehiculo){
            case "VP": 
                System.out.println("Vehiculo particular: $"+1.25); 
                break;
            case "AU": 
                System.out.println("Autobús: $"+1.50); 
            break;
            case "MB": 
                System.out.println("Microbús: $"+2); 
            break;
            case "MT": 
                System.out.println("Motocicleta: $"+0.50); 
                break;
            default: 
                System.out.println("Otros: $"+1.15); 
                break;
        }
        

    }
    
}
