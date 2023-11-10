
package practica2u4u5;


public class Practica2U4U5 {

    public static int suma(int a, int b) {
        return a+b;
    }
    public static int resta(int c, int d){
        return c-d;
    }
    public static int multi(int e, int f){
        return e*f;
    }
    public static int division(int g, int h){
        return g/h;
    }
   
    public static void main(String[] args) {
        int resultadosuma= Practica2U4U5.suma(5, 4);
        System.out.println("La suma de los dos numeros es de " + resultadosuma);
        int resultadoresta= Practica2U4U5.resta(7, 4);
        System.out.println("La resta de los dos numeros es de " + resultadoresta);
        int resultadomulti= Practica2U4U5.multi(58, 57);
        System.out.println("La multiplicacion de los dos numeros es de " + resultadomulti);
        int resultadodivision= Practica2U4U5.division(50, 10);
        System.out.println("La division de los dos numeros es de " + resultadodivision);
              
    }
    
}
