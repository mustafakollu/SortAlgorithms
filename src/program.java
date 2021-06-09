import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class program {
	private int number;
	private String letter;
	
	public int getNumber() {
		return number;										//Object requirement
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getLetter() {
		return letter;
	}
	public void setLetter(String letter) {
		this.letter = letter;
	}
	
	public program(int number, String letter) {
		super();
		this.number = number;
		this.letter = letter;
	}
	public static void cocktail(ArrayList<program> arrayProgram,int piece,String str) {			//time calculation cocktail sort
		System.out.println("********COCKTAIL SORT********");
		long startTime = System.nanoTime();
		CocktailSort.cocktailSort(arrayProgram, piece);
        long endTime = System.nanoTime();
		System.out.println("Type= "+str+". Size= "+piece+". Time difference: "+(endTime-startTime)+" nanosecond.");
		System.out.println();
	}
	public static void comb(ArrayList<program> arrayProgram,int piece,String str) {				//time calculation comb sort
		System.out.println("********COMB SORT********");
		long startTime = System.nanoTime();
		CombSort.combSort(arrayProgram, piece);
        long endTime = System.nanoTime();
		System.out.println();
		System.out.println("Type= "+str+". Size= "+piece+". Time difference: "+(endTime-startTime)+" nanosecond.");
		System.out.println();
	}
	public static void gnome(ArrayList<program> arrayProgram,int piece,String str) {			//time calculation gnome sort
		System.out.println("********GNOME SORT********");
		long startTime = System.nanoTime();
		GnomeSort.gnomeSort(arrayProgram, piece);
        long endTime = System.nanoTime();
		System.out.println("Type= "+str+". Size= "+piece+". Time difference: "+(endTime-startTime)+" nanosecond.");
		System.out.println();
	}
	public static void stooge(ArrayList<program> arrayProgram,int piece,String str) {			//time calculation stooge sort
		System.out.println("********STOOGE SORT********");
		long startTime = System.nanoTime();
		StoogeSort.stoogesort(arrayProgram, 0, piece-1);
        long endTime = System.nanoTime();
		System.out.println("Type= "+str+". Size= "+piece+". Time difference: "+(endTime-startTime)+" nanosecond.");
		System.out.println();
	}
	public static void bitonic(ArrayList<program> arrayProgram,int piece,String str) {			//time calculation bitonic sort
		System.out.println("********BITONIC SORT********");
		long startTime = System.nanoTime();
		BitonicSort.sort(arrayProgram, piece);
        long endTime = System.nanoTime();
		System.out.println("Type= "+str+". Size= "+piece+". Time difference: "+(endTime-startTime)+" nanosecond.");
		System.out.println();
	}
	public static void reverseArray(ArrayList<program> arrayReverse,int piece) {				//create reverse arraylist
		for(int i=0;i<piece;i++) {
			arrayReverse.add(new program(piece-i,"Reversenumber"+(piece-i)));
		}
	}
	
	public static void randomArray(ArrayList<program> arrayRandom,int piece) {					//create random arraylist
		Integer a[] = new Integer[piece];
		for (int i=0;i<a.length;i++) {
			a[i] = i+1;
		}
		List<Integer> aList = Arrays.asList(a);
		Collections.shuffle(aList);
		aList.toArray(a);
		for(int i=0;i<piece;i++) {
			arrayRandom.add(new program(a[i],"RandomNumber"+a[i]));
		}
	}
	public static void work(int piece) {										//all of functions work here
		ArrayList<program> arrayRandom = new ArrayList<>();
		ArrayList<program> arrayRandom2 = new ArrayList<>();
		ArrayList<program> arrayRandom3 = new ArrayList<>();
		ArrayList<program> arrayRandom4 = new ArrayList<>();
		ArrayList<program> arrayRandom5 = new ArrayList<>();
		ArrayList<program> arrayReverse = new ArrayList<>();
		ArrayList<program> arrayReverse2 = new ArrayList<>();
		ArrayList<program> arrayReverse3 = new ArrayList<>();
		ArrayList<program> arrayReverse4 = new ArrayList<>();
		ArrayList<program> arrayReverse5 = new ArrayList<>();
		
		
		program.reverseArray(arrayReverse,piece);
		program.randomArray(arrayRandom,piece);
		
		for(int i=0;i<piece;i++) {
			arrayRandom2.add(new program(arrayRandom.get(i).getNumber(), arrayRandom.get(i).getLetter()));
			arrayRandom3.add(new program(arrayRandom.get(i).getNumber(), arrayRandom.get(i).getLetter()));
			arrayRandom4.add(new program(arrayRandom.get(i).getNumber(), arrayRandom.get(i).getLetter()));
			arrayRandom5.add(new program(arrayRandom.get(i).getNumber(), arrayRandom.get(i).getLetter()));
		}
		for(int i=0;i<piece;i++) {
			arrayReverse2.add(new program(arrayReverse.get(i).getNumber(), arrayReverse.get(i).getLetter()));
			arrayReverse3.add(new program(arrayReverse.get(i).getNumber(), arrayReverse.get(i).getLetter()));
			arrayReverse4.add(new program(arrayReverse.get(i).getNumber(), arrayReverse.get(i).getLetter()));
			arrayReverse5.add(new program(arrayReverse.get(i).getNumber(), arrayReverse.get(i).getLetter()));
		}
		
		comb(arrayRandom,piece,"Average");
		gnome(arrayRandom2,piece,"Average");
		cocktail(arrayRandom3,piece,"Average");
		stooge(arrayRandom4,piece,"Average");
		bitonic(arrayRandom5,piece,"Average");
		
		comb(arrayReverse,piece,"Worst");
		gnome(arrayReverse2,piece,"Worst");
		cocktail(arrayReverse3,piece,"Worst");
		stooge(arrayReverse4,piece,"Worst");
		bitonic(arrayReverse5,piece,"Worst");
	}
}
