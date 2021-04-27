
package src;
/*
Escriba un programa que dado el número del mes
imprima la leyenda correspondiente a ese mes. 
*/



public class Inicio {

    public static void main(String[] args) {
        /*Declaración de variable*/
        
        int mesNumero=2;
        
        /*Switch*/
        
        switch(mesNumero){
            case 1: System.out.println("Enero"); break;
            case 2: System.out.println("Febrero"); break;
            case 3: System.out.println("Marzo"); break;
            case 4: System.out.println("Abril"); break;
            case 5: System.out.println("Mayo"); break;
            case 6: System.out.println("Junio"); break;
            case 7: System.out.println("Julio"); break;
            case 8: System.out.println("Agosto"); break;
            case 9: System.out.println("Septiembre"); break;
            case 10: System.out.println("Octubre"); break;
            case 11: System.out.println("Noviembre"); break;
            case 12: System.out.println("Diciembre"); break;
            default: System.out.println("mes inválido"); break;
        }
        

    }
    
}
