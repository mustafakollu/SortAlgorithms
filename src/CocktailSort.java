import java.util.ArrayList;

public class CocktailSort {														//Cocktail Sort
	public static void cocktailSort(ArrayList<program> arrayProgram,int piece){
		boolean swapped = true;
		int start = 0;
		int end = piece;

		while (swapped == true) {
			swapped = false;
			for (int i = start; i < end - 1; ++i) {
				if (arrayProgram.get(i).getNumber() > arrayProgram.get(i+1).getNumber()) {
					int temp = arrayProgram.get(i).getNumber();
					arrayProgram.get(i).setNumber(arrayProgram.get(i+1).getNumber());
					arrayProgram.get(i+1).setNumber(temp);
					
					String temp2 = arrayProgram.get(i).getLetter();
					arrayProgram.get(i).setLetter(arrayProgram.get(i+1).getLetter());
					arrayProgram.get(i+1).setLetter(temp2);
					swapped = true;
				}
			}
			if (swapped == false)
				break;
			swapped = false;
			end = end - 1;
			for (int i = end - 1; i >= start; i--) {
				if (arrayProgram.get(i).getNumber() > arrayProgram.get(i+1).getNumber()) {
					int temp = arrayProgram.get(i).getNumber();
					arrayProgram.get(i).setNumber(arrayProgram.get(i+1).getNumber());
					arrayProgram.get(i+1).setNumber(temp);
					
					String temp2 = arrayProgram.get(i).getLetter();
					arrayProgram.get(i).setLetter(arrayProgram.get(i+1).getLetter());
					arrayProgram.get(i+1).setLetter(temp2);
					swapped = true;
				}
			}
			start = start + 1;
		}
	}
}
