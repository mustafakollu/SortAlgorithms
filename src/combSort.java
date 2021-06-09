import java.util.ArrayList;

class CombSort{								//Comb Sort
	
	static int getNextGap(int gap){
		gap = (gap*10)/13;
		if (gap < 1)
			return 1;
		return gap;
	}
	
	public static void combSort(ArrayList<program> arrayProgram,int piece){
		int n = piece;
		int gap = n;
		boolean swapped = true;
		
		while (gap != 1 || swapped == true){
			gap = getNextGap(gap);
			swapped = false;
			
			for (int i=0; i<n-gap; i++){
				if (arrayProgram.get(i).getNumber() > arrayProgram.get(i+gap).getNumber()){
					int temp = arrayProgram.get(i).getNumber();
					arrayProgram.get(i).setNumber(arrayProgram.get(i+gap).getNumber());
					arrayProgram.get(i+gap).setNumber(temp);
					
					String temp2 = arrayProgram.get(i).getLetter();
					arrayProgram.get(i).setLetter(arrayProgram.get(i+gap).getLetter());
					arrayProgram.get(i+gap).setLetter(temp2);
					swapped = true;
				}
			}
		}
	}
}
