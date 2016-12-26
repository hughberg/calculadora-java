
package principal;

import java.util.Scanner;
import modelo.Calculadora;


public class Presentacion {

    
    public static void main(String[] args) {
        int a, b;
        Scanner sc=new Scanner(System.in);
        
        
        
        //lectura de números
        System.out.println("Introduce número 1:");
        a=sc.nextInt();
        System.out.println("Introduce número 2:");
        b=sc.nextInt();
        //creamos un objeto de la clase de lógica de aplicación
        //para poder hacer los cálculos, le pasamos al constructor
        //los números leídos
        Calculadora cal=new Calculadora(a,b);
        
   
        //hacemos cálculos y tratamos los resultados
        System.out.println("Suma: "+cal.sumar());
        System.out.println("Resta: "+cal.restar());
        System.out.println("Multiplicación: "+cal.multiplicar());
        System.out.println("División: "+cal.dividir());
    }
    
}
