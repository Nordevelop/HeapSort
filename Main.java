package misClases;
import java.util.Arrays;

public class Main {
	// devolver Hijo izquierdo del Arbol Binario
    private static int HijoIzqdo(int i) {
        return (2*i + 1);
    }
 // devolver Hijo derecho del Arbol Binario
    private static int HijoDrcho(int i) {
        return (2*i + 2);
    }
    // Metodo para intercambiar  �ndices del Array arr[]
    private static void intercambio(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static void apilar(int[] arr, int i, int tama�o) {
        // Obtener los hijos izquierdo y derecho del nodo() en el �ndice arr[i]
        int izda = HijoIzqdo(i);
        int drcha = HijoDrcho(i);
 
        int mayor = i;
        if (izda < tama�o && arr[izda] > arr[i]) {
           mayor = izda;
        }
        if (drcha < tama�o && arr[drcha] > arr[mayor]) {
            mayor = drcha;
        }
 
        if (mayor != i){ //mayor != i variable contador
            intercambio(arr, i, mayor);
            apilar(arr, mayor, tama�o);
        }
    }
        // Funci�n para eliminar un elemento con la mayor prioridad (presente en la ra�z)
        public static int sacar(int[] arr, int tama�o){
            // si el monticulo no tiene Elementos
            if (tama�o <= 0) {
                return -1;
            }
     
            int tope = arr[0];
     
            // sustituir la ra�z del mont�n por el �ltimo elemento del Array
            
            arr[0] = arr[tama�o-1];
            apilar(arr, 0, tama�o - 1);
            return tope;
        }
     
        //Metodo Heapsort ordenamiento de Mont�culo N() sobre arr[]
        public static void heapsort(int[] arr){
            // implementar el Array como  cola de prioridad e inicializarla 
            int n = arr.length;
            int i = (n - 2) / 2;
            while (i >= 0) {
                apilar(arr, i--, n);
            }
            while (n > 0){
                arr[n - 1] = sacar(arr, n);
                n--;
            }
        }
     
        //Algoritmo de implementaci�n en Java

	public static void main(String[] args) {
		/*Metodo de ordenamiento Heapsort Monticulo
		 * Implementacion de Arbol Binario
		 * Author Nordevelop
		 */
		int[] arr = { 5,2,3,1,4,8,7,6,9,10 };
		System.out.println("Array desornedado"+Arrays.toString(arr));
		 heapsort(arr);
         // print the sorted array
        System.out.println("Array Ordenado con el metodo Heapsort");
		System.out.println(Arrays.toString(arr));

	}

}
