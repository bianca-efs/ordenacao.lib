package util;

public class BubbleSort {

	public static int[] bubbleSort(int[] vet, int cont) {

	    if (cont == vet.length - 1) {
	        return vet;
	    }

	    for (int pd = 1; pd < vet.length - cont; pd++) {
	        int pe = pd - 1;
	        if (vet[pd] < vet[pe]) {
	            int tmp = vet[pe];
	            vet[pe] = vet[pd];
	            vet[pd] = tmp;
	        }
	    }
	    for (int i = 0; i < vet.length; i++) {
			System.out.print ( " | " + vet [i]);
		}
	    System.out.println("\n======================================================================================");
	    return bubbleSort(vet, cont + 1);
	}
	
}
