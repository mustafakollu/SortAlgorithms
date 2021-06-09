import java.util.ArrayList;

public class BitonicSort {																//Bitonic Sort
	static void compAndSwap(ArrayList<program> arrayProgram, int i, int j, int dir) { 
		if ( (arrayProgram.get(i).getNumber() > arrayProgram.get(j).getNumber() && dir == 1) || (arrayProgram.get(i).getNumber() < arrayProgram.get(j).getNumber() && dir == 0)){ 
			int temp = arrayProgram.get(i).getNumber();
			arrayProgram.get(i).setNumber(arrayProgram.get(j).getNumber());
			arrayProgram.get(j).setNumber(temp);
			
			String temp2 = arrayProgram.get(i).getLetter();
			arrayProgram.get(i).setLetter(arrayProgram.get(j).getLetter());
			arrayProgram.get(j).setLetter(temp2);
		} 
	}
	static void bitonicMerge(ArrayList<program> arrayProgram, int low, int cnt, int dir){ 
		if (cnt>1){ 
			int k = cnt/2; 
			for (int i=low; i<low+k; i++) 
				compAndSwap(arrayProgram,i, i+k, dir); 
			bitonicMerge(arrayProgram,low, k, dir); 
			bitonicMerge(arrayProgram,low+k, k, dir); 
		} 
	}
	static void bitonicSort(ArrayList<program> arrayProgram, int low, int cnt, int dir){ 
		if (cnt>1){ 
			int k = cnt/2;
			bitonicSort(arrayProgram, low, k, 1); 
			bitonicSort(arrayProgram,low+k, k, 0);
			bitonicMerge(arrayProgram, low, cnt, dir); 
		} 
	}
	public static void sort(ArrayList<program> arrayProgram, int piece){
		int up=1;
		bitonicSort(arrayProgram, 0, piece, up); 
	} 
} 
