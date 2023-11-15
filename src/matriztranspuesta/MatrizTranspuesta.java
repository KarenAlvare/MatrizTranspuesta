package matriztranspuesta;

import java.util.Scanner;

public class MatrizTranspuesta {

    public static void main(String[] args) {
        // Solicitar al usuario el número de filas y columnas
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();

        // Crear matriz original con las dimensiones proporcionadas por el usuario
        int[][] M = new int[filas][columnas];

        // Lectura de datos por teclado
        leerDatos(M);

        // Mostrar matriz original
        System.out.println("Matriz original");
        mostrarMatriz(M);

        // Calcular la matriz transpuesta
        int[][] T = matrizTranspuesta(M);

        // Mostrar matriz transpuesta
        System.out.println("Matriz transpuesta");
        mostrarMatriz(T);
    }

    // Método para introducir datos a la matriz desde teclado
    public static void leerDatos(int[][] M) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lectura de datos de la matriz:");
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print("Elemento[" + i + "][" + j + "] = ");
                M[i][j] = sc.nextInt();
            }
        }
    }

    // Método para obtener la transpuesta de una matriz
    public static int[][] matrizTranspuesta(int[][] a) {
        // Creamos la matriz transpuesta
        // El número de filas será igual al número de columnas de la matriz original
        // El número de columnas será igual al número de filas de la matriz original
        int[][] t = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                t[j][i] = a[i][j];
            }
        }
        return t;
    }

    // Método para mostrar una matriz por pantalla
    public static void mostrarMatriz(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%5d", A[i][j]);
            }
            System.out.println();
        }
    }
}