public class InsertionSort {

    // Método que implementa o Insertion Sort
    public static void insertionSort(int[] vetor) {
        int n = vetor.length;

        // Começa do segundo elemento, pois o primeiro já é considerado ordenado
        for (int i = 1; i < n; i++) {
            int chave = vetor[i];
            int j = i - 1;

            // Move os elementos maiores que a chave uma posição à frente
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }

            // Insere a chave na posição correta
            vetor[j + 1] = chave;
        }
    }

    // Método principal para testar o algoritmo
    public static void main(String[] args) {
        int[] vetor = {12, 11, 13, 5, 6};

        System.out.println("Vetor antes da ordenação:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }

        insertionSort(vetor);

        System.out.println("\nVetor após a ordenação:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
