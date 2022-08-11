
package src;
/*
Programa que calcula el IMC de una persona. 
Formula: IMC= peso(kg)/ (estat ura(m))^2
*/

public class Inicio {

    public static void main(String[] args) {
        /*Declaración de variables*/
       double peso=68;
       double estatura=1.65;
       
       /*Calculo de IMC*/
       double imc=peso/(estatura*estatura);
        System.out.println(imc);
        
       /*Comparación*/
       if(imc<18.5){
            System.out.println("Bajo peso");
       }else if(imc>=18.5 && imc<25){
           System.out.println("Peso Normal");
       }else if(imc>=25 && imc <30){
           System.out.println("Sobrepeso");
       }else if(imc>30){
            System.out.println("Obeso");
       }
       

    }
    
}
