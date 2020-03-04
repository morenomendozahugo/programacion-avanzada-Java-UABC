/*
 * Practica #1
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Moreno Hugo
 */
package operadores;
/**
 * Esta clase muestra el uso de los operadores en la clase java
 * @author 356434
 */
public class Operadores{
     /**
     * El siguiente es un metodo que suma valores
     * utilizando argumentos variables
     * @param argumentos, arreglos de datos de suma
     * @return double indicando el resultado
     */
     public double sumar(double... argumentos){
       double resultado = 0.0D;
       for (int i = 0; i<argumentos.length; i++){
           resultado = resultado +argumentos[i];
}
            return resultado;
}
    public static void main(String[] args) {
        //System.out.println(new Operadores().sumar(2, 3, 5));
         Operadores p1 = new Operadores();
         Operadores p2 = new Operadores();
         Operadores p3 = new Operadores();
         System.out.println(p1.sumar(2,5,6));
         System.out.println(p2.sumar(2,6,6));
         System.out.println(p3.sumar(2,5,89));
    }
    
}
