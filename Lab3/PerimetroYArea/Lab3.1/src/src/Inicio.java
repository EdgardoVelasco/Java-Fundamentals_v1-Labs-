
package src;
/*
En este Laboratorio se solicita lo siguiente:
1.- Calcula el perímetro de un círculo
    Formula perímetro: PI*Diametro
2.- Calcula el área de un circulo
    Formula area: PI*Radio^2
*/
public class Inicio {

    public static void main(String[] args) {
        /*Declaración de variables*/
        double diametroCirculo=24;
        double radio=diametroCirculo/2;
        final double PI=3.1416;
        
        /*Cálculo de diametro*/
        System.out.println("-.-.-.-.-.Perimetro de Círculo--.-.-.-.-.");
        double perimetro=PI*diametroCirculo;
        System.out.println("Perímetro de circulo: "+perimetro);
        
        /*Cálculo de area*/
        System.out.println("");
        System.out.println("-.-.-.-.-.-.Área de Círculo-.-.-.-.-.-.");
        double area= PI*(radio*radio);
        System.out.println("Área de Círculo: "+area);
    }
    
}
