package cyckeCrosower;

public class Main {

	public static void main(String[] args) {
		int[] parent1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] parent2 = { 9, 3, 7, 8, 2, 6, 5, 1, 4 };
		int size = parent1.length;
		int[] copy = new int[size]; 
		int indexOfParent1Position = 0;
		boolean flag = true;

		copy[indexOfParent1Position] = parent1[0];
		for (int i = 1; i < copy.length; i++) {
			if(copy[0] != parent2[indexOfParent1Position]) {
				for (int j = 0; j < parent1.length; j++) {
					if(parent1[j] == parent2[indexOfParent1Position]) {
						copy[j] = parent1[j];
						indexOfParent1Position = j;
					} 
				}
				
			} else {
				flag = false;
				break;
			}
		}
		if(flag == false) {
			for (int i = 0; i < copy.length; i++) {
				if(copy[i] == 0) {
					copy[i] = parent2[i];
				}
			}
		}
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		

	}

}
