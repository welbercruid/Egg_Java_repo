//Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
//es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
//diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
//la función Substring y equals() de Java.
package g6_introjava;

import java.util.Scanner;

public class G6E09 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Comienza con A? Ingrese texto");
        String texto = read.nextLine();

        System.out.println("A".equals(texto.substring(0,1)) ? "CORRECTO" : "INCORRECTO");
    }
}