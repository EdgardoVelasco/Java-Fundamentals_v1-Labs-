
package srrc;
/*
Factorial de los  números del 1 al 10
*/

public class Inicio {

    public static void main(String[] args) {
       int cont=1;
       do{
           int factorial=1;
           for(int i=1; i<=cont;i++){
              factorial*=i;
           }
           System.out.println("el factorial de "+cont+" es igual a : "+factorial);
       
       }while(++cont<=10);
       
    }
    
}
