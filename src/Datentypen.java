import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Datentypen {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		/*
		 * System.out.println("Geben Sie einen Wert ein: "); String eingabe1 =
		 * br.readLine(); int zahl1 = Integer.parseInt(eingabe1);
		 * System.out.println("Das Doppelte der eingegebenen Zahl ist: " + zahl1 * 2);
		 */
		int[] meinArray; // Initialisieren des Arrays
		meinArray = new int[4]; // Festlegen der Größe des Arrays
		meinArray[0] = 44;
		meinArray[1] = 5;
		meinArray[2] = 66;

		// Ausgabe des Arrays, Variante 1
		for (int i = 0; i < 4; i++) {
			System.out.println(meinArray[i]);
		}
		// Ausgabe des Arrays, Variante 2
		System.out.println(Arrays.toString(meinArray)); // Wie eine Liste in Python

		// Kürzere Variante, um ein Array zu erzeugen
		int[] meinArray2 = { 7, 12, 6, 4 };
		System.out.println(Arrays.toString(meinArray2));

		// Strings
		// Zugriff auf ein Zeichen aus einem String
		String str = "Hallo";
		char zeichen = str.charAt(1);
		System.out.println(zeichen);

		// Arraylisten
		ArrayList<Integer> meineArrayList = new ArrayList<>();
		meineArrayList.add(3);
		meineArrayList.add(34);
		meineArrayList.add(8);
		meineArrayList.add(99);
		System.out.println("------------- Arraylist -------------");
		System.out.println("Gesamte Liste: " + meineArrayList);
		System.out.println("Feld 1: " + meineArrayList.get(0));
		System.out.println("Feld 2: " + meineArrayList.get(1));
		System.out.println("Feld 3: " + meineArrayList.get(2));
		System.out.println("Feld 4: " + meineArrayList.get(3));

		// Größe der Arraylist
		int groesse;
		groesse = meineArrayList.size();
		System.out.println("Größe der Arraylist: " + groesse);

		// Sets
		HashSet<Integer> meinSet = new HashSet<>();
		meinSet.add(5);
		meinSet.add(7);
		meinSet.add(9);
		meinSet.add(7); // wird nicht neu hinzugefügt, weil schon in der Liste enthalten.
		System.out.println("Inhalt des Sets: " + meinSet);

	}

}
