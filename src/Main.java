import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// ***************************************************** TIPI PRIMITIVI ***************************************************************

		boolean b = true;
		// b = 20;
		b = false;

		byte numeroInteroMoltoPiccolo = 10;
		short numeroInteroPiccolo = 1000;
		int numeroIntero = 100000;
		long numeroInteroGrande = 564654;

		//numeroInteroMoltoPiccolo = (byte) numeroInteroGrande; // CASTING ESPLICITO
		// Il casting esplicito è una tecnica di conversione forzata tra 2 formati. Attenzione però
		// che questa tecnica sarà molto utili in alcuni casi, ma in casi come questo invece no, perché sono 2 formati incompatibili quindi
		// finiamo per avere una PERDITA DI DATI

		numeroInteroGrande = numeroInteroMoltoPiccolo; // CASTING IMPLICITO
		// Java effettua una conversione automatica perché i 2 tipi di dato sono compatibili (contenuto piccolo ci sta nella scatola grande)

		System.out.println(numeroInteroGrande);

		// float numeroDecimale = 1.5f;
		double altroNumeroDecimale = 1.5; // Per i numeri decimali andremo ad utilizzare sempre i DOUBLE in quanto i processori moderni sono più
		// efficienti nel fare i calcoli con essi

		numeroIntero = (int) altroNumeroDecimale;

		System.out.println(numeroIntero);

		char carattereSingolo = 'A';

		// ************************************************ STRINGHE ***************************************
		String text = "Hello World!";
		System.out.println(text);
		System.out.println(text.length());
		System.out.println(text.toUpperCase());
		System.out.println(text.charAt(0));

		// ********************************************** METODI ******************************************

		int result = sum(2, 10);
		System.out.println(result);

		printSum(2, 10);

		// ********************************************** ARRAY *******************************************
		String[] stagioni = new String[4];
		stagioni[0] = "Inverno";
		stagioni[1] = "Primavera";
		stagioni[2] = "Estate";
		stagioni[3] = "Autunno";

		String[] stagioni2 = {"Inverno", "Primavera", "Estate", "Autunno"};

		printArray(stagioni);
		printArray(stagioni2);

		// *********************************************** SCANNER ******************************************
		Scanner sc = new Scanner(System.in);

		System.out.println("Ciao dammi il nome");
		String name = sc.nextLine(); // Aspetta che l'utente inserisca una stringa

		System.out.println("Ciao " + name + " benvenuto!");

		System.out.println("Dammi il primo numero intero: ");
		int num1 = Integer.parseInt(sc.nextLine()); // Integer.parseInt converte testo in numero intero

		System.out.println("Dammi il secondo numero intero: ");
		int num2 = Integer.parseInt(sc.nextLine());

		System.out.println("La somma dei numeri inseriti è: " + sum(num1, num2));


	}

	public static int sum(int num1, int num2) {
		return num1 + num2;
	}

	public static void printSum(int num1, int num2) {
		System.out.println("La somma è: " + (num1 + num2));
	}

	public static void printArray(String[] array) {
		System.out.println("Il primo elemento é: " + array[0]);
		System.out.println("Il secondo è: " + array[1]);
		// System.out.println(array[4]);
	}
}
