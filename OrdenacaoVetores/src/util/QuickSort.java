package util;

public class QuickSort {

	public QuickSort() {
		super();
	}
	
	public int [ ] quickSort (int [ ] vet, int in, int fim) {
		if (fim > in) {
			
			int pvfixo = divide(vet, in, fim);
			quickSort(vet, in, pvfixo -1);
			quickSort(vet, pvfixo + 1, fim);
			
		}
		return vet;
	}
	
	private static int divide (int [ ] vet, int in, int fim) {
		int pv = vet[in];
		int pe = in + 1;
		int pd = fim;
		
		while (pe <= pd) {
			
			while (pe <= pd && vet[pe] <= pv) {
				pe += 1;
			}
			
			while (pe <= pd && vet[pd] > pv) {
				pd -= 1;
			}
			
			if (pe <= pd) {
				int tmp = vet[pe];
				vet[pe] = vet[pd];
				vet[pd] = tmp;
				pe++; pd--;
			}
		}
		
		int tmp = vet[in];
		vet[in] = vet[pd];
		vet[pd] = tmp;
		
		return pd;
	}
}
