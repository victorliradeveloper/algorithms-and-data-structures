function insertionSort(vetor: number[]): number[] {
    const n = vetor.length;

    // Começa do segundo elemento, pois o primeiro já é considerado ordenado
    for (let i = 1; i < n; i++) {
        const chave = vetor[i];
        let j = i - 1;

        // Move os elementos maiores que a chave uma posição à frente
        while (j >= 0 && vetor[j] > chave) {
            vetor[j + 1] = vetor[j];
            j--;
        }

        // Insere a chave na posição correta
        vetor[j + 1] = chave;
    }

    return vetor;
}

const vetor = [12, 11, 13, 5, 6];

console.log("Vetor antes da ordenação:", vetor);
insertionSort(vetor);
console.log("Vetor após a ordenação:", vetor);
