package busqueda;

import java.util.Scanner;

public class Busqueda {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int varArray;
        System.out.println("Introduce el valor del array:");
        varArray= consola.nextInt();
        int varValor;
        System.out.println("Introduce el numero a adivinar:");
        varValor= consola.nextInt();
        int[] numeros = new int[varArray];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i * 5;
        }
        Busqueda ejemplo = new Busqueda();
        int indice = ejemplo.busquedaBinaria(numeros, varValor, 0, numeros.length - 1);
        System.out.println("El indice del valor "+ varValor +" es: " + indice);
    }

    public int busquedaBinaria(int[] listado, int clave, int posInicial, int posFinal) {
        int posMitad = (posFinal + posInicial) / 2;
        if (clave == listado[posMitad]) {
            return posMitad;
        } else if (clave < listado[posMitad]) {
            if (posMitad - 1 <= posInicial) {
                return -1;
            } else {
                return busquedaBinaria(listado, clave, posInicial, posMitad - 1);
            }
        } else {
            if (posMitad + 1 >= posFinal) {
                return -1;
            } else {
                return busquedaBinaria(listado, clave, posMitad + 1, posFinal);
            }
        }
    }
}
