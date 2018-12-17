public class Aufgabe1a
{
	
	public static void wiederholeZeichen(char zeichen, int anzahl)
	{
		for(int i=0; i<anzahl; i++)
		{
			StdOut.print(zeichen);
		}
	}
	
		public static void main(String[] args) {
			
//			StdOut.print("Welches Zeichen moechten Sie ausgeben? ");
//			char zeichen = StdIn.readChar();
//			StdOut.print("Wie viele Zeichen moechten Sie ausgeben? ");
//			int anzahl = StdIn.readInt();
//			wiederholeZeichen(zeichen,anzahl);
			
			StdOut.print("Wie viele Zeilen soll das Dreieck haben? ");
			int anzahl = StdIn.readInt();
			
			for(int i=0; i<=anzahl; i++){
				wiederholeZeichen(' ', anzahl-i);
				wiederholeZeichen('*', i*2-1);
				StdOut.println("");
			}
			
		}
}