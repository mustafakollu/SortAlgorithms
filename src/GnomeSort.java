import java.util.ArrayList;

public class GnomeSort { 														//Gnome Sort
	public static void gnomeSort(ArrayList<program> arrayProgram,int piece) { 
		int index = 0; 
		while (index < piece) { 
			if (index == 0) 
				index++; 
			if (arrayProgram.get(index).getNumber() >= arrayProgram.get(index-1).getNumber()) 
				index++; 
			else { 
				int temp = arrayProgram.get(index).getNumber();
				arrayProgram.get(index).setNumber(arrayProgram.get(index-1).getNumber());
				arrayProgram.get(index-1).setNumber(temp);
				
				String temp2 = arrayProgram.get(index).getLetter();
				arrayProgram.get(index).setLetter(arrayProgram.get(index-1).getLetter());
				arrayProgram.get(index-1).setLetter(temp2);
				index--; 
			} 
		} 
		return; 
	} 
} 
