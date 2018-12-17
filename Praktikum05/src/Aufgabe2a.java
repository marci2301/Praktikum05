
public class Aufgabe2a {
	
	public static int frageInt(String frage, int min, int max){
		
		StdOut.println(frage);
		int x = 0;
		
			do{
				
				x = StdIn.readInt();
			
				if(x>max||x<min)
				StdOut.print("Ausserhalb der Min- oder Maxwerte! Nochmal: ");
			}while(x>max||x<min);
		
		return x;
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
	
	public static int maximum2int(int a, int b)
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
		
		for(int i=0; i<array.length; i++)
		{
			if(max<array[i]){
				max = array[i];
			}
		}
		return max;
	}
	
	public static int [] arrayTausch (int[] array)
	{	
		int [] array2;
		array2 = new int [array.length];
		int count = array.length-1;
		
		for(int i=0; i<array.length; i++)
		{
			array2[count] = array[i];
			count--;
		}
		return array2;
	}
	
	public static int [] frageArray(String frage, int gr)
	{
		StdOut.print(frage);
		gr = StdIn.readInt();
		
		int [] array = new int [gr];
		for(int i=0; i<array.length; i++)
		{
			StdOut.print("Geben Sie die " + (i+1) + ". Zahl ein: ");
			array[i] = StdIn.readInt();
		}
		return array;
}

	public static void main(String[] args) {
		
//		int min = 0;
//		int max = 100;
//		int wert = frageInt("Geben Sie einen Wert ein: ", min, max);

		
//		int anzahl = frageInt("Geben Sie die Anzahl der Zeilen ein: ")
		
		
	}

}
