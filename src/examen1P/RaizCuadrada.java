/**
 * Programa para calcular raiz cuadradade número introducido por teclado
 * @author EmilioZV
 * @version 1.0
 * 
 */

package examen1P; //indico el nombre del paquete

import javax.swing.JOptionPane; // importo claseJOptionPane

/**
 * Clase main, por donde arranca el programa
 */

public class RaizCuadrada {
    // creo el método main
    public static void main(String[] args) {

        //declaro e inicializo variables tipo String y double:
        String teclado; 
        double num = 0.0;
        double operacion = 0.0;
        double raizCuadrada = 0.0;
        double total = 0;

        do {
            //creo un dialogbox donde poder introducir por teclado:
            teclado = JOptionPane.showInputDialog("Introduce un número (0 para terminar)");
            num = Double.parseDouble(teclado); //declaro e inicializo variable
            //
            if (num != 0) {
                raizCuadrada = Math.sqrt(num);
                total += raizCuadrada;
                operacion = Math.pow(raizCuadrada, 3);
            }
            // en caso de teclear por teclado cero, no realiza la operación
        } while (num != 0);
    }
}
