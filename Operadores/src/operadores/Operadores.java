
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
        System.out.println(new Operadores().sumar(2, 3, 5));
        
    }
    
}
