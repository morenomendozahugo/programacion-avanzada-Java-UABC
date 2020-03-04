/*
 * Practica #2
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Moreno Hugo
 */
package Operadores;

import java.util.Scanner;

/**
 *
 * @author clases
 */
public class Operador1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejemplo: residuo de 55 entre 10
        Operador1 Operador01 = new Operador1();
        System.out.println(Operador01.residuoEnDivision(55, 10));
        
        //Las cadenas (String) pueden producir sorpresas
        int a = 5;
        int b = 4;
        System.out.println(a+b);
        
        int valor1 = 5;
        String valor2 = "4";
        System.out.println(valor1+valor2);
        
        // Podemos ver operadores unarios
        System.out.println(a++);// imprime 5?
        System.out.println(a);// imprime 6?
        System.out.println(++a);// imprime 
        
        parOImpar(55);
        
        System.out.println("----------------------------");
        System.out.println(13-4 * (5-2) + 3 * (2+8));
        System.out.println(16 + 3 * (6-4) - 3 * 5);
        System.out.println(23 - 8 + 6 * 2 - 3 * 4);
        
        if(!true) { // Se evalua que es verdadero
            System.out.println("Que show");
        }
        Integer x = 10;
        int y = 10;
        int z = 10;
        if( x > y && z > y){ // false && true
            System.out.println("Resultado" + (x+y+z));
        }
    
        // Variantes de yeicob, el siguiente 
        if( x > y && z > y){ // false  true 
            System.out.println("Resultado" + x+y+z);
            System.out.println("Resultado " + (x+y+z) );
            System.out.println("Resultado " + (x.toString() +y+z) );
            
            //Ejemplo de conversion de tipos validos e invalidos
            System.out.println((int) Math.random() * 100);
            // Error en la siguiente linea, conversion de tipo incorrecta
            //System.out.println((boolean) Math.random() * 100);
        }
            Scanner sc = new Scanner (System.in);
            if (sc != null){
                    System.out.println("Escribe tu edad");
            }
            Integer edad = sc.nextInt();
            esMayorDeEdad(edad);
        }
    
/**
 * Este metodo nos ayuda a conocer el valor sobrante de una division
 * @param dividendo valor que se divide
 * @param divisor valor que se separa del dividendo
 * @return int con la cantidad de unidades sobrantes
 */
public int residuoEnDivision(int dividendo, int divisor){
   return dividendo % divisor;
   }
   /**
    * Este metodo determina si un numero es par o impar
    * @param numeroAEvaluar 
    * @author 
    */
   public static void parOImpar(int numeroAEvaluar){
       if (numeroAEvaluar % 2 == 0){
           System.out.println("Numero Es par" + numeroAEvaluar + "Es par");
       }else{
           System.out.println("Numero Es impar " + numeroAEvaluar + " Es impar");
       }
       
   } //Ejemplo de uso parOImpar(55);
   
   /**
    * Metodo que indica si una persona es mayor de edad
    * @param edad int que representa un numero de anios cumplidos
    */
   public static void esMayorDeEdadConSwitch(int edad){
       switch (edad){
           case 18:
                System.out.println("Apenas Eres menor de edad");
                break;
           case 20:
               System.out.println("Apenas tienes 20");
               break;
           case 80:
               System.out.println("Ya esta viejo señor");
               break;
           default: 
               System.out.println("No es estoy seguro si eres o un morrol o un viejillo");
       }
   }
       public static void esMayorDeEdad(int edad){
           if(edad > 18){
           System.out.println("Eres mayor de edad");    
       }else if(edad == 18){
            System.out.println("Apenas Eres menor de edad");
       }else{
           System.out.println("Eres menor de edad");
       }
       
       }
   }

