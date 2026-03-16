package util;

public class MergeSort {
	
	public MergeSort() {
		super ();
	}
	
	public static int [] mergeSort (int [ ] vet, int inicio, int fim) {
		System.out.println("Vetor da posição " + inicio + " até " + fim);
		
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			mergeSort(vet, inicio, meio); // esquerda
			mergeSort(vet, meio + 1, fim); // direita
			intercala(vet, inicio, meio, fim);
		}
		
		return vet;
	}
	
	private static void intercala(int[] vet, int inicio, int meio, int fim) {
		int [ ] nvVet = new int [vet.length];
		
		for (int i = inicio; i <= fim; i++) {
			nvVet[i] = vet[i];
		}
		
		int esq = inicio;
		int dir = meio + 1;
		
		for (int i = inicio; i <= fim; i++) {
			
			if (esq > meio) {
				
				vet[i] = nvVet[dir];
				dir += 1;
				
			} else if (dir > fim) {
				
				vet[i] = nvVet[esq];
				esq += 1;
				
			} else if (nvVet[esq] < nvVet[dir]) {
				
				vet[i] = nvVet[esq];
				esq += 1;
				
			} else {
				
				vet[i] = nvVet[dir];
				dir += 1;
				
			}
		}
	}

	
}
