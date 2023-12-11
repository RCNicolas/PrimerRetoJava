/*
4. A partir del siguiente código en Python, realiza una explicación del funcionamiento y una
traducción al lenguaje Java.
 */
package com.mycompany.retojava;

/**
 *
 * @author nicos
 */
public class Punto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
      
       System.out.print(a +"  "+ b +"  " +b);
       
      for (int i = 0; i < 10; i++) {
        int c = a;
        a = b;
        b = c +a;
        int suma = a +b;
        System.out.print("  " + suma);

      }
    }
    
}

/*Explicacion
 * 
 * En la imagen se esta representado la secuencia de fibonacci 
 * donde se van sumando las variables con su valor anterior y tomando 
 * ahora el valor nuevo de la suma de las dos
 * 
 * en python esto se logra aignando el valor de la suma a la varibale b y el valor de 
 * 'b' a la variabla 'a' en una sola linea sin hacer otro uso de una variable temporal
 * como no en java esto no se puede (o desconozco como se hace) hacemos uso de una 
 * variable temporal para asignar los valores correspondientes 
 */