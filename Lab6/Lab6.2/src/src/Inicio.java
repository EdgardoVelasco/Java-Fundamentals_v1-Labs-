
package src;
/*
Secuencia de  Fibonacci;
*/

public class Inicio {

    public static void main(String[] args) {
        int n1=0, n2=1;
        System.out.print(n1+", "+n2+", ");
        int suma=0;
        while(suma<100){
           suma=n1+n2;
           n1=n2;
           n2=suma;
           if(suma<100)
           System.out.print(suma+", ");
        }

    }
    
}
