/*
 * Practica #3
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
     public double restar (int inicio, double... argumentos){
         double resultado = argumentos [inicio];
         for (double arg : argumentos){
         if(inicio != 0){
             if(arg > 0){
                 resultado = resultado -(arg);
             }else{
                 resultado = resultado + (arg);
             }
         }else{
            inicio = 1;
         }
     }
         return resultado;
     }
     /**
      * El siguiente es un metodo que multiplica valores
      * utilizando valores variables
      * @param args valores con tipo de dato double
      * @return 
      */
     public double multiplicar(int inicio, double... args){
         double resultado = args[0];
         for(int i = 0; i < args.length; i++){
         resultado = resultado *Math.abs(args[i]);
         }
         return resultado;
     }
      /**
      * El siguiente es un metodo que multiplica valores
      * utilizando valores variables
      * @param args valores con tipo de dato double
      * @return Double con la division o nulo si hay error
      */
     public double dividir(double... args){
         double resultado = args[0];
         for(int i = 0; i < args.length; i++){
             if(args[i] == 0){
                // return null;
             }
         resultado = resultado *Math.abs(args[i]);
         }
         return resultado;
     }
     
     /**
      * Metodo main de ejecuacion
      * @param args the command line
      */
    public static void main(String[] args) {
      //probando el metodo sumar
        System.out.println(new Operadores().sumar(-2, -3, 5));
      //Probando el metodo restar
        System.out.println(new Operadores().restar(0,-100));
        System.out.println(new Operadores().restar(0,100,100,-100,-200));
      //Probando el metodo multiplicar
        System.out.println(new Operadores().multiplicar(0,-2,-1,-3));
      //probando el metodo dividir
        System.out.println(new Operadores().dividir(100,100));
    }
    
}
