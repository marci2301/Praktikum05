
public class Aufgabe2a {
	
	public static int frageInt(String frage) {
		StdOut.println(frage);
		int i = StdIn.readInt();
		return i;
	}
	
	public static int frageInt(String frage, int min, int max){
		
		StdOut.println(frage);
		int i = 0;
		
			do{
				
				i = StdIn.readInt();
			
				if(i>max||i<min)
				StdOut.print("Ausserhalb der Min- oder Maxwerte! Nochmal: ");
			}while(i>max||i<min);
		
		return i;
	}
	
	public static int[] frageInt(String frage, int anzahl){
		StdOut.println(frage);
		
		int[] iarray = new int[anzahl];
		for(int i=0; i<anzahl; i++){
			StdOut.println("Geben sie die " + (i+1) + ". Zahl ein: ");
			int n = StdIn.readInt();
			iarray[i] = n;			
		}
		
		return iarray;
	}
	
	public static int maximum(){
		int[] iarray = frageInt("Geben sie zwei Zahlen ein", 2);
		int max = 0;
		
		if(iarray[0] < iarray[1]){
			StdOut.println(iarray[1] + " ist groesser als " + iarray[0]);
			max = iarray[1];
		}
		if(iarray[0] > iarray[1]){
			StdOut.println(iarray[0] + " ist groesser als " + iarray[1]);
			max = iarray[0];
		}
		else{
			StdOut.println("Die Zahlen sind gleich.");
			max = iarray[0];
		}
		
		return max;
	}
	
	public static int max2int(int a, int b)
	{
		if (a > b)
	       {
				return a;
	       }
	       else
	       {
	    	    return b;
	       }
	}
	
	public static int maxArray(int[] array)
	{
		int max = 0;
		
		for(int i=0; i<array.length-1; i++) {
			max = max2int(array[i], array[i+1]);
		}
		
		return max;
	}
	
	public static int [] arrayTausch (int[] array)
	{			
		int [] array2 = new int [array.length];
		int count = array.length-1;
		
		for(int i=0; i<array.length; i++)
		{
			array2[i] = array[count];
			count--;
		}
		return array2;
	}
	
	public static int [] frageArray(String frage)
	{
		StdOut.print(frage);
		int gr = StdIn.readInt();
		
		int [] array = new int [gr];
		for(int i=0; i<array.length; i++)
		{
			StdOut.print("Geben Sie die " + (i+1) + ". Zahl ein: ");
			array[i] = StdIn.readInt();
		}
		return array;
	}
	
	public static void arrayAusgabe(int[] array) {
		for(int i=0; i<array.length; i++) {
			StdOut.print(array[i] + " ");
		}
		StdOut.println("");
	}

	public static void main(String[] args) {

//		int anzahl = frageInt("Geben Sie die Anzahl der Reihen ein: ");
//		
//		for(int i=1; i<=anzahl; i++){
//			Aufgabe1a.wiederholeZeichen(' ', anzahl-i);
//			Aufgabe1a.wiederholeZeichen('*', i*2-1);
//			StdOut.println("");
//		}
		
//		int [] array = frageArray("Wie gross soll das Array sein?");
//		StdOut.println(maxArray(array));
		
		int [] array = frageArray("Wie gross soll das Array sein?");
		int [] array2 = arrayTausch(array);
		
		arrayAusgabe(array);
		arrayAusgabe(array2);
		
		
		
		
	}

}
