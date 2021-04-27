package src;

/*Imprimir los 20 primeros número primos*/
public class Inicio {

    public static void main(String[] args) {
        for (int i = 2; i <=71; i++) {
            boolean primo=true;
            if(i==2){
                System.out.println("El número: "+ i+" es primo");
            }else if(i%2==0){
                               
            }else {
                int contador=2;
               while(primo && contador!=i ){
                    if(i%contador==0){
                       primo=false;
                       break;
                    }
                    contador++;
               }
                if(primo){
                System.out.println("El número: "+i+" es primo ");
                }
            }
        }
    }  
}
