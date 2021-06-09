import java.util.ArrayList;

public class StoogeSort{ 														//Stooge Sort
	static void stoogesort(ArrayList<program> arrayProgram, int l, int piece) 
	{
		if (l >= piece) {
			return;
		}
		if (arrayProgram.get(l).getNumber() > arrayProgram.get(piece).getNumber()){
			int temp = arrayProgram.get(l).getNumber();
			arrayProgram.get(l).setNumber(arrayProgram.get(piece).getNumber());
			arrayProgram.get(piece).setNumber(temp);
			
			String temp2 = arrayProgram.get(l).getLetter();
			arrayProgram.get(l).setLetter(arrayProgram.get(piece).getLetter());
			arrayProgram.get(piece).setLetter(temp2);
		}
		if (piece-l+1 > 2) {
			int t = (piece-l+1) / 3;
			stoogesort(arrayProgram, l, piece-t);
			stoogesort(arrayProgram, l+t, piece);
			stoogesort(arrayProgram, l, piece-t); 
		} 
	}
} 
