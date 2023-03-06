public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[7][7]; // Se crea matriz de 7x7
        int sumaDiagonal = 0;

        // Inicializar la matriz con números aleatorios entre 1 y 10
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                matriz[i][j] = (int) (Math.random() * 10) + 1;
            }
        }

        // Sumar los valores de la diagonal principal
        for (int i = 0; i < 7; i++) {
            sumaDiagonal += matriz[i][i];
        }

        // Imprimiendo la matriz
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j] + "\t"); // tabulador
            }
            System.out.println(); // salto de linea cada 7
        }
        System.out.println("Suma de la diagonal principal: " + sumaDiagonal);
    }
}
