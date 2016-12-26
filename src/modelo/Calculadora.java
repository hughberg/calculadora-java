
package modelo;


public class Calculadora {
    //variables que guardan los números
    //sobre los que trabajaremos
    int num1, num2;
    //constructor que sirve para inicializar
    //los atributos num1 y num2
    public Calculadora(int a, int b){
        num1=a;
        num2=b;
    }
    //métodos para establecer valores
    //en los números
    /*public void fijarNum1(int n){
        num1=n;
    }
    public void fijarNum2(int n){
        num2=n;
    }*/
    public int sumar(){
        int sum=num1+num2;
        return sum;
    }
    public int restar(){
        int res=num1+num2;
        return res;
    }
    public int multiplicar(){
        return num1*num2;
    }
    public int dividir(){
        return num1/num2;
    }
}
