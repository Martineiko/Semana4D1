/**
 * ArrayDemo.java
 * 
 * Ejemplo que muestra como ordenar un arreglo de n�meros enteros en forma
 * ascendente y descendente usando el algoritmo de Selecci�n.
 */
 
/**
 *
 * @author MMD
 */
public class Ordenamiento {
 
    //un arreglo de 10 n�meros enteros desordenados
    private static int numeros[] = { 7, 0, 9, 8, 1, 4, 6, 2, 3, 5 };
 
    /**
     * Punto de entrada del programa.
     * 
     * @param args argumentos de la l�nea de comandos.
     */
    public static void main(String[] args) {
        //imprimimos por pantalla el arreglo de n�meros enteros
        System.out.println("Arreglo sin orden:");
        for (int num : numeros) {
            System.out.println(num);
        }
 
        System.out.println();
 
        //ordenamos en forma ascendente el arreglo de n�meros enteros y lo imprimimos por pantalla
        System.out.println("Orden ascendente:");
        ordSelAsc(numeros);
        for (int num : numeros) {
            System.out.println(num);
        }
 
        System.out.println();
 
        //ordenamos en forma descendente el arreglo de n�meros enteros y lo imprimimos por pantalla
        System.out.println("Orden descendente:");
        ordSelDesc(numeros);
        for (int num : numeros) {
            System.out.println(num);
        }
    }
 
    /**
     * Este m�todo ordena en forma ascendente el arreglo pasado como argumento usando el
     * algoritmo de selecci�n.
     * 
     * @param arreglo el arreglo que sera ordenado.
     */
    static void ordSelAsc(int[] arreglo) {
        //iteramos sobre los elementos del arreglo
        for (int i = 0 ; i < arreglo.length - 1 ; i++) {
            int min = i;
 
            //buscamos el menor n�mero
            for (int j = i + 1 ; j < arreglo.length ; j++) {
                if (arreglo[j] < arreglo[min]) {
                    min = j;    //encontramos el menor n�mero
                }
            }
 
            if (i != min) {
                //permutamos los valores
                int aux = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = aux;
            }
        }
    }
 
    /**
     * Este m�todo ordena en forma descendente el arreglo pasado como argumento usando el
     * algoritmo de selecci�n.
     * 
     * @param arreglo el arreglo que sera ordenado.
     */
    static void ordSelDesc(int[] arreglo) {
        //iteramos sobre los elementos del arreglo
        for (int i = 0 ; i < arreglo.length - 1 ; i++) {
            int max = i;
 
            //buscamos el mayor n�mero
            for (int j = i + 1 ; j < arreglo.length ; j++) {
                if (arreglo[j] > arreglo[max]) {
                    max = j;    //encontramos el mayor n�mero
                }
            }
 
            if (i != max) {
                //permutamos los valores
                int aux = arreglo[i];
                arreglo[i] = arreglo[max];
                arreglo[max] = aux;
            }
        }
    }
}